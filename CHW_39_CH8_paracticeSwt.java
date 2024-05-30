package com.company;

import java.util.Scanner;

class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class cellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Kunal");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class rectangle{
    int length;
    int breath;
    public int area(){
        return length*breath;
    }
    public int perimeter(){
        return 2*(length + breath);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the Enemy");
    }
    public void run(){
        System.out.println("Running From Enemy");
    }
    public void fire(){
        System.out.println("Firing on the Enemy");
    }
}

class circle{
    float radius;
    public float area(){
        return (3.14f*radius*radius);
    }
    public float circumference(){
        return 2f*3.14f*radius;
    }
}

public class CHW_39_CH8_paracticeSwt {
    public static void main(String[] args) {
        /*
        Problem 1:
        Employee1 deepanshu = new Employee1();
        deepanshu.salary = 30000;
        deepanshu.setName("Deepanshu_Ramekar");
        System.out.println(deepanshu.getSalary());
        System.out.println(deepanshu.getName());

        Problem 2:
        cellPhone realMe_X = new cellPhone();
        realMe_X.ring();
        realMe_X.vibrate();
        realMe_X.callFriend();
         */

//        Problem 3:
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Square:");
        Square sq = new Square();
        sq.side = sc.nextInt();
        System.out.println("Area = "+ sq.area());
        System.out.println("Perimeter = "+sq.perimeter());


//        Problem 4:
        Scanner sc = new Scanner(System.in);
        rectangle rc = new rectangle();
        System.out.println("Enter the Length of Rectangle:");
        rc.length = sc.nextInt();
        System.out.println("Enter the Breath of Rectangle:");
        rc.breath = sc.nextInt();
        System.out.println("Area = "+ rc.area());
        System.out.println("Perimeter = "+rc.perimeter());
         */

//        Problem 5:
        Tommy player1 = new Tommy();
        player1.hit();
        player1.run();
        player1.fire();

//        Problem 6:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        circle cr = new circle();
        cr.radius = sc.nextFloat();
        System.out.println("Area = "+ cr.area());
        System.out.println("Circumference = "+cr.circumference());
    }
}
