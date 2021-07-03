package com.maulanakurnia.responsi.data.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {
    private Retrofit retrofit;

    public ApiEndPoint getApi() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl("https://covid19-public.digitalservice.id/api/v1/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(ApiEndPoint.class);
    }
}
