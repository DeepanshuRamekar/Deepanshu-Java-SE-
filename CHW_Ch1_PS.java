package com.company;

import java.util.Scanner;

public class CHW_Ch1_PS {
    public static void main(String[] args) {
//        Question 1
//        int a = 7;
//        int b = 8;
//        int c = 9;
//        int sum = a+b+c;
//        System.out.println(sum);
//        Question 2
//        float Subject1 = 45;
//        float Subject2 = 95;
//        float Subject3 = 48;
//        float cgpa = (Subject1+Subject2+Subject3)/30;
//        System.out.println(cgpa);
//        Question 2
//        System.out.println("Enter Your Name");
//        Scanner scn = new Scanner(System.in);
//        String NAME = scn.next();
//        System.out.println("Hello " +NAME+ " have a good day !");
//        Question 5
//        System.out.println("Enter Your Number");
//        Scanner sc = new Scanner(System.in);
//        boolean A = sc.hasNextInt();
//        System.out.println(A);
        System.out.println("Enter Kilometers");
        Scanner sc = new Scanner(System.in);
        float KM = sc.nextFloat();
        float Miles = KM/ (1.609343F);
        System.out.println("Miles: "+Miles);
    }
}
