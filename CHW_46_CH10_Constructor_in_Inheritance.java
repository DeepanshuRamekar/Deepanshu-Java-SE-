package com.company;

class Base1{
    Base1() {
        System.out.println("I am a Constructor");
    }
    Base1(int x){
        System.out.println("I am a Constructor of Base1 with value of x : "+x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a Constructor of derived class");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am a Constructor of Derived1 with value of y : "+y);
    }
    public int y;

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am a Constructor of childOfDerived class");
    }
    childOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am a Constructor of childOfDerived with value z: "+z);
    }
}

public class CHW_46_CH10_Constructor_in_Inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Base1 b = new Base1(2);
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(2,5);
        childOfDerived cd = new childOfDerived();
//        childOfDerived cd = new childOfDerived(12,13,14);

    }
}
