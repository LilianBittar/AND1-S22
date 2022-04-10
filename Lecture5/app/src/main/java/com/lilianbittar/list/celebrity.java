package com.lilianbittar.list;

import android.widget.ImageView;

public class celebrity {
    private String name;
    private int image;
    private char gender;
    private String quote;

    public celebrity(String name, int image, char gender, String quote) {
        this.name = name;
        this.image = image;
        this.gender = gender;
        this.quote = quote;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public char getGender() {
        return gender;
    }

    public String getQuote() {
        return quote;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
