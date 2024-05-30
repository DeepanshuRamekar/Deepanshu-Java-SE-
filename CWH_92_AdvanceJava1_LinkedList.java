package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class CWH_92_AdvanceJava1_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(12);
        l2.add(13);
        l2.add(14);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(0,l2);
        l1.addLast(676);
//        l1.clear();
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        l1.set(1,566);

        for (int i=0; i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        System.out.println(l1);
    }
}
