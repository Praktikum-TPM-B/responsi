package com.maulanakurnia.responsi.data.service;

import com.maulanakurnia.responsi.data.model.Faskes;
import com.maulanakurnia.responsi.data.model.KumulatifHarian;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiEndPoint {
    @GET("rekapitulasi_v2/jabar/harian")
    Call<KumulatifHarian> getKumulatif();

    @GET("sebaran_v2/jabar/faskes")
    Call<Faskes> getFaskes(
            @Query("tipe") String tipe
    );
}
