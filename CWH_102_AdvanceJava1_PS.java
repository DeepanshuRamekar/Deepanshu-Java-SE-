package com.company;

import java.util.*;

public class CWH_102_AdvanceJava1_PS {
    public static void main(String[] args) {
////        Practice Set
////        Problem 1:
//        ArrayList<String> ar = new ArrayList<>(10);
//        Scanner sc = new Scanner(System.in);
//        for (int i=0;i<=100;i++){
//            System.out.println("you want to add: press 1 for yes/ press 0 for No");
//            int y = sc.nextInt();
//            if (y == 1){
//                System.out.println("Enter the Names");
//                ar.add(sc.next());
//            }
//            if (y == 0){
//                break;
//            }
//        }
//        for(String Element: ar){
//            System.out.println(Element);
//        }
//        Problem 5:
        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(6);
        s.add(46);
        s.add(60);
        s.add(9);
        s.add(6);
        System.out.println(s);

//        problem 2:
        Date d = new Date(101, Calendar.DECEMBER,22,21,47,02);
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds()   );

//        Problem 3:
        Calendar c = Calendar.getInstance();
        c.set(101,12,21,21,47,02);
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND)   );

//        problem 4:

    }
}
