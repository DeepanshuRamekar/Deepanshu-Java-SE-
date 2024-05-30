package com.company;

import java.util.Scanner;

public class CWH_19_CH4_PS {
    public static void main(String[] args) {
      /*  Question 1:-
        int a=10;
//        if (a=11) -->  it will show error because in if statement
//        only boolean statements is used
        if (a==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }*/


//        Question 2 :
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in Physics");
//        int m1 = sc.nextInt();
//        System.out.println("Enter your marks in Chemistry");
//        int m2 = sc.nextInt();
//        System.out.println("Enter your marks in Mathematics");
//        int m3 = sc.nextInt();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Overall Percentage is: "+avg);
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations, You have been Promoted!");
//        }
//        else{
//            System.out.println("Yor are Failed");
//        }
//
////       Question 3:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Income in Lakhs :");
//        float income = sc.nextFloat();
//        float tax = 0;
//        if (income<=2.5){
//            tax = tax + 0;
//        }
//        else if (income>2.5f && income<=5f) {
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if (income >5f && income<=10f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5.0f);
//        }
//        else if (income >10f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10f - 5f);
//            tax = tax + 0.3f * (income - 10f);
//        }
//        System.out.println("Total Tax Paid by Employee is: "+tax);


//        Question 4 :
//
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thusday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

//      Question 5:

        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%100 == 0){
            if (year%400 == 0){
                System.out.println("year is a leap year");
            }
            else{
                System.out.println("year is not a leap year");
            }
        }
        else{
            if (year%4 == 0){
                System.out.println("year is a leap year");
            }
            else{
                System.out.println("year is not a leap year");
            }
        }

//        Question 6:
//
//
//        Scanner sc = new Scanner(System.in);
//        String website = sc.nextLine();
//        if (website.endsWith(".org")){
//            System.out.println("This is an Organizational websites");
//        }
//        else if (website.endsWith(".com")) {
//            System.out.println("This is an Commercial websites");
//        }
//        else if (website.endsWith(".in")) {
//            System.out.println("This is an Indian websites");
//        }
    }
}
