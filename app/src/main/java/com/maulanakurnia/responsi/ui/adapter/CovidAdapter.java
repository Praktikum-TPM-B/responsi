package com.maulanakurnia.responsi.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.maulanakurnia.responsi.R;
import com.maulanakurnia.responsi.data.model.KumulatifHarian;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CovidAdapter extends RecyclerView.Adapter<CovidAdapter.ViewHolder>{

    protected ArrayList<KumulatifHarian.Data.Content> covid = new ArrayList<>();
    protected Context context;

    public CovidAdapter(Context context){
        this.context = context;
    }

    public void setData(ArrayList<KumulatifHarian.Data.Content> items){
        covid.clear();
        covid.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull @NotNull @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_history_covid, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull CovidAdapter.ViewHolder holder, int position) {
        holder.tv_date.setText(String.valueOf(covid.get(position).getTanggal()));
        holder.tv_recover.setText(String.valueOf(covid.get(position).getConfirmation_selesai()));
        holder.tv_dead.setText(String.valueOf(covid.get(position).getConfirmation_meninggal()));
        holder.tv_confirmation.setText(String.valueOf(covid.get(position).getConfirmation()));
    }

    @Override
    public int getItemCount() {
        return covid.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        protected final TextView tv_date, tv_recover, tv_dead, tv_confirmation;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            tv_date         = itemView.findViewById(R.id.tv_date);
            tv_recover      = itemView.findViewById(R.id.tv_recover);
            tv_dead         = itemView.findViewById(R.id.tv_dead);
            tv_confirmation = itemView.findViewById(R.id.tv_confirmation);
        }
    }
}
