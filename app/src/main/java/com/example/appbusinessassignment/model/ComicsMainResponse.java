package com.example.appbusinessassignment.model;

import com.example.appbusinessassignment.model.Data;

/**
 * Created by Vikash on 16-04-2017.
 */

public class ComicsMainResponse {

    private int code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private String etag;
    private Data data;

    public Data getData() {
        return data;
    }

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public String getEtag() {
        return etag;
    }
}
