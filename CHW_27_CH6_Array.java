package com.company;

import java.util.Scanner;

public class CHW_27_CH6_Array {
    public static void main(String[] args) {
//        String [] student = {"Harry","Deepanshu","Sanchit","Rekha"};
//        System.out.println(student.length);
//        System.out.println(student[1]);

//        float [] marks = {98.1f,45.12f,79.22f,99.0f,90f};

        int [] marks = {98, 45, 79, 99, 80};
        // System.out.println(marks.length);

        // Displaying the Array (Naive way)
        System.out.println("Printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        // Quick Quiz: Displaying the Array in Reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }

        // Quick Quiz: Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for(int element: marks){
            System.out.println(element);
        }

        Scanner sc = new Scanner(System.in);
        int [] marks2 = new int[5];
        for (int i=0;i<marks2.length;i++){
            System.out.println("Enter the marks out of 100");
            marks2[i] = sc.nextInt();
        }
        for(int element: marks2){
            System.out.println(element);
        }
    }
}
