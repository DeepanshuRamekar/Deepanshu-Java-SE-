package com.company;

import java.util.Scanner;

public class CHW_12_CH2_PS {
    public static void main(String[] args) {
//        Question 1:
//        float a = 7/4.0f * 9/2.0f;
//        System.out.println(a);
//
//        Question 2:
//        char Grade = 'B';
//        Grade = (char)(Grade + 8);
//        System.out.println(Grade);
//        /*Decrypting the Grade*/
//        Grade = (char)(Grade - 8);
//        System.out.println(Grade);
//
//        Question 3:
//        System.out.println("Enter Number");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(a>9);
//
//        Question 4:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of 'v'");
        float v = sc.nextFloat();
        System.out.println("Enter the Value of 'u'");
        float u = sc.nextFloat();
        System.out.println("Enter the Value of 'a'");
        float a = sc.nextFloat();
        System.out.println("Enter the Value of 's'");
        float s = sc.nextFloat();
        float R = ((v*v)-(u*u))/(2*a*s);
        System.out.println(R);
    }
}
