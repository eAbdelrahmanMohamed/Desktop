package com.example.application;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {

   public List<order> dataList;

    public DataAdapter(List<order> list){
        dataList = list;
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.layout_narrow_topics, parent, false);
        return new DataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        order data = dataList.get(position);
        holder.tvCity.setText(data.mealname);
        holder.tvEmail.setText(data.detail);
        holder.tvCity.setText(data.price);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder{
        TextView tvName, tvEmail, tvCity;
        public DataViewHolder(View itemView){
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.name);
            tvEmail = (TextView) itemView.findViewById(R.id.email);
            tvCity = (TextView) itemView.findViewById(R.id.city);
        }
    }
}
