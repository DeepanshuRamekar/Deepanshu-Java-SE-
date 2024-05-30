package com.company;

interface myCamera{
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

interface myWifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println();
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class mySmartPhone extends myCellPhone implements myWifi, myCamera{
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

public class CHW_57_CH11_Default_Method {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
//        ms.greet(); -->   Throws an Error because it is in Private
        ms.record4KVedio();
        String[] ar = ms.getNetworks();
        for (String item: ar){
            System.out.println(item);
        }
    }
}
