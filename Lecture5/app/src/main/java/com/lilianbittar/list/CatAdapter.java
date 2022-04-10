package com.lilianbittar.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.ViewHolder> {

    List<Cat> cats;
    OnListItemClickListener listener;

    public CatAdapter(List<Cat> cats, OnListItemClickListener listener){
        this.cats = cats;
        this.listener= listener;
    }

    @NonNull
    @Override
    public CatAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cat_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatAdapter.ViewHolder holder, int position) {
        holder.name.setText(cats.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return cats.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView icon;

         public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(getAdapterPosition());
                }
            });
            name = itemView.findViewById(R.id.name);
            icon = itemView.findViewById(R.id.name_icon);
        }
    }

    public interface OnListItemClickListener{
        void onClick(int position);
    }
}
