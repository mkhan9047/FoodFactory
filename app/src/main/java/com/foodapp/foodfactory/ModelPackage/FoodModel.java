package com.foodapp.foodfactory.ModelPackage;

public class FoodModel {

    private String name;
    private String des;
    private double price;
    private int image;
    private float rating;
    private int ratingCount;
    private String type;

    public FoodModel(String name, String des, double price, int image, float rating, int ratingCount, String type) {
        this.name = name;
        this.des = des;
        this.price = price;
        this.image = image;
        this.rating = rating;
        this.ratingCount = ratingCount;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }

    public double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }

    public float getRating() {
        return rating;
    }
    public int getRatingCount(){
        return ratingCount;
    }

    public String getType() {
        return type;
    }
}
