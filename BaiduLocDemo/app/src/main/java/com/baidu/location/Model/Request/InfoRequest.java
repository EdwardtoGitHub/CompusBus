package com.baidu.location.Model.Request;


/**
 * Created by AMing on 15/12/24.
 * Company RongCloud
 */
public class InfoRequest {


    private String lat;
    private String lng;
    private String other;

    public InfoRequest(String lat, String lng, String other) {
        this.lat = lat;
        this.lng = lng;
        this.other = other;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
