package com.company;
class Phone{
    public void showTime(){
        System.out.println("Time is 8:00 AM");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("On Music");
    }
    public void on(){
        System.out.println("Turning on SmartPhone");
    }
}
public class CHW_49_CH10_DynamicMethodDispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        SmartPhone smobj = new SmartPhone();
//        obj.on();
//        smobj.on();
        Phone obj = new SmartPhone();// yes it is Allowed
//        SmartPhone obj2 = new Phone();//Not Allowed
        obj.showTime();
        obj.on();
//        obj.music(); Not Allowed
    }
}
