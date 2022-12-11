package Loops;

import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 4;
        System.out.println("I Choose a number between 1 to 5 . Can You Guess It ??");
        int guess = sc.nextInt();
        while(guess!=number){
            System.out.println("Guess again :");
            guess = sc.nextInt();
          
           }sc.close();
        }
    }
    

