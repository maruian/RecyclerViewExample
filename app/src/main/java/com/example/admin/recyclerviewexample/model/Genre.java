package com.example.admin.recyclerviewexample.model;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by admin on 28/02/2018.
 */

public class Genre extends ExpandableGroup {
    public Genre(String title, List items) {
        super(title, items);
    }
}
