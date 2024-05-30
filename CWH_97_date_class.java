package com.company;

import java.util.Calendar;
import java.util.Date;

public class CWH_97_date_class {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());
        Date d = new Date(101, Calendar.DECEMBER,22,19,28);
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear() + 1900);
        System.out.println(d.getClass());
    }
}
