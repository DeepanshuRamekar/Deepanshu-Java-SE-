package com.company;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class CHW_38_CH8_customClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class" );
        Employee deepanshu = new Employee(); // Instantiating a new Employee object
        Employee sanchit = new Employee(); // Instantiating a new Employee object

        // Setting Attributes for Deepanshu
        deepanshu.id = 12;
        deepanshu.name = "Deepanshu_Vikas_Ramekar";
        deepanshu.salary = 30000;
        // Setting Attributes for Sanchit
        sanchit.id = 13;
        sanchit.name = "Sanchit_Vikas_Ramekar";
        sanchit.salary = 25000;

        // Printing the Attributes
        deepanshu.printDetails();
        sanchit.printDetails();
        int salary = deepanshu.getSalary();
        System.out.println(salary);

//        System.out.println("My id is "+id);
//        System.out.println("My name is "+name);
    }
}
