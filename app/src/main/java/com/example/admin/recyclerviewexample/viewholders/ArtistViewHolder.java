package com.example.admin.recyclerviewexample.viewholders;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;
import com.example.admin.recyclerviewexample.R;

/**
 * Created by admin on 28/02/2018.
 */

public class ArtistViewHolder extends ChildViewHolder {
    private TextView artistName;

    public ArtistViewHolder(View itemView) {
        super(itemView);
        artistName = (TextView)itemView.findViewById(R.id.list_item_artist_name);
    }

    public void setArtistName(String name){
        artistName.setText(name);
    }
}
