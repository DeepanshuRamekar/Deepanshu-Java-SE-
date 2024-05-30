package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CWH_99_GregorianCalss {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" +c.get(Calendar.SECOND));
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2024));
        for (int i=0;i<=1000;i++){
            try{
                System.out.print(i + "  ");
                System.out.println(TimeZone.getAvailableIDs()[i]);
            }
            catch(Exception e){
                System.out.println("Limit Exceeds");
                break;
            }
        }

    }
}
