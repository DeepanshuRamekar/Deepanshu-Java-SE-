package com.company;
/*
 You have to create a package named com.codeWithHarry.shape
 This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
 These classes should use inheretance to properly manage the code
 Include Methods like volume, Surface area & getters/setters for dimensions
 */
class Rectangle1{
    private int length;
    private int breath;

    public Rectangle1(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }
    public int area(){
        return length*breath;
    }
}
class Square1 extends Rectangle1{
    private  int side;
    public Square1(int side) {
        super(side,side);
    }
}
class circle1{
    double radius;

    public circle1(double radius) {
        this.radius = radius;
    }
    public double Area(){
        return Math.PI*radius*radius;
    }
}
class cylinder1 extends circle1{
    private double height;
    public cylinder1(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public double surfaceArea(){
        return 2 * Math.PI * radius * (radius + height);
    }
    public double volume(){
        return Area()*height;
    }
}
class sphere{
    private double radius;

    public sphere(double radius) {
        this.radius = radius;
    }
    public double Volume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    public double surfaceArea(){
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

public class CWH_68_CH12_Exercise5 {
    public static void main(String[] args) {
//        sphere SP = new sphere(10);
//        System.out.println(SP.surfaceArea());
//        System.out.println(SP.Volume());
        cylinder1 CY = new cylinder1(5,5);
        System.out.println(CY.volume());
    }
}
