package com.company;

import java.util.Scanner;
class MaxRetries extends Exception{
    @Override
    public String toString() {
        return "Maximum Reties Reached";
    }
}

public class CWH_86_CH14_PracticeSet {

    public static void maxRetries() throws MaxRetries{
        throw new MaxRetries();
    }


    public static void main(String[] args) {
//        Problem 1
//        Syntax Error - int a = 7
        int age = 78;
        int year_born = 2000-78;// Logical Error
//        System.out.println(6/0);// Exception

//        problem 2:
        try{
            int a = 666/0;

        }
        catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch(ArithmeticException e){
            System.out.println("HaHa");
        }

//        Problem 3
        Boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try {
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("the value of marks[index] is " + marks[index]);
                flag = false;
            }
            catch(Exception e){
                System.out.println("invaled Index");
                i++;
            }
//            Problem 4:
//            if(i >= 5){
//                try{
//                    throw new MaxRetries();
//                }
//                catch(Exception e){
//                    System.out.println(e.toString());
//                    e.printStackTrace();
//                }
//            }

//            Problem 5:
            if(i >= 5){
                try{
                    maxRetries();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
