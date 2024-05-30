package com.company;

public class CHW_15_CH3_PS {
    public static void main(String[] args) {
//        Problem 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

//        Problem 2
        String text = "To Lower Case";
        text = text.replace(" ","_");
        System.out.println(text);

//        Problem 3
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "com");
        System.out.println(letter);

//        Problem 4
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

//        Problem 5
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
    }
}
