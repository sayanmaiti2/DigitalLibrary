package com.sayan.digitallibrary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewspaperAdapter extends RecyclerView.Adapter<NewspaperAdapter.ViewHolder> {

    private final Item item;

    public NewspaperAdapter() {
        item = new Item();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.newspaper_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewspaperAdapter.ViewHolder holder, int position) {
        holder.newsDate.setText(item.getDate(position));
    }

    @Override
    public int getItemCount() {
        return item.getDateCount();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView newsDate;

        public ViewHolder(View itemView){
            super(itemView);

            newsDate = itemView.findViewById(R.id.news_date);
        }
    }


}
