package com.company;

import java.util.Scanner;

public class CHW_18_CH4_ElseIf {
    public static void main(String[] args) {
        System.out.println("Enter your Age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("you are going to become an Adult!");
                break;
            case 23:
                System.out.println("you are going to join a Job!");
                break;
            case 60:
                System.out.println("you are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using my Java Code!");

        /*
        if (age>56){
            System.out.println("you are Experienced");
        }
        else if (age>46){
            System.out.println("you are Semi-Experienced");
        }
        else if (age>36){
            System.out.println("you are Semi-Semi-Experienced");
        }
        else{
            System.out.println("you are Inexperienced");
        }
        if (age>2){
            System.out.println("you are a Baby");
        }
         */
    }
}
