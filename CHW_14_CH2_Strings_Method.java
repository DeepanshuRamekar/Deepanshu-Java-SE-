package com.company;

public class CHW_14_CH2_Strings_Method {
    public static void main(String[] args) {
        String name = "Harry";
//        System.out.println(name);
//        int Value = name.length();
//        System.out.println(Value);
//
//        String lstring = name.toLowerCase();
//        System.out.println(lstring);
//
//        String ustring = name.toUpperCase();
//        System.out.println(ustring);
//
//        String nontrim = "   Harry    ";
//        String Trimmed = nontrim.trim();
//        System.out.println(Trimmed);
//
//        System.out.println(name.substring(2));
//        System.out.println(name.substring(2,4));
//
//        System.out.println(name.replace('r','p'));
//        System.out.println(name.replace("rry","ier"));
//        System.out.println(name.replace("r","ier"));
//
//        System.out.println(name.startsWith("Ha"));
//        System.out.println(name.endsWith("ry"));
//
//        System.out.println(name.charAt(2));
//
//        String ModifiedName = "Harryrry";
//        System.out.println(ModifiedName.indexOf("rry"));
//        System.out.println(ModifiedName.indexOf("rry",4));
//        System.out.println(ModifiedName.lastIndexOf("rry"));
//        System.out.println(ModifiedName.lastIndexOf("rry",4));
//
        System.out.println(name.equals("harry"));
        System.out.println(name.equalsIgnoreCase("harry"));

        System.out.println("I am escape sequence \"Deepanshu\"");
        System.out.println("I am escape sequence \nDeepanshu");
        System.out.println("I am escape sequence \tDeepanshu");
        System.out.println("I am escape sequence \\Deepanshu\\");
        System.out.println("I am escape sequence \'Deepanshu\'");
        System.out.println("I am escape sequence \bDeepanshu");
        System.out.println("I am escape sequence \rDeepanshu");
        System.out.println("I am escape sequence \fDeepanshu");
    }
}
