package com.company;

public class CHW_24_CH5_Break_Continue {
    public static void main(String[] args) {
//        Break & Continue using Loops
//        for (int i=0;i<5;i++){
//            System.out.println(i);
//            System.out.println("Java is Great");
//            if (i==2){
//                System.out.println("Ending the Loop");
//                break;
//            }
//        }
//        System.out.println("Loop ends here");

//        int i=0;
//        while (i<5){
//            System.out.println(i);
//            System.out.println("Java is Great");
//            if (i==2){
//                System.out.println("Ending the Loop");
//                break;
//            }
//            i++;
//        }

//        int i=0;
//        do {
//            System.out.println(i);
//            System.out.println("Java is Great");
//            if (i==2){
//                System.out.println("Ending the Loop");
//                break;
//            }
//            i++;
//        }
//        while (i<5);

//  Continue:
//        for (int i=0;i<5;i++){
//            if (i==2){
//                System.out.println("Ending the Loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is Great");
//        }
//        System.out.println("Loop ends here");

//        int i=0;
//        while (i<5){
//            i++;
//            if (i==2){
//                System.out.println("Ending the Loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is Great");
//        }
//
        int i=0;
        do {
            i++;
            if (i==3){
                System.out.println("Ending the Loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Great");
        }
        while (i<5);
    }
}
