package com.example.user.viewmodelapi;

/**
 * Created by User on 9/18/2017.
 */

public class ProductModel {

    String id,name,thumbnail;
    boolean set_checked=false;

    public boolean isSet_checked() {
        return set_checked;
    }

    public void setSet_checked(boolean set_checked) {
        this.set_checked = set_checked;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
