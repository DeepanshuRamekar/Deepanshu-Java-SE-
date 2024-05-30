package com.company;

public class CHW_32_CH7_MethodOverloading {
    static void foo(int a,int b){
        System.out.println("Good Morting "+a+" Bro!");
        System.out.println("Good Morting "+b+" Bro!");
    }static int foo(int a,int b,int c){
        int d = a+b+c;
        return d;
    }
    static void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morting "+a+" Bro!");
    }
    static void change(int x){
        x=98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word!\n"+
                "Plagiarism");
    }

    public static void main(String[] args) {
//        tellJoke();
//        Case 1: Changing the Integer
//        int a = 45;
//        change(a);
//        System.out.println("The Value of a after running change is: "+a);

//        Case 2: Changing the Array:
//        int [] marks = {52,73,77,89,98,94};
//        change2(marks);
//        System.out.println("The Value of a after running change is: "+marks[0]);

//        Method Overloading:
        foo();
        foo(3000);
        foo(3000,4000);
        int x;
        x = foo(3,1,5);
        System.out.println(x);
    }
}
