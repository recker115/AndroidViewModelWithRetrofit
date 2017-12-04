package com.example.user.viewmodelapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("primary_price")
    @Expose
    private Integer primaryPrice;
    @SerializedName("quantity")
    @Expose
    private String quantity;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getPrimaryPrice() {
        return primaryPrice;
    }

    public void setPrimaryPrice(Integer primaryPrice) {
        this.primaryPrice = primaryPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", primaryPrice=" + primaryPrice +
                ", quantity='" + quantity + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }
}
