package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am a thread");
            i++;
        }
    }
}
public class CHW_73_CH13_threadConstructors {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Deepanshu");
        MyThr t2 = new MyThr("Sanchit");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is: "+t1.getId());
        System.out.println(t1.getName());
//        System.out.println(t.getContextClassLoader());
//        System.out.println(t.getPriority());
        System.out.println("The id of the thread t is: "+t2.getId());
        System.out.println(t2.getName());
    }
}
