package com.company;

public class CHW_17_CH4_logicalOPerators {
    public static void main(String[] args) {
        System.out.println("For Logical AND");
        boolean a = false;
        boolean b = true;
        boolean c = true;
        if (a && b && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }


        System.out.println("For Logical OR");
        boolean a1 = false;
        boolean b1 = true;
        boolean c1 = true;
        if (a1 || b1 || c1){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }


        System.out.println("For Logical NOT");
        System.out.println("NOT(a) is " +!a);
        System.out.println("NOT(b) is " +!b);
    }
}
