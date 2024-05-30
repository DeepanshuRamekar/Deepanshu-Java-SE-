package com.company;

class Circle1{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    Circle1(){
        System.out.println("I am non param of circle");
    }
    Circle1(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle1{
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*getRadius()*getRadius()*this.height;
    }
}
public class CHW_52_CH10_practiceSet {
    public static void main(String[] args) {
//        Problem 1:
//        Circle1 obj = new Circle1(10);
        Cylinder1 obj = new Cylinder1(10,10);
        obj.setRadius(10);
        System.out.println(obj.getRadius());
        System.out.println(obj.area());
    }
}
