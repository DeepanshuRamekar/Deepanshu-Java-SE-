package com.company;
interface myCamera2{
    void takeSnap();
    void recordVedio();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVedio(){
        greet();
        System.out.println("Recording");
    }
}

interface myWifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class myCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println();
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class mySmartPhone2 extends myCellPhone2 implements myWifi2, myCamera2{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVedio(){
        System.out.println("Recording Vedio");
    }
    //    public void record4KVedio(){
//        System.out.println("Recording 4K Vedio");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List Of networks");
        String[] networkList = {"Harry","Prashanth","anjali"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}

public class CHW_59_CH11_Polymorphism {
    public static void main(String[] args) {
        myCamera2 cam1 = new mySmartPhone2();//-- This Is a smartphone butgoog use it as camera
//        cam1.geNetworks(); -- Not allowed
        cam1.record4KVedio();
    }
}
