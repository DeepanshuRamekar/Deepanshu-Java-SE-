package com.company;

public class CHW_34_CH7_Recursion {
//    static int factorial(int n){
////        Factorial(n) = n * n-1 * ....1
////        factorail(5) = 5*4*3*2*1 = 120
//        if (n==0 || n==1){
//            return 1;
//        }
//        else {
//            int N = n* factorial(n-1);
//            return N;
//        }
//    }
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            int fac=1;
            for (int i=n;i>0;i--){
                fac *= i;
            }
            return fac;
        }
    }
    public static void main(String[] args) {
        int x = 10;
        System.out.println(" the value of factorial n is: "+ factorial(x));
    }
}
