package com.company;

class A{
    public int a;
    public int meth1(){
        return 4;
    }
    public void meth2(){
        System.out.println("I a method 2 of the class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I a method 2 of the class B");
    }
    public void meth3(){
        System.out.println("I a method 3 of the class B");
    }
}
public class CHW_48_Ch10_Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
