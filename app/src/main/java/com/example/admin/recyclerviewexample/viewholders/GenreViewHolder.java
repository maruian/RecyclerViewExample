package com.example.admin.recyclerviewexample.viewholders;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;
import com.example.admin.recyclerviewexample.R;

/**
 * Created by admin on 28/02/2018.
 */

public class GenreViewHolder extends GroupViewHolder {

    private TextView genreTitle;

    public GenreViewHolder(View itemView) {
        super(itemView);
        genreTitle = (TextView)itemView.findViewById(R.id.list_item_genre_name);
    }

    public void setGenreTitle(String name){
        genreTitle.setText(name);
    }
}
