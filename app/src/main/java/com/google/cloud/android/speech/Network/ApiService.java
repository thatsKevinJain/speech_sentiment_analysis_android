package com.google.cloud.android.speech.Network;

import com.google.cloud.android.speech.Model.ClassifyData;
import com.google.cloud.android.speech.Model.ClassifyResponse;
import com.google.cloud.android.speech.Model.Data;
import com.google.cloud.android.speech.Model.DocumentSentiment;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiService {
    @Headers("Content-Type: application/json")
    @POST(URL.GOOGLE_CLOUD_SENTI)
    Call<DocumentSentiment> postDataToGCP(@Body Data data);

    @Headers("Content-Type: application/json")
    @POST(URL.GOOGLE_CLASSIFY_TEXT)
    Call<ClassifyResponse> postClassifyToGCP(@Body ClassifyData data);


}
