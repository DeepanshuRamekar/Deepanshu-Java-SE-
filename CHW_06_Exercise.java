package com.company;

import java.util.Scanner;

public class CHW_06_Exercise {
    public static void main(String[] args) {
        System.out.println("Enter the Marks of each subject");
        Scanner PR = new Scanner(System.in);
        System.out.println("Marks Out Of");
        float T = PR.nextFloat();
        System.out.println("Marks in Subject 1");
        float S1 = PR.nextFloat();
        System.out.println("Marks in Subject 2");
        float S2 = PR.nextFloat();
        System.out.println("Marks in Subject 3");
        float S3 = PR.nextFloat();
        System.out.println("Marks in Subject 4");
        float S4 = PR.nextFloat();
        System.out.println("Marks in Subject 5");
        float S5 = PR.nextFloat();
        float per = (S1+S2+S3+S4+S5)*100/(5*T);
        System.out.print("PERCENTAGE: "+per);
        System.out.print("%");
    }
}
