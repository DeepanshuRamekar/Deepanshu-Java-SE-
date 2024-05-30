package com.company;

import java.util.ArrayDeque;

public class CWH_93_AdvandeJava1_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        ad1.offerFirst(444515);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
