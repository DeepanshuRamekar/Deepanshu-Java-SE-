package com.company;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<4000){
            System.out.println("my cooking thread is Running ");
            System.out.println("I am Happy");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<4000){
            System.out.println("Thread 2 for chatting with her");
            System.out.println("I am sad");
            i++;
        }
    }
}


public class CWH_70_CH13_Multithreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
