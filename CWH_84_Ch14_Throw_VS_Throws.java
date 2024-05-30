package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return " Radius cannot be Negative";
    }

    @Override
    public String getMessage() {
        return " Radius cannot be Negative ";
    }
}

public class CWH_84_Ch14_Throw_VS_Throws {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int divide(int a, int b){
//        Made by Deepanshu
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
//        Shivam - uses divide function created by deepanshu
        try{
            int c = divide(6,0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception");
        }

        try{
            double a = area(6);
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
