package com.google.cloud.android.speech;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;
import com.google.cloud.android.speech.Model.ClassifyData;
import com.google.cloud.android.speech.Model.ClassifyResponse;
import com.google.cloud.android.speech.Model.Data;
import com.google.cloud.android.speech.Model.DocumentSentiment;
import com.google.cloud.android.speech.Network.ApiService;
import com.google.cloud.android.speech.Network.RetrofitInstance;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Kevin on 11/02/18.
 */

public class AnalysisActivity extends AppCompatActivity {

    String text_data;
    long time_elapsed;
    int final_score = 0;
    String classifiedText;

    ApiService apiService;
    Context context;
    TextView text1;
    RoundCornerProgressBar progressNegative;
    RoundCornerProgressBar progressPositive;
    TextView negText;
    TextView posText;
    TextView timeDuration;
    SharedPreferences sharedPref;
    TextView classify;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        ButterKnife.bind(this);
        apiService = RetrofitInstance.getRetrofit().create(ApiService.class);
        context = this;
        text1 = (TextView) findViewById(R.id.text1);
        negText = (TextView) findViewById(R.id.negText);
        posText = (TextView) findViewById(R.id.posText);
        sharedPref = getPreferences(Context.MODE_PRIVATE);
        classify = (TextView) findViewById(R.id.classify);
        timeDuration = (TextView) findViewById(R.id.time_duration);
        progressPositive = (RoundCornerProgressBar) findViewById(R.id.progressPositive);
        progressNegative = (RoundCornerProgressBar) findViewById(R.id.progressNegative);

        fetchDataFromPersistence();
    }

    private void fetchDataFromPersistence() {

        Intent intent = getIntent();
        text_data = intent.getExtras().getString("text_data");
        time_elapsed = intent.getExtras().getLong("time_duration", 0);
        time_elapsed /= 1000;

        if (time_elapsed != 0) {
            final Handler handler = new Handler();
            handler.post(new Runnable() {
                @Override
                public void run() {
                    float newValue = Float.parseFloat(timeDuration.getText().toString().split(" ")[0]) + 1;
                    if (newValue <= time_elapsed) {
                        timeDuration.setText(Float.toString(newValue) + " secs");
                        handler.postDelayed(this, 30);
                    }
                }
            });
        }


        if (text_data != null) {
            postDataToGCP();
        }
    }

    private void postDataToGCP() {

        Data data = new Data("UTF8", new Data.DocumentBean("PLAIN_TEXT", text_data));

        if (RetrofitInstance.isOnline(this)) {
            apiService.postDataToGCP(data).enqueue(new Callback<DocumentSentiment>() {
                @Override
                public void onResponse(Call<DocumentSentiment> call, Response<DocumentSentiment> response) {
                    if (response.isSuccessful()) {
                        final DocumentSentiment sentiment = response.body();
                        text1.setText("Sentiment Analysis");

                        //Calculate the increment in progress each time bus passes a stop.
                        final int max_points = 100;
                        final int increment = max_points / 50;

                        progressNegative.setProgress(0.0f);
                        progressPositive.setProgress(0.0f);

                        //Max % of progress
                        progressPositive.setMax(100.0f);
                        progressNegative.setMax(100.0f);

                        final float score = (float) Math.abs((sentiment.getDocumentSentiment().getScore() * 100));
                        final_score = (int) Math.abs((sentiment.getDocumentSentiment().getScore() * 100));

                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putFloat("sentiment", score);
                        editor.commit();


                        if ((float) ((sentiment.getDocumentSentiment().getScore())) > 0) {
                            //Update the progress
                            posText.setText(Float.toString(score));
                            if (progressPositive != null) {
                                final Handler handler = new Handler();
                                handler.post(new Runnable() {
                                    @Override
                                    public void run() {
                                        float newValue = (progressPositive.getProgress() + increment);
                                        if (newValue <= score) {
                                            progressPositive.setProgress(newValue);
                                            handler.postDelayed(this, 25);
                                        }
                                    }
                                });
                            }
                        } else {
                            negText.setText(Float.toString(score));
                            //Update the progress on each flag_pos update
                            if (progressNegative != null) {
                                final Handler handler = new Handler();
                                handler.post(new Runnable() {
                                    @Override
                                    public void run() {
                                        float newValue = (progressNegative.getProgress() + increment);
                                        if (newValue <= score) {
                                            progressNegative.setProgress(newValue);
                                            handler.postDelayed(this, 25);
                                        }
                                    }
                                });
                            }
                        }

                    }
                }

                @Override
                public void onFailure(Call<DocumentSentiment> call, Throwable t) {
                    Toast.makeText(context, "Failed!", Toast.LENGTH_SHORT).show();
                }
            });

            postClassifyToGCP();

        } else {
            Toast.makeText(context, "Not Connected!", Toast.LENGTH_SHORT).show();
        }

    }

    private void postClassifyToGCP() {
        final ClassifyData classifyData = new ClassifyData(new ClassifyData.DocumentBean("PLAIN_TEXT", text_data));
        if (RetrofitInstance.isOnline(this)) {

            apiService.postClassifyToGCP(classifyData).enqueue(new Callback<ClassifyResponse>() {
                @Override
                public void onResponse(Call<ClassifyResponse> call, Response<ClassifyResponse> response) {
                    if (response.isSuccessful()) {
                        ClassifyResponse sentiment = response.body();
                        //res = response.body();
                        try {
                            if (sentiment.getCategories().get(0).getName() != null) {
                                classifiedText = (sentiment.getCategories().get(0).getName() != null ?
                                        sentiment.getCategories().get(0).getName() : "No Classification Found!");
                                classify.setText(classifiedText);
                                SharedPreferences.Editor editor = sharedPref.edit();
                                editor.putString("classify_content", classifiedText);
                                editor.commit();

                            }

                        } catch (NullPointerException | IndexOutOfBoundsException e) {
                            classify.setText("-");
                        }

                    } else {
                        classify.setText("Not sufficient data!");
                    }
                    addDataToFirebase();
                }

                @Override
                public void onFailure(Call<ClassifyResponse> call, Throwable t) {
                    Toast.makeText(context, "Failed!", Toast.LENGTH_SHORT).show();
                }
            });


        } else {
            Toast.makeText(context, "Not Connected!", Toast.LENGTH_SHORT).show();
        }

    }

    private void addDataToFirebase() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Users").child(Integer.toString((int) Math.ceil(Math.random() * 10000)));
        if (myRef != null) {
            Map<String, Object> transportStatus = new HashMap<>();
            transportStatus.put("time_duration", time_elapsed);

            SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
            float senit = sharedPref.getFloat("sentiment", 0);
            String classify = sharedPref.getString("classify_content", "");

            transportStatus.put("sentiment", senit);
            transportStatus.put("classify_content", classify);
            myRef.setValue(transportStatus);
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
