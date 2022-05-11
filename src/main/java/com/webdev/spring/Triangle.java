package com.webdev.spring;

public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void draw() {
        System.out.println("Triangle is drawn with points: " +  pointA + ", " + pointB + ", " + pointC);
    }

    public Point getPointA() {
        return this.pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return this.pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return this.pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

}
