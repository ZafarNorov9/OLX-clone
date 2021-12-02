package com.example.olxclone.ui.models;

public class ItemStagger {
    private int image;
    private String name;
    private String price;
    private String location;
    private String last_seen;


    public ItemStagger(int image, String name, String location, String last_seen, String price) {
        this.image = image;
        this.name = name;
        this.location = location;
        this.last_seen = last_seen;
        this.price = price;
    }


    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getLast_seen() {
        return last_seen;
    }

    public String getPrice() {
        return price;
    }
}
