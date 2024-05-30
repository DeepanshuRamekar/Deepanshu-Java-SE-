package com.company;

import java.util.Scanner;

public class CHW_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int A = sc.nextInt();
//        float A = sc.nextFloat(); --> is used when we want the Float input
        System.out.println("Enter Number 20");
        int B = sc.nextInt();
//        float B = sc.nextFloat();
        float sum = A+B;
        System.out.print("Summation = "+sum);

//        Boolean A1 = sc.hasNextInt(); --> is used when we want to check if the number is is integer or not
//        System.out.println(A1);

//        String str = sc.nextLine(); --> is to display the input as it is in string from.
//        System.out.println(str);
    }
}
