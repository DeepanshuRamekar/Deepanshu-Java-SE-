package com.company;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FoumtainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Write");
    }
    void changeNib(){
        System.out.println("Change The Nib");
    }
}
class Monkey{
    void Jump(){
        System.out.println("Jummping");
    }
    void Bite(){
        System.out.println("Bitting");
    }
}

interface basicAnimal{
    void Eat();
    void Sleep();
}
class Human extends Monkey implements basicAnimal{
    @Override
    public void Eat(){
        System.out.println("Eat Banana");
    }
    @Override
    public void Sleep(){
        System.out.println("Sleep in Night");
    }
}

abstract class telePhone{
    abstract void Ring();
    abstract void Lift();
    abstract void Disconnect();
}

class smartPhone extends telePhone{
    public void Ring(){
        System.out.println("Ringing");
    }
    public void Lift(){
        System.out.println("Lift the phone");
    }
    public void Disconnect(){
        System.out.println("Disconnect the call");
    }
}

public class CHW_60_Ch11_PracticeSet {
    public static void main(String[] args) {
//        Problem 1,2:
//        FoumtainPen pen = new FoumtainPen();
//        pen.changeNib();

//        Problem 3:
        Human Sanchit = new Human();
        Sanchit.Sleep();

//        Problem 5:
        Monkey M1 = new Human();
        M1.Bite();
        M1.Jump();
//        M1.Eat(); -- Cannot use Eat(); Method Because the reference is monkey which does not have Eat Method

//        Problem 4:
        telePhone T1 = new smartPhone();
        T1.Disconnect();
        T1.Lift();
        T1.Ring();
    }
}
