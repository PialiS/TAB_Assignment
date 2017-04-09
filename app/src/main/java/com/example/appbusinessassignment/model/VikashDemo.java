package com.example.appbusinessassignment.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vikash on 09-04-2017.
 */

public class VikashDemo {


    /**
     * code : 200
     * status : Ok
     * copyright : © 2017 MARVEL
     * attributionText : Data provided by Marvel. © 2017 MARVEL
     * attributionHTML : <a href="http://marvel.com">Data provided by Marvel. © 2017 MARVEL</a>
     * etag : 8792dccd39d1d60bd83d5ef31ff0b3c65d2a4323
     * data : {"offset":0,"limit":2,"total":39261,"count":2,"results":[{"id":59555,"digitalId":0,"title":"Squadron Supreme (2015) #9 (Frison Mighty Men Variant)","issueNumber":9,"variantDescription":"Frison Mighty Men Variant","description":null,"modified":"2016-07-15T16:47:08-0400","isbn":"","upc":"75960608316900921","diamondCode":"","ean":"","issn":"","format":"Comic","pageCount":40,"textObjects":[],"resourceURI":"http://gateway.marvel.com/v1/public/comics/59555","urls":[{"type":"detail","url":"http://marvel.com/comics/issue/59555/squadron_supreme_2015_9_frison_mighty_men_variant/frison_mighty_men_variant?utm_campaign=apiRef&utm_source=54306733de0f5cd1418aa05a85fa062a"}],"series":{"resourceURI":"http://gateway.marvel.com/v1/public/series/20517","name":"Squadron Supreme (2015 - Present)"},"variants":[{"resourceURI":"http://gateway.marvel.com/v1/public/comics/55747","name":"Squadron Supreme (2015) #9"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/60115","name":"Squadron Supreme (2015) #9 (Christopher Action Figure Variant)"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/60139","name":"Squadron Supreme (2015) #9 (Young Variant)"}],"collections":[],"collectedIssues":[],"dates":[{"type":"onsaleDate","date":"2016-07-20T00:00:00-0400"},{"type":"focDate","date":"2016-07-05T00:00:00-0400"}],"prices":[{"type":"printPrice","price":4.99}],"thumbnail":{"path":"http://i.annihil.us/u/prod/marvel/i/mg/b/40/image_not_available","extension":"jpg"},"images":[],"creators":{"available":2,"collectionURI":"http://gateway.marvel.com/v1/public/comics/59555/creators","items":[{"resourceURI":"http://gateway.marvel.com/v1/public/creators/11092","name":"Jenny Frison","role":"penciller (cover)"},{"resourceURI":"http://gateway.marvel.com/v1/public/creators/12456","name":"Katie Kubert","role":"editor"}],"returned":2},"characters":{"available":0,"collectionURI":"http://gateway.marvel.com/v1/public/comics/59555/characters","items":[],"returned":0},"stories":{"available":2,"collectionURI":"http://gateway.marvel.com/v1/public/comics/59555/stories","items":[{"resourceURI":"http://gateway.marvel.com/v1/public/stories/129616","name":"cover from Squadron Supreme (2015) #9 (TBD ARTIST MOP VARIANT)","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/129617","name":"story from Squadron Supreme (2015) #9 (TBD ARTIST MOP VARIANT)","type":"interiorStory"}],"returned":2},"events":{"available":0,"collectionURI":"http://gateway.marvel.com/v1/public/comics/59555/events","items":[],"returned":0}},{"id":20956,"digitalId":0,"title":"Penance: Relentless (2008)","issueNumber":0,"variantDescription":"","description":"From the pages of CIVIL WAR: FRONT LINE and THUNDERBOLTS! Once he was a hero, now only a shell of Robbie Baldwin remains. As Penance, he begins a slow descent into madness: the most hated man in America, blamed for the disaster at Stamford, tortured by visions of his failure and obsessed with strange, seemingly meaningless numbers. A relentless pursuit begins... Collecting PENANCE: RELENTLESS #1-5.\r<br>Rated T+ ...$13.99\r<br>","modified":"-0001-11-30T00:00:00-0500","isbn":"","upc":"","diamondCode":"","ean":"","issn":"","format":"Comic","pageCount":0,"textObjects":[{"type":"issue_solicit_text","language":"en-us","text":"From the pages of CIVIL WAR: FRONT LINE and THUNDERBOLTS! Once he was a hero, now only a shell of Robbie Baldwin remains. As Penance, he begins a slow descent into madness: the most hated man in America, blamed for the disaster at Stamford, tortured by visions of his failure and obsessed with strange, seemingly meaningless numbers. A relentless pursuit begins... Collecting PENANCE: RELENTLESS #1-5.\r<br>Rated T+ ...$13.99\r<br>"}],"resourceURI":"http://gateway.marvel.com/v1/public/comics/20956","urls":[{"type":"detail","url":"http://marvel.com/comics/issue/20956/penance_relentless_2008?utm_campaign=apiRef&utm_source=54306733de0f5cd1418aa05a85fa062a"}],"series":{"resourceURI":"http://gateway.marvel.com/v1/public/series/4070","name":"Penance: Relentless (2008)"},"variants":[],"collections":[],"collectedIssues":[],"dates":[{"type":"onsaleDate","date":"2029-12-31T00:00:00-0500"},{"type":"focDate","date":"-0001-11-30T00:00:00-0500"}],"prices":[{"type":"printPrice","price":0}],"thumbnail":{"path":"http://i.annihil.us/u/prod/marvel/i/mg/9/90/4bb860a46f58d","extension":"jpg"},"images":[{"path":"http://i.annihil.us/u/prod/marvel/i/mg/9/90/4bb860a46f58d","extension":"jpg"}],"creators":{"available":2,"collectionURI":"http://gateway.marvel.com/v1/public/comics/20956/creators","items":[{"resourceURI":"http://gateway.marvel.com/v1/public/creators/222","name":"Paul Gulacy","role":"penciller (cover)"},{"resourceURI":"http://gateway.marvel.com/v1/public/creators/55","name":"Paul Jenkins","role":"writer"}],"returned":2},"characters":{"available":0,"collectionURI":"http://gateway.marvel.com/v1/public/comics/20956/characters","items":[],"returned":0},"stories":{"available":2,"collectionURI":"http://gateway.marvel.com/v1/public/comics/20956/stories","items":[{"resourceURI":"http://gateway.marvel.com/v1/public/stories/45155","name":"Cover #45155","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/45156","name":"Interior #45156","type":"interiorStory"}],"returned":2},"events":{"available":0,"collectionURI":"http://gateway.marvel.com/v1/public/comics/20956/events","items":[],"returned":0}}]}
     */

