package com.company;

class Ekclass{
    public int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    Ekclass(int a) {
        this.a = a;
    }

    public int returnone(){
        return 1;
    }
}
class Doclass extends Ekclass{
    public Doclass(int c){
        super(30);
        System.out.println("I am a Constructor");
        System.out.println(c);
    }
}

public class CHW_47_CH10_This_super {
    public static void main(String[] args) {
        Ekclass e =  new Ekclass(65);
        Doclass D = new Doclass(30);
//        System.out.println(e.getA());
    }
}
