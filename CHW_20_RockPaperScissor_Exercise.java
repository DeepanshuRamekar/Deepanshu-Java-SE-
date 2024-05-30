package com.company;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CHW_20_RockPaperScissor_Exercise {
    public static void main(String[] args) {
        Random random = new Random();
        int CPU = random.nextInt(3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Rock Paper Scissor Game");
        System.out.println("Enter 0-Rock \n1-Paper \n2-Scissor");
        System.out.println("Enter Your Choise: ");
        int IP = sc.nextInt();
        if (IP>=0 && IP<3){
            if (IP==0 && CPU==1){
                System.out.println("You Lose");
            }
            if (IP==0 && CPU==2){
                System.out.println("You Win");
            }
            if (IP==1 && CPU==0){
                System.out.println("You Win");
            }
            if (IP==1 && CPU==2){
                System.out.println("You Lose");
            }
            if (IP==2 && CPU==0){
                System.out.println("You Lose");
            }
            if (IP==2 && CPU==1){
                System.out.println("You Win");
            }
            if ((IP==0 && CPU==0) || (IP==1 && CPU==1) || (IP==2 && CPU==2)){
                System.out.println("The Match is Tie");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
        System.out.println("Computer Choise : "+CPU);
    }
}
