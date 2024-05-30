package com.company;

class MyNewThr1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thankyou thread ");
            try {
                Thread.sleep(45);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyNewThr2 extends Thread{
    public void run(){
        while(true){
            System.out.println("I am a thread: ");
        }
    }
}


public class CWH_75_CH13_ThreadMethods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
