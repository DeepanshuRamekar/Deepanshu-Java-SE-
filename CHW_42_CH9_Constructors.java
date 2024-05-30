package com.company;

class myMainEmployee{
    private int id;
    private String name;
//    Constructors
    public myMainEmployee(){
        id = 40;
        name = "Sanchit_Ramekar";
    }
    public myMainEmployee(String myName,int myId){
        id = myId;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class CHW_42_CH9_Constructors {
    public static void main(String[] args) {
        myMainEmployee deepanshu = new myMainEmployee("Deepanshu_Ramekar",45);
        System.out.println(deepanshu.getId());
        System.out.println(deepanshu.getName());

        myMainEmployee sanchit = new myMainEmployee();
        System.out.println(sanchit.getId());
        System.out.println(sanchit.getName());
    }
}
