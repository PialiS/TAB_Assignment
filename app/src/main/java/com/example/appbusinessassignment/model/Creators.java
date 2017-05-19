package com.example.appbusinessassignment.model;

import java.util.List;



public class Creators {

    private int available;
    private String collectionURI;
    private int returned;

    public void setItems(List<Items> items) {
        this.items = items;
    }

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
