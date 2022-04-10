package com.lilianbittar.list;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class celebrityAdapter extends RecyclerView.Adapter<celebrityAdapter.ViewHandler> {
    List<celebrity> celebrities;
    celebrityAdapter.OnListItemClickListener listener;

    public celebrityAdapter(List<celebrity> celebrities, celebrityAdapter.OnListItemClickListener listener) {
        this.celebrities = celebrities;
        this.listener = listener;
    }

    @NonNull
    @Override
    public celebrityAdapter.ViewHandler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.celebrity, parent, false);
        return new ViewHandler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull celebrityAdapter.ViewHandler holder, int position) {
     holder.name.setText(celebrities.get(position).getName());
     holder.icon.setImageResource(celebrities.get(position).getImage());
     holder.itemView.setBackgroundColor(celebrities.get(position).getGender() == 'm' ? Color.parseColor("#0000FF") : Color.parseColor("#FFC0CB"));
     holder.name.setBackgroundColor(celebrities.get(position).getGender() == 'm' ? Color.parseColor("#0000FF") : Color.parseColor("#FFC0CB"));
    }

    @Override
    public int getItemCount() {
        return celebrities.size();
    }

    public class ViewHandler extends RecyclerView.ViewHolder {
        TextView name;
        ImageView icon;

        public ViewHandler(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name1);
            icon = itemView.findViewById(R.id.name1_icon);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(getAdapterPosition());
                }
            });
        }
    }
    public interface OnListItemClickListener{
        void onClick(int position);
    }


}
