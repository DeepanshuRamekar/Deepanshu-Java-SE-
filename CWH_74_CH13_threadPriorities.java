package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("I am a thread: "+this.getName());
        }
    }
}

public class CWH_74_CH13_threadPriorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Deepanshu1");
        MyThr1 t2 = new MyThr1("Deepanshu2");
        MyThr1 t3 = new MyThr1("Deepanshu3");
        MyThr1 t4 = new MyThr1("Deepanshu4");
        MyThr1 t5 = new MyThr1("Deepanshu5 (Most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
