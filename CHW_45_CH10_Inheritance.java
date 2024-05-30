package com.company;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and Setting x now");
        this.x = x;
    }

    public void printMe(){

        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in Derived and Setting x now");
        this.y = y;
    }
}

public class CHW_45_CH10_Inheritance {
    public static void main(String[] args) {
//        Creating an  Object of Base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

//        Creating an Object of Derived Class
        Derived d = new Derived();
        d.setX(4);
        System.out.println(d.getX());
//        d.setY(43);
//        System.out.println(d.getY());
    }
}
