package com.company;

import java.sql.SQLOutput;

public class CHW_25_CH5_PracticeSet {
    public static void main(String[] args) {
//        Problem 1:
//        int n=4;
//        for (int i=n;i>0;i--){
//            for (int j=0;j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }

//        Problem 2:
//        int sum=0;
//        int n=4;
//        for (int i=0;i<n;i++){
//            sum=sum+(2*i);
//            System.out.println(2*i);
//        }
//        System.out.println("Sum of Even Numbers: "+sum);

//        Problem 3:
//         int n=5;
//         for (int i=1;i<=10;i++){
//             System.out.printf("%d X %d = %d \n",n,i,n*i);
//         }

//        Problem 4:
//        int n=10;
//        for (int i=10;i!=0;i--){
//            System.out.printf("%d X %d = %d \n",n,i,n*i);
//        }

//        Problem 5:
//        int fac = 1;
//        int n=5;
//        for (int i=n;i>0;i--){
//            fac *= i;
//            System.out.println(i);
//        }
//        System.out.println("Factoral = "+fac);
//
//        Problem 9:

        int sum=0;
        int n=8;
         for (int i=1;i<=10;i++){
             System.out.printf("%d X %d = %d \n",n,i,n*i);
             sum += (n*i);
         }
        System.out.println(sum);
    }
}
