package com.example.w4d.Adatpers;

import android.graphics.drawable.Drawable;

public class HomeModel {

    int Image;
    String textrv;

    public HomeModel(int image, String textrv) {
        Image = image;
        this.textrv = textrv;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTextrv() {
        return textrv;
    }

    public void setTextrv(String textrv) {
        this.textrv = textrv;
    }
}
