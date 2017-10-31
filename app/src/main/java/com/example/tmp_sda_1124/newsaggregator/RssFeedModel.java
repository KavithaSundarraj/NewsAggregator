package com.example.tmp_sda_1124.newsaggregator;

/**
 * Created by tmp-sda-1124 on 10/31/17.
 */

public class RssFeedModel {

    public String title;
    public String link;
    public String description;

    public RssFeedModel(String title, String link, String description) {
        this.title = title;
        this.link = link;
        this.description = description;
    }
}