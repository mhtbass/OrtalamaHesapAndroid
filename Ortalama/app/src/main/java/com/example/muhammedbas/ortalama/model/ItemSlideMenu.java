package com.example.muhammedbas.ortalama.model;

/**
 * Created by mamibas on 8.08.2017.
 */

public class ItemSlideMenu {
    private int imgID;
    private String title;

    public ItemSlideMenu(int imgID, String title) {
        this.imgID = imgID;
        this.title = title;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
