package com.company;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println("I am a Thread 1 not a Threat 1");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println("I am a Thread 2 not a Threat 2");
            i++;
        }
    }
}
public class CHW_71_CH13_Multithreading_Runnable {
    public static void main(String[] args) {
//        This step is important and different in case of Runnable iterface in Threads
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
