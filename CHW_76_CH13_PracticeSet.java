package com.company;

class Practice13A extends Thread{
    public void run(){
        int i = 0;
        while(i<500){
            System.out.println("Good Morning");
            i++;
        }
    }
}
class Practice13B extends Thread{
    public void run(){
        int i = 0;
        while(i<500){
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}


public class CHW_76_CH13_PracticeSet {
    public static void main(String[] args) {
        Practice13A P1 = new Practice13A();
        Practice13B P2 = new Practice13B();
        P1.setPriority(6);
        P2.setPriority(9);
        System.out.println(P1.getPriority());
        System.out.println(P2.getPriority());
        P1.start();
//        P2.start();
        System.out.println(P1.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
