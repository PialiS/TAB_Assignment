package com.example.appbusinessassignment.model;

import java.util.List;


 public    class Data {

    private int offset;
    private int limit;
    private int total;
    private int count;

    private List<Results> results;

    public int getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }

    public int getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }

    public List<Results> getResults() {
        return results;
    }
}
