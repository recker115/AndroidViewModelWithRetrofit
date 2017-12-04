package com.example.user.viewmodelapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by User on 10/6/2017.
 */

public class MainClass {

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("totaloffset")
    @Expose
    private Integer totaloffset;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTotaloffset() {
        return totaloffset;
    }

    public void setTotaloffset(Integer totaloffset) {
        this.totaloffset = totaloffset;
    }

    @Override
    public String toString() {
        return "MainClass{" +
                "status=" + status +
                ", data=" + data +
                ", message='" + message + '\'' +
                ", totaloffset=" + totaloffset +
                '}';
    }
}