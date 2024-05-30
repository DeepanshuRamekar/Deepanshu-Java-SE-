package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    private int randomNum;
    private int userInput;
    private int noOfGuesses = 0;

    public Game(){
        Random Rand = new Random();
        randomNum = Rand.nextInt(101);
    }
    public int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess any number between 0-100: ");
        userInput = sc.nextInt();
        noOfGuesses++;
        isCorrectNumber();
        return noOfGuesses;
    }
    public void isCorrectNumber(){
        if (randomNum > userInput){
            System.out.println("The number you have Guess is " +
                    "lesser than the original number");
            takeUserInput();
        }
        else if (randomNum < userInput) {
            System.out.println("The number you have Guess is " +
                    "Greater than the original number");
            takeUserInput();
        }
        else if (randomNum == userInput) {
            System.out.println("Congratulation! " +
                    "You guess a Correct Number");
            System.out.println("The original Number is "+randomNum);
        }
    }
}

public class CHW_43_Exercise3 {
    public static void main(String[] args) {
        /*
Create a class Game, which allows a user to play "Guess the Number" game once.
      Game should have the following methods:
      Constructor to generate the random number
      takeUserInput() to take a user input of number
      isCorrectNumber() to detect whether the number entered by the user is true
      getter and setter for noOfGuesses
      Use properties such as noOfGuesses(int), etc to get this task done!
         */
        int Guesses;
        Game player = new Game();
        Guesses = player.takeUserInput();
        System.out.format("You Take %d number of attempts",Guesses);
    }
}
