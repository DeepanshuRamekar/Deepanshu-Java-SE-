package com.company;
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int incerment);
}
interface hornBicycle{
    void blowHornK2g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, hornBicycle{
    void blowHorn(){
        System.out.println("pee pee poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brakes");
    }
    public void speedUp(int incerment){
        System.out.println("Applying Accelerator");
    }
    public void blowHornK2g(){
        System.out.println("Kabhi Khushi Kabhi gum");
    }
    public void blowHornmhn(){
        System.out.println("Main Hoo Naa po po");
    }
}

public class CHW_54_CH11_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycleDeepanshu = new AvonCycle();
        cycleDeepanshu.applyBrake(2);
//        You can create Properties in interfaces
        System.out.println(cycleDeepanshu.a);
//        you cannot modify the properties in Interfaces as they are final
//        cycleDeepanshu.a = 455;
//        System.out.println(cycleDeepanshu.a);
        cycleDeepanshu.blowHornK2g();
        cycleDeepanshu.blowHornmhn();
    }
}
