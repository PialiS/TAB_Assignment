package com.example.appbusinessassignment.model;

import java.util.List;



 class Stories {

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
