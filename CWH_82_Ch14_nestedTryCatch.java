package com.company;

import java.util.Scanner;

public class CWH_82_Ch14_nestedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the array index");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to Vedio no.82");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry the index does not exist");
                    System.out.println("Exception in level2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 2");
                System.out.println(e);
            }
        }
        System.out.println("Thanks for using Program");
    }
}
