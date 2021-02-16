package com.example.w4d.Model;

public class PictureModel {

    boolean isUploaded;
    String image;

    public PictureModel(boolean isUploaded, String image) {
        this.isUploaded = isUploaded;
        this.image = image;
    }

    public boolean isUploaded() {
        return isUploaded;
    }

    public void setUploaded(boolean uploaded) {
        isUploaded = uploaded;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
