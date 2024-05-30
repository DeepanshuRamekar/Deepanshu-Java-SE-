package com.company;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return (2*Math.PI*radius*radius)+(2*3.14*radius*height);
    }
    public double volume(){
        return 2*Math.PI*radius*radius*height;
    }
}
class myRectangle{
    private int Length;
    private int Breadth;

    public myRectangle() {
        Length = 4;
        Breadth = 5;
    }

    public myRectangle(int length, int breadth) {
        Length = length;
        Breadth = breadth;
    }

    public int getLength() {
        return Length;
    }

    public int getBreadth() {
        return Breadth;
    }
}

public class CHW_44_CH9_practiceSet {
    public static void main(String[] args) {

//        Problem 1:
        /*
        Cylinder myCylinder = new Cylinder();
        myCylinder.setRadius(9);
        int r = myCylinder.getRadius();
        System.out.println("Radius: "+r);

        myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println("Height: "+h);

//        Problem 2:
        System.out.println("Total Surface Area: "+myCylinder.surfaceArea());
        System.out.println("Total Volume: "+myCylinder.volume());
         */

//        Problem 3:
//        Cylinder myCylinder = new Cylinder(9,12);
//        System.out.println("Total Surface Area: "+myCylinder.surfaceArea());
//        System.out.println("Total Volume: "+myCylinder.volume());

//        Problem 4:
        myRectangle r = new myRectangle(10,20);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
