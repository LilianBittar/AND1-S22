package com.lilianbittar.list;

public class Cat {

    private String name;
    private int age;
    private String color;
    private String Photo;

    public Cat(String name, int age, String color, String photo) {
        this.name = name;
        this.age = age;
        this.color = color;
        Photo = photo;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }
}
