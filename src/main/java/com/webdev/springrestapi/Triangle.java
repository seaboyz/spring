package com.webdev.springrestapi;

public class Triangle {
    private String type;

    public Triangle(String type) {
        this.type = type;
    }

    public void draw() {
        System.out.println(type + " triangle drawn");
    }

    public String getType() {
        return type;
    }
}
