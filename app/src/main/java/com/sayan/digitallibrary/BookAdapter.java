package com.sayan.digitallibrary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    private final Item item;

    public BookAdapter() {
        item = new Item();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.book_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  BookAdapter.ViewHolder holder, int position) {
        holder.book_name.setText(item.getBook(position));
        holder.author_name.setText(item.getAuthor(position));
    }

    @Override
    public int getItemCount() {
        return item.getBookCount();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView book_name, author_name;

        public ViewHolder(View itemView){
            super(itemView);

            book_name = itemView.findViewById(R.id.book_name);
            author_name = itemView.findViewById(R.id.author_name);
        }
    }


}