    private int code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private String etag;
    /**
     * offset : 0
     * limit : 2
     * total : 39261
     * count : 2
     * results : [{"id":59555,"digitalId":0,"title":"Squadron Supreme (2015) #9 (Frison Mighty Men Variant)","issueNumber":9,"variantDescription":"Frison Mighty Men Variant","description":null,"modified":"2016-07-15T16:47:08-0400","isbn":"","upc":"75960608316900921","diamondCode":"","ean":"","issn":"","format":"Comic","pageCount":40,"textObjects":[],"resourceURI":"http://gateway.marvel.com/v1/public/comics/59555","urls":[{"type":"detail","url":"http://marvel.com/comics/issue/59555/squadron_supreme_2015_9_frison_mighty_men_variant/frison_mighty_men_variant?utm_campaign=apiRef&utm_source=54306733de0f5cd1418aa05a85fa062a"}],"series":{"resourceURI":"http://gateway.marvel.com/v1/public/series/20517","name":"Squadron Supreme (2015 - Present)"},"variants":[{"resourceURI":"http://gateway.marvel.com/v1/public/comics/55747","name":"Squadron Supreme (2015) #9"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/60115","name":"Squadron Supreme (2015) #9 (Christopher Action Figure Variant)"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/60139","name":"Squadron Supreme (2015) #9 (Young Variant)"}],"collections":[],"collectedIssues":[],"dates":[{"type":"onsaleDate","date":"2016-07-20T00:00:00-0400"},{"type":"focDate","date":"2016-07-05T00:00:00-0400"}],"prices":[{"type":"printPrice","price":4.99}],"thumbnail":{"path":"http://i.annihil.us/u/prod/marvel/i/mg/b/40/image_not_available","extension":"jpg"},"images":[],"creators":{"available":2,"collectionURI":"http://gateway.marvel.com/v1/public/comics/59555/creators","items":[{"resourceURI":"http://gateway.marvel.com/v1/public/creators/11092","name":"Jenny Frison","role":"penciller (cover)"},{"resourceURI":"http://gateway.marvel.com/v1/public/creators/12456","name":"Katie Kubert","role":"editor"}],"returned":2},"characters":{"available":0,"collectionURI":"http://gateway.marvel.com/v1/public/comics/59555/characters","items":[],"returned":0},"stories":{"available":2,"collectionURI":"http://gateway.marvel.com/v1/public/comics/59555/stories","items":[{"resourceURI":"http://gateway.marvel.com/v1/public/stories/129616","name":"cover from Squadron Supreme (2015) #9 (TBD ARTIST MOP VARIANT)","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/129617","name":"story from Squadron Supreme (2015) #9 (TBD ARTIST MOP VARIANT)","type":"interiorStory"}],"returned":2},"events":{"available":0,"collectionURI":"http://gateway.marvel.com/v1/public/comics/59555/events","items":[],"returned":0}},{"id":20956,"digitalId":0,"title":"Penance: Relentless (2008)","issueNumber":0,"variantDescription":"","description":"From the pages of CIVIL WAR: FRONT LINE and THUNDERBOLTS! Once he was a hero, now only a shell of Robbie Baldwin remains. As Penance, he begins a slow descent into madness: the most hated man in America, blamed for the disaster at Stamford, tortured by visions of his failure and obsessed with strange, seemingly meaningless numbers. A relentless pursuit begins... Collecting PENANCE: RELENTLESS #1-5.\r<br>Rated T+ ...$13.99\r<br>","modified":"-0001-11-30T00:00:00-0500","isbn":"","upc":"","diamondCode":"","ean":"","issn":"","format":"Comic","pageCount":0,"textObjects":[{"type":"issue_solicit_text","language":"en-us","text":"From the pages of CIVIL WAR: FRONT LINE and THUNDERBOLTS! Once he was a hero, now only a shell of Robbie Baldwin remains. As Penance, he begins a slow descent into madness: the most hated man in America, blamed for the disaster at Stamford, tortured by visions of his failure and obsessed with strange, seemingly meaningless numbers. A relentless pursuit begins... Collecting PENANCE: RELENTLESS #1-5.\r<br>Rated T+ ...$13.99\r<br>"}],"resourceURI":"http://gateway.marvel.com/v1/public/comics/20956","urls":[{"type":"detail","url":"http://marvel.com/comics/issue/20956/penance_relentless_2008?utm_campaign=apiRef&utm_source=54306733de0f5cd1418aa05a85fa062a"}],"series":{"resourceURI":"http://gateway.marvel.com/v1/public/series/4070","name":"Penance: Relentless (2008)"},"variants":[],"collections":[],"collectedIssues":[],"dates":[{"type":"onsaleDate","date":"2029-12-31T00:00:00-0500"},{"type":"focDate","date":"-0001-11-30T00:00:00-0500"}],"prices":[{"type":"printPrice","price":0}],"thumbnail":{"path":"http://i.annihil.us/u/prod/marvel/i/mg/9/90/4bb860a46f58d","extension":"jpg"},"images":[{"path":"http://i.annihil.us/u/prod/marvel/i/mg/9/90/4bb860a46f58d","extension":"jpg"}],"creators":{"available":2,"collectionURI":"http://gateway.marvel.com/v1/public/comics/20956/creators","items":[{"resourceURI":"http://gateway.marvel.com/v1/public/creators/222","name":"Paul Gulacy","role":"penciller (cover)"},{"resourceURI":"http://gateway.marvel.com/v1/public/creators/55","name":"Paul Jenkins","role":"writer"}],"returned":2},"characters":{"available":0,"collectionURI":"http://gateway.marvel.com/v1/public/comics/20956/characters","items":[],"returned":0},"stories":{"available":2,"collectionURI":"http://gateway.marvel.com/v1/public/comics/20956/stories","items":[{"resourceURI":"http://gateway.marvel.com/v1/public/stories/45155","name":"Cover #45155","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/45156","name":"Interior #45156","type":"interiorStory"}],"returned":2},"events":{"available":0,"collectionURI":"http://gateway.marvel.com/v1/public/comics/20956/events","items":[],"returned":0}}]
     */

