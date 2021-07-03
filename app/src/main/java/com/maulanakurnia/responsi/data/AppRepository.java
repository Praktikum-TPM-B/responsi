package com.maulanakurnia.responsi.data;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.maulanakurnia.responsi.data.model.Faskes;
import com.maulanakurnia.responsi.data.model.KumulatifHarian;
import com.maulanakurnia.responsi.data.service.ApiService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AppRepository {
    private final ApiService apiService;

    public AppRepository(Application application) {
        apiService = new ApiService();
    }

    public LiveData<ArrayList<KumulatifHarian.Data.Content>> getKumulatif() {
        final MutableLiveData<ArrayList<KumulatifHarian.Data.Content>> kumulatifHarianMutableLiveData = new MutableLiveData<>();

        Call<KumulatifHarian> response = apiService.getApi().getKumulatif();

        response.enqueue(new Callback<KumulatifHarian>() {
            @Override
            public void onResponse(Call<KumulatifHarian> call, Response<KumulatifHarian> response) {
                KumulatifHarian res = response.body();
                if(response.isSuccessful() && response.body() != null) {
                    assert  res != null;
                    kumulatifHarianMutableLiveData.postValue(res.getData().getContent());
                }
            }

            @Override
            public void onFailure(Call<KumulatifHarian> call, Throwable t) {

            }
        });
        return kumulatifHarianMutableLiveData;
    }

    public LiveData<ArrayList<Faskes.Data>> getFaskes() {
        final MutableLiveData<ArrayList<Faskes.Data>> faskesMutableLiveData = new MutableLiveData<>();
        Call<Faskes> response = apiService.getApi().getFaskes("rsrujukan");
        response.enqueue(new Callback<Faskes>() {
            @Override
            public void onResponse(@NonNull Call<Faskes> call, @NonNull Response<Faskes> response) {
                Faskes res = response.body();
                if(response.isSuccessful() && response.body() != null) {
                    assert res != null;
                    faskesMutableLiveData.postValue(res.getData());
                }
            }

            @Override
            public void onFailure(@NonNull Call<Faskes> call, @NonNull Throwable t) {

            }
        });
        return faskesMutableLiveData;
    }
}
