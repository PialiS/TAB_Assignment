package com.example.appbusinessassignment.model;

import java.util.List;

/**
 * Created by Vikash on 16-04-2017.
 * comics response
 */
class Characters {

    private int available;
    private String collectionURI;
    private int returned;
    private List<?> items;

    public int getAvailable() {
        return available;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public int getReturned() {
        return returned;
    }

    public List<?> getItems() {
        return items;
    }
}