    private DataBean data;

    public static List<VikashDemo> arrayVikashDemoFromData(String str) {

        Type listType = new TypeToken<ArrayList<VikashDemo>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<VikashDemo> arrayVikashDemoFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<VikashDemo>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public void setAttributionText(String attributionText) {
        this.attributionText = attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public void setAttributionHTML(String attributionHTML) {
        this.attributionHTML = attributionHTML;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private int offset;
        private int limit;
        private int total;
        private int count;
        /**
         * id : 59555
         * digitalId : 0
         * title : Squadron Supreme (2015) #9 (Frison Mighty Men Variant)
         * issueNumber : 9
         * variantDescription : Frison Mighty Men Variant
         * description : null
         * modified : 2016-07-15T16:47:08-0400
         * isbn :
         * upc : 75960608316900921
         * diamondCode :
         * ean :
         * issn :
         * format : Comic
         * pageCount : 40
         * textObjects : []
         * resourceURI : http://gateway.marvel.com/v1/public/comics/59555
         * urls : [{"type":"detail","url":"http://marvel.com/comics/issue/59555/squadron_supreme_2015_9_frison_mighty_men_variant/frison_mighty_men_variant?utm_campaign=apiRef&utm_source=54306733de0f5cd1418aa05a85fa062a"}]
         * series : {"resourceURI":"http://gateway.marvel.com/v1/public/series/20517","name":"Squadron Supreme (2015 - Present)"}
         * variants : [{"resourceURI":"http://gateway.marvel.com/v1/public/comics/55747","name":"Squadron Supreme (2015) #9"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/60115","name":"Squadron Supreme (2015) #9 (Christopher Action Figure Variant)"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/60139","name":"Squadron Supreme (2015) #9 (Young Variant)"}]
         * collections : []
         * collectedIssues : []
         * dates : [{"type":"onsaleDate","date":"2016-07-20T00:00:00-0400"},{"type":"focDate","date":"2016-07-05T00:00:00-0400"}]
         * prices : [{"type":"printPrice","price":4.99}]
         * thumbnail : {"path":"http://i.annihil.us/u/prod/marvel/i/mg/b/40/image_not_available","extension":"jpg"}
         * images : []
         * creators : {"available":2,"collectionURI":"http://gateway.marvel.com/v1/public/comics/59555/creators","items":[{"resourceURI":"http://gateway.marvel.com/v1/public/creators/11092","name":"Jenny Frison","role":"penciller (cover)"},{"resourceURI":"http://gateway.marvel.com/v1/public/creators/12456","name":"Katie Kubert","role":"editor"}],"returned":2}
         * characters : {"available":0,"collectionURI":"http://gateway.marvel.com/v1/public/comics/59555/characters","items":[],"returned":0}
         * stories : {"available":2,"collectionURI":"http://gateway.marvel.com/v1/public/comics/59555/stories","items":[{"resourceURI":"http://gateway.marvel.com/v1/public/stories/129616","name":"cover from Squadron Supreme (2015) #9 (TBD ARTIST MOP VARIANT)","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/129617","name":"story from Squadron Supreme (2015) #9 (TBD ARTIST MOP VARIANT)","type":"interiorStory"}],"returned":2}
         * events : {"available":0,"collectionURI":"http://gateway.marvel.com/v1/public/comics/59555/events","items":[],"returned":0}
         */

        private List<ResultsBean> results;

        public static List<DataBean> arrayDataBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<DataBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<DataBean> arrayDataBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<DataBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<ResultsBean> getResults() {
            return results;
        }

        public void setResults(List<ResultsBean> results) {
            this.results = results;
        }

        public static class ResultsBean {
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
            /**
             * resourceURI : http://gateway.marvel.com/v1/public/series/20517
             * name : Squadron Supreme (2015 - Present)
             */

            private SeriesBean series;
            /**
             * path : http://i.annihil.us/u/prod/marvel/i/mg/b/40/image_not_available
             * extension : jpg
             */

            private ThumbnailBean thumbnail;
            /**
             * available : 2
             * collectionURI : http://gateway.marvel.com/v1/public/comics/59555/creators
             * items : [{"resourceURI":"http://gateway.marvel.com/v1/public/creators/11092","name":"Jenny Frison","role":"penciller (cover)"},{"resourceURI":"http://gateway.marvel.com/v1/public/creators/12456","name":"Katie Kubert","role":"editor"}]
             * returned : 2
             */

            private CreatorsBean creators;
            /**
             * available : 0
             * collectionURI : http://gateway.marvel.com/v1/public/comics/59555/characters
             * items : []
             * returned : 0
             */

            private CharactersBean characters;
            /**
             * available : 2
             * collectionURI : http://gateway.marvel.com/v1/public/comics/59555/stories
             * items : [{"resourceURI":"http://gateway.marvel.com/v1/public/stories/129616","name":"cover from Squadron Supreme (2015) #9 (TBD ARTIST MOP VARIANT)","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/129617","name":"story from Squadron Supreme (2015) #9 (TBD ARTIST MOP VARIANT)","type":"interiorStory"}]
             * returned : 2
             */

            private StoriesBean stories;
            /**
             * available : 0
             * collectionURI : http://gateway.marvel.com/v1/public/comics/59555/events
             * items : []
             * returned : 0
             */

            private EventsBean events;
            private List<?> textObjects;
            /**
             * type : detail
             * url : http://marvel.com/comics/issue/59555/squadron_supreme_2015_9_frison_mighty_men_variant/frison_mighty_men_variant?utm_campaign=apiRef&utm_source=54306733de0f5cd1418aa05a85fa062a
             */

            private List<UrlsBean> urls;
            /**
             * resourceURI : http://gateway.marvel.com/v1/public/comics/55747
             * name : Squadron Supreme (2015) #9
             */

            private List<VariantsBean> variants;
            private List<?> collections;
            private List<?> collectedIssues;
            /**
             * type : onsaleDate
             * date : 2016-07-20T00:00:00-0400
             */

            private List<DatesBean> dates;
            /**
             * type : printPrice
             * price : 4.99
             */

            private List<PricesBean> prices;
            private List<?> images;

            public static List<ResultsBean> arrayResultsBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ResultsBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ResultsBean> arrayResultsBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ResultsBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getDigitalId() {
                return digitalId;
            }

            public void setDigitalId(int digitalId) {
                this.digitalId = digitalId;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getIssueNumber() {
                return issueNumber;
            }

            public void setIssueNumber(int issueNumber) {
                this.issueNumber = issueNumber;
            }

            public String getVariantDescription() {
                return variantDescription;
            }

            public void setVariantDescription(String variantDescription) {
                this.variantDescription = variantDescription;
            }

            public Object getDescription() {
                return description;
            }

            public void setDescription(Object description) {
                this.description = description;
            }

            public String getModified() {
                return modified;
            }

            public void setModified(String modified) {
                this.modified = modified;
            }

            public String getIsbn() {
                return isbn;
            }

            public void setIsbn(String isbn) {
                this.isbn = isbn;
            }

            public String getUpc() {
                return upc;
            }

            public void setUpc(String upc) {
                this.upc = upc;
            }

            public String getDiamondCode() {
                return diamondCode;
            }

            public void setDiamondCode(String diamondCode) {
                this.diamondCode = diamondCode;
            }

            public String getEan() {
                return ean;
            }

            public void setEan(String ean) {
                this.ean = ean;
            }

            public String getIssn() {
                return issn;
            }

            public void setIssn(String issn) {
                this.issn = issn;
            }

            public String getFormat() {
                return format;
            }

            public void setFormat(String format) {
                this.format = format;
            }

            public int getPageCount() {
                return pageCount;
            }

            public void setPageCount(int pageCount) {
                this.pageCount = pageCount;
            }

            public String getResourceURI() {
                return resourceURI;
            }

            public void setResourceURI(String resourceURI) {
                this.resourceURI = resourceURI;
            }

            public SeriesBean getSeries() {
                return series;
            }

            public void setSeries(SeriesBean series) {
                this.series = series;
            }

            public ThumbnailBean getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(ThumbnailBean thumbnail) {
                this.thumbnail = thumbnail;
            }

            public CreatorsBean getCreators() {
                return creators;
            }

            public void setCreators(CreatorsBean creators) {
                this.creators = creators;
            }

            public CharactersBean getCharacters() {
                return characters;
            }

            public void setCharacters(CharactersBean characters) {
                this.characters = characters;
            }

            public StoriesBean getStories() {
                return stories;
            }

            public void setStories(StoriesBean stories) {
                this.stories = stories;
            }

            public EventsBean getEvents() {
                return events;
            }

            public void setEvents(EventsBean events) {
                this.events = events;
            }

            public List<?> getTextObjects() {
                return textObjects;
            }

            public void setTextObjects(List<?> textObjects) {
                this.textObjects = textObjects;
            }

            public List<UrlsBean> getUrls() {
                return urls;
            }

            public void setUrls(List<UrlsBean> urls) {
                this.urls = urls;
            }

            public List<VariantsBean> getVariants() {
                return variants;
            }

            public void setVariants(List<VariantsBean> variants) {
                this.variants = variants;
            }

            public List<?> getCollections() {
                return collections;
            }

            public void setCollections(List<?> collections) {
                this.collections = collections;
            }

            public List<?> getCollectedIssues() {
                return collectedIssues;
            }

            public void setCollectedIssues(List<?> collectedIssues) {
                this.collectedIssues = collectedIssues;
            }

            public List<DatesBean> getDates() {
                return dates;
            }

            public void setDates(List<DatesBean> dates) {
                this.dates = dates;
            }

            public List<PricesBean> getPrices() {
                return prices;
            }

            public void setPrices(List<PricesBean> prices) {
                this.prices = prices;
            }

            public List<?> getImages() {
                return images;
            }

            public void setImages(List<?> images) {
                this.images = images;
            }

            public static class SeriesBean {
                private String resourceURI;
                private String name;

                public static List<SeriesBean> arraySeriesBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<SeriesBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<SeriesBean> arraySeriesBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<SeriesBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getResourceURI() {
                    return resourceURI;
                }

                public void setResourceURI(String resourceURI) {
                    this.resourceURI = resourceURI;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ThumbnailBean {
                private String path;
                private String extension;

                public static List<ThumbnailBean> arrayThumbnailBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<ThumbnailBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<ThumbnailBean> arrayThumbnailBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<ThumbnailBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getPath() {
                    return path;
                }

                public void setPath(String path) {
                    this.path = path;
                }

                public String getExtension() {
                    return extension;
                }

                public void setExtension(String extension) {
                    this.extension = extension;
                }
            }

            public static class CreatorsBean {
                private int available;
                private String collectionURI;
                private int returned;
                /**
                 * resourceURI : http://gateway.marvel.com/v1/public/creators/11092
                 * name : Jenny Frison
                 * role : penciller (cover)
                 */

                private List<ItemsBean> items;

                public static List<CreatorsBean> arrayCreatorsBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<CreatorsBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<CreatorsBean> arrayCreatorsBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<CreatorsBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getAvailable() {
                    return available;
                }

                public void setAvailable(int available) {
                    this.available = available;
                }

                public String getCollectionURI() {
                    return collectionURI;
                }

                public void setCollectionURI(String collectionURI) {
                    this.collectionURI = collectionURI;
                }

                public int getReturned() {
                    return returned;
                }

                public void setReturned(int returned) {
                    this.returned = returned;
                }

                public List<ItemsBean> getItems() {
                    return items;
                }

                public void setItems(List<ItemsBean> items) {
                    this.items = items;
                }

                public static class ItemsBean {
                    private String resourceURI;
                    private String name;
                    private String role;

                    public static List<ItemsBean> arrayItemsBeanFromData(String str) {

                        Type listType = new TypeToken<ArrayList<ItemsBean>>() {
                        }.getType();

                        return new Gson().fromJson(str, listType);
                    }

                    public static List<ItemsBean> arrayItemsBeanFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);
                            Type listType = new TypeToken<ArrayList<ItemsBean>>() {
                            }.getType();

                            return new Gson().fromJson(jsonObject.getString(str), listType);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return new ArrayList();


                    }

                    public String getResourceURI() {
                        return resourceURI;
                    }

                    public void setResourceURI(String resourceURI) {
                        this.resourceURI = resourceURI;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getRole() {
                        return role;
                    }

                    public void setRole(String role) {
                        this.role = role;
                    }
                }
            }

            public static class CharactersBean {
                private int available;
                private String collectionURI;
                private int returned;
                private List<?> items;

                public static List<CharactersBean> arrayCharactersBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<CharactersBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<CharactersBean> arrayCharactersBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<CharactersBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getAvailable() {
                    return available;
                }

                public void setAvailable(int available) {
                    this.available = available;
                }

                public String getCollectionURI() {
                    return collectionURI;
                }

                public void setCollectionURI(String collectionURI) {
                    this.collectionURI = collectionURI;
                }

                public int getReturned() {
                    return returned;
                }

                public void setReturned(int returned) {
                    this.returned = returned;
                }

                public List<?> getItems() {
                    return items;
                }

                public void setItems(List<?> items) {
                    this.items = items;
                }
            }

            public static class StoriesBean {
                private int available;
                private String collectionURI;
                private int returned;
                /**
                 * resourceURI : http://gateway.marvel.com/v1/public/stories/129616
                 * name : cover from Squadron Supreme (2015) #9 (TBD ARTIST MOP VARIANT)
                 * type : cover
                 */

                private List<ItemsBean> items;

                public static List<StoriesBean> arrayStoriesBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<StoriesBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<StoriesBean> arrayStoriesBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<StoriesBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getAvailable() {
                    return available;
                }

                public void setAvailable(int available) {
                    this.available = available;
                }

                public String getCollectionURI() {
                    return collectionURI;
                }

                public void setCollectionURI(String collectionURI) {
                    this.collectionURI = collectionURI;
                }

                public int getReturned() {
                    return returned;
                }

                public void setReturned(int returned) {
                    this.returned = returned;
                }

                public List<ItemsBean> getItems() {
                    return items;
                }

                public void setItems(List<ItemsBean> items) {
                    this.items = items;
                }

                public static class ItemsBean {
                    private String resourceURI;
                    private String name;
                    private String type;

                    public static List<ItemsBean> arrayItemsBeanFromData(String str) {

                        Type listType = new TypeToken<ArrayList<ItemsBean>>() {
                        }.getType();

                        return new Gson().fromJson(str, listType);
                    }

                    public static List<ItemsBean> arrayItemsBeanFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);
                            Type listType = new TypeToken<ArrayList<ItemsBean>>() {
                            }.getType();

                            return new Gson().fromJson(jsonObject.getString(str), listType);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return new ArrayList();


                    }

                    public String getResourceURI() {
                        return resourceURI;
                    }

                    public void setResourceURI(String resourceURI) {
                        this.resourceURI = resourceURI;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }
                }
            }

            public static class EventsBean {
                private int available;
                private String collectionURI;
                private int returned;
                private List<?> items;

                public static List<EventsBean> arrayEventsBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<EventsBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<EventsBean> arrayEventsBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<EventsBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getAvailable() {
                    return available;
                }

                public void setAvailable(int available) {
                    this.available = available;
                }

                public String getCollectionURI() {
                    return collectionURI;
                }

                public void setCollectionURI(String collectionURI) {
                    this.collectionURI = collectionURI;
                }

                public int getReturned() {
                    return returned;
                }

                public void setReturned(int returned) {
                    this.returned = returned;
                }

                public List<?> getItems() {
                    return items;
                }

                public void setItems(List<?> items) {
                    this.items = items;
                }
            }

            public static class UrlsBean {
                private String type;
                private String url;

                public static List<UrlsBean> arrayUrlsBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<UrlsBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<UrlsBean> arrayUrlsBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<UrlsBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class VariantsBean {
                private String resourceURI;
                private String name;

                public static List<VariantsBean> arrayVariantsBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<VariantsBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<VariantsBean> arrayVariantsBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<VariantsBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getResourceURI() {
                    return resourceURI;
                }

                public void setResourceURI(String resourceURI) {
                    this.resourceURI = resourceURI;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class DatesBean {
                private String type;
                private String date;

                public static List<DatesBean> arrayDatesBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<DatesBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<DatesBean> arrayDatesBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<DatesBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }

            public static class PricesBean {
                private String type;
                private double price;

                public static List<PricesBean> arrayPricesBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<PricesBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<PricesBean> arrayPricesBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<PricesBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public double getPrice() {
                    return price;
                }

                public void setPrice(double price) {
                    this.price = price;
                }
            }
        }
    }
}
