package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_DateTimFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is Date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E H:m a ");  // This is FORMAT
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_TIME;  // This is FORMAT
        String myDate = dt.format(df2);
        System.out.println(myDate);
        System.out.println(df.getZone());
    }
}
