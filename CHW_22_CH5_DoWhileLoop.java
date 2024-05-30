package com.company;

import java.util.Scanner;

public class CHW_22_CH5_DoWhileLoop {
    public static void main(String[] args) {
//        int a=0;
//        while(a<=5){
//            System.out.println(a);
//            a++;
//        }
//        int b=0;
//        do {
//            System.out.println(b);
//            b++;
//        } while (b<5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth Natural no.: ");
        int num = sc.nextInt();
        int a = 1;
        do {
            System.out.println(a);
            a++;
        }while (a<=num);
    }
}
