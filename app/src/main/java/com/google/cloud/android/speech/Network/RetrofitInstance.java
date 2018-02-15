package com.google.cloud.android.speech.Network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    public static Retrofit getRetrofit() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();
                        request = request.newBuilder()
                                .method(request.method(), request.body())
                                .build();
                        Log.d(RetrofitInstance.class.getCanonicalName().toString(),
                                "intercept: " + request.method() + " url: " + request.url());
                        return chain.proceed(request);
                    }
                }).build();

        return new Retrofit.Builder()
                .baseUrl(URL.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    public static boolean isOnline(Context context) {
        boolean result = false;
        try {
            if (context != null) {
                ConnectivityManager cm = (ConnectivityManager) context.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netInfo = cm.getActiveNetworkInfo();
                result = netInfo != null && netInfo.isConnectedOrConnecting();
                if (!result) {
                    Toast.makeText(context, "Not Connected to internet", Toast.LENGTH_LONG).show();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return result;
        }
    }

}
