package com.example.appbusinessassignment.model;

import java.util.List;



 class Events {

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
