package com.maulanakurnia.responsi.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.maulanakurnia.responsi.R;
import com.maulanakurnia.responsi.data.model.Faskes;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class FaskesAdapter extends RecyclerView.Adapter<FaskesAdapter.ViewHolder> {
    protected ArrayList<Faskes.Data> faskes = new ArrayList<>();
    protected Context context;

    public FaskesAdapter(Context context){
        this.context = context;
    }

    public void setData(ArrayList<Faskes.Data> items){
        faskes.clear();
        faskes.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull @NotNull @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_faskes, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull FaskesAdapter.ViewHolder holder, int position) {
        holder.tv_title.setText(faskes.get(position).getNama());
        holder.tv_address.setText(faskes.get(position).getAlamat());
        holder.btn_maps.setOnClickListener(v -> {
            Uri gmmIntentUri = Uri.parse(
                    "geo:"+ faskes.get(position).getLatitude() +
                    "," + faskes.get(position).getLongitude() +
                    "q="+faskes.get(position).getNama());
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            context.startActivity(mapIntent);
        });
    }

    @Override
    public int getItemCount() {
        return faskes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        protected final TextView tv_title, tv_address;
        protected final Button btn_maps;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            tv_title        = itemView.findViewById(R.id.tv_title);
            tv_address      = itemView.findViewById(R.id.tv_address);
            btn_maps        = itemView.findViewById(R.id.btn_maps);
        }
    }
}
