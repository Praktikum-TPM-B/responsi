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
import com.maulanakurnia.responsi.ui.adapter.FaskesAdapter;

public class FaskesFragment extends Fragment {
    protected RecyclerView recyclerView;
    protected FaskesAdapter adapter;
    protected ViewModel viewModel;

    protected FaskesFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_faskes,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViews(view);
        initRecycleView();
        onObserverAnyChange();
    }

    private void initViews(@NonNull View view) {
        recyclerView  = view.findViewById(R.id.rv_faskes);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        viewModel     = new ViewModelProvider(this).get(ViewModel.class);
    }

    private void initRecycleView() {
        adapter  = new FaskesAdapter(getContext());

        recyclerView.setAdapter(adapter);
    }

    private void onObserverAnyChange() {
        adapter.notifyDataSetChanged();
        viewModel.getFaskes().observe(getViewLifecycleOwner(), data -> {
            if(data != null)
                adapter.setData(data);
        });
    }
}
