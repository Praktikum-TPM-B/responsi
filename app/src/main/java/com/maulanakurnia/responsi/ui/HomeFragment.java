package com.maulanakurnia.responsi.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.maulanakurnia.responsi.R;
import com.maulanakurnia.responsi.data.model.KumulatifHarian;
import com.maulanakurnia.responsi.ui.adapter.CovidAdapter;

import java.util.Comparator;
import java.util.Date;

public class HomeFragment extends Fragment {

    protected RecyclerView recyclerView;
    protected CovidAdapter adapter;
    protected ViewModel viewModel;

    protected HomeFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViews(view);
        initRecycleView();
        onObserverAnyChange();
    }

    private void initViews(@NonNull View view) {
        recyclerView  = view.findViewById(R.id.rv_covid);
        viewModel     = new ViewModelProvider(this).get(ViewModel.class);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    private void initRecycleView() {
        adapter  = new CovidAdapter(getContext());

        recyclerView.setAdapter(adapter);
    }

    private void onObserverAnyChange() {
        adapter.notifyDataSetChanged();
        viewModel.getKumulatifHarian().observe(getViewLifecycleOwner(), data -> {
            if(data != null)
                data.sort((o1, o2) -> o1.getTanggal().compareTo(o2.getTanggal()));
                adapter.setData(data);
        });
    }
}
