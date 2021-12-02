package com.example.olxclone.ui.models;

public class ItemAll {
    private int image;
    private int color;
    private String type;
    private String howMany;

    public ItemAll(int image, int color, String type, String howMany) {
        this.image = image;
        this.color = color;
        this.type = type;
        this.howMany = howMany;
    }

    public int getImage() {
        return image;
    }

    public int getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getHowMany() {
        return howMany;
    }
}
