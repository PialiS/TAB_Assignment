package com.example.appbusinessassignment.model.vikash;

import com.example.appbusinessassignment.model.VikashDemo;

import java.util.List;

/**
 * Created by Vikash on 16-04-2017.
 */

public class Creators {

    private int available;
    private String collectionURI;
    private int returned;

    private List<Items> items;

    public int getAvailable() {
        return available;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public int getReturned() {
        return returned;
    }

    public List<Items> getItems() {
        return items;
    }
}
