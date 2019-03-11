package com.sample.wireviewer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RelatedTopic {

    @SerializedName("Icon")
    @Expose
    private Icon icon;
    @SerializedName("Text")
    @Expose
    private String text;
    @SerializedName("FirstURL")
    @Expose
    private String firstURL;
    @SerializedName("Result")
    @Expose
    private String result;

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFirstURL() {
        return firstURL;
    }

    public void setFirstURL(String firstURL) {
        this.firstURL = firstURL;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}