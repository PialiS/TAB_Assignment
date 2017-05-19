package com.example.appbusinessassignment.model;

import java.util.List;



 public class Results {

     public void setId(int id) {
         this.id = id;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public void setDescription(Object description) {
         this.description = description;
     }

     public void setPageCount(int pageCount) {
         this.pageCount = pageCount;
     }

     public void setThumbnail(Thumbnail thumbnail) {
         this.thumbnail = thumbnail;
     }

     public void setCreators(Creators creators) {
         this.creators = creators;
     }

     public void setPrices(List<Prices> prices) {
         this.prices = prices;
     }

     private int id;
    private int digitalId;
    private String title;
    private int issueNumber;
    private String variantDescription;
    private Object description;
    private String modified;
    private String isbn;
    private String upc;
    private String diamondCode;
    private String ean;
    private String issn;
    private String format;
    private int pageCount;
    private String resourceURI;
    private Series series;
    private Thumbnail thumbnail;
    private Creators creators;
    private Characters characters;
    private Stories stories;
    private Events events;
    private List<?> textObjects;
    private List<Urls> urls;
    private List<Variant> variants;
    private List<?> collections;
    private List<?> collectedIssues;
    private List<Dates> dates;
    private List<Prices> prices;
    private List<?> images;

    public int getId() {
        return id;
    }

    public int getDigitalId() {
        return digitalId;
    }

    public String getTitle() {
        return title;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getVariantDescription() {
        return variantDescription;
    }

    public Object getDescription() {
        return description;
    }

    public String getModified() {
        return modified;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getUpc() {
        return upc;
    }

    public String getDiamondCode() {
        return diamondCode;
    }

    public String getEan() {
        return ean;
    }

    public String getIssn() {
        return issn;
    }

    public String getFormat() {
        return format;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public Series getSeries() {
        return series;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public Creators getCreators() {
        return creators;
    }

    public Characters getCharacters() {
        return characters;
    }

    public Stories getStories() {
        return stories;
    }

    public Events getEvents() {
        return events;
    }

    public List<?> getTextObjects() {
        return textObjects;
    }

    public List<Urls> getUrls() {
        return urls;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public List<?> getCollections() {
        return collections;
    }

    public List<?> getCollectedIssues() {
        return collectedIssues;
    }

    public List<Dates> getDates() {
        return dates;
    }

    public List<Prices> getPrices() {
        return prices;
    }

    public List<?> getImages() {
        return images;
    }
}
