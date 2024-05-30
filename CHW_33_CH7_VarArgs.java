package com.company;

public class CHW_33_CH7_VarArgs {
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a+b+c+d;
//    }
    static int sum(int ...arr){
//        Available as int [] arr
        int result=0;
        for (int element: arr){
            result += element;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Varargs Tutorial");
        System.out.println("the sum of 4 and 5 is : "+ sum(4,5));
        System.out.println("the sum of 4 , 3 and 5 is : "+ sum(4,3,5));
        System.out.println("the sum of 2 , 4 , 3 and 5 is : "+ sum(2,4,3,5));
        System.out.println("the sum of Noting is : "+ sum());
    }
}
