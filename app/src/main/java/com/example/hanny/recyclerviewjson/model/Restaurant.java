package com.example.hanny.recyclerviewjson.model;

/**
 * Created by Hanny on 1/11/2017.
 */

public class Restaurant {
    private String name;
    private String address;
    private String rating;
    private String cost;
    private String imageUrl;
    private String currency;
    private double longtitude;
    private double lattitude;

    public Restaurant() {
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.cost = cost;
        this.imageUrl = imageUrl;
        this.currency = currency;
        this.longtitude = longtitude;
        this.lattitude = lattitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public double getLattitude() {
        return lattitude;
    }

    public void setLattitude(double lattitude) {
        this.lattitude = lattitude;
    }


}
