package com.webdev.springrestapi;

public class Triangle {
    private String type;
    private int height;

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public void draw() {
        if (height == 0) {
            System.out.println("Drawing " + type + " triangle");
        } else {
            System.out.println("Drawing " + type + " triangle with height " + height);
        }
    }

    public String getType() {
        return type;
    }
}
