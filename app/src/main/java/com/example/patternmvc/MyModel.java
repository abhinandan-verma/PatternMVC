package com.example.patternmvc;

// Acts as database or bridging btw Networking & Cloud Storage
// this is the Model Class
public class MyModel {

    String appName;
    int appDownloads;
    float appRating;

    public MyModel(String appName, int appDownloads, float appRating) {
        this.appName = appName;
        this.appDownloads = appDownloads;
        this.appRating = appRating;
    }
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getAppDownloads() {
        return appDownloads;
    }

    public void setAppDownloads(int appDownloads) {
        this.appDownloads = appDownloads;
    }

    public float getAppRating() {
        return appRating;
    }

    public void setAppRating(float appRating) {
        this.appRating = appRating;
    }
}
