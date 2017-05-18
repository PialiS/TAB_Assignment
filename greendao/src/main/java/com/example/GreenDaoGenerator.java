package com.example;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class GreenDaoGenerator {

    public static void main(String[] args) throws Exception {

        int DB_VERSION = 2;
        String DB_PACKAGE_NAME = "com.example.appbusinessassignment.database";

        Schema schema = new Schema(DB_VERSION, DB_PACKAGE_NAME);

        /*
         * This is the table name for the Sign In data
         * title, description, page count, price and authors and image
         */
        Entity comicData = schema.addEntity("comicData");
        comicData.addIntProperty("id");
        comicData.addStringProperty("title");
        comicData.addStringProperty("description");
        comicData.addIntProperty("pageCount");
        comicData.addDoubleProperty("price");
        comicData.addStringProperty("author");
        comicData.addStringProperty("image");
        comicData.addStringProperty("imageExtension");

        /*
         * This is the table name for the Sign In data
         * title, description, page count, price and authors and image
         */
        Entity minMaxData = schema.addEntity("minmaxData");
        minMaxData.addDoubleProperty("minPrice");
        minMaxData.addDoubleProperty("maxPrice");


        DaoGenerator daoGenerator = new DaoGenerator();
        daoGenerator.generateAll(schema, "./app/src/main/java");
    }
}
