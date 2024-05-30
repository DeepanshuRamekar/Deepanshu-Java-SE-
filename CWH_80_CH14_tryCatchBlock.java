package com.company;

public class CWH_80_CH14_tryCatchBlock {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
//        Without try:

//        With try:
        try{
            int c = a/b;
            System.out.println("the result is c: " +c);
        }
        catch (Exception e){
            System.out.println("we failed to divide; Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the Program");
    }
}
