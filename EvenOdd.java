package Loops;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The No. From Which You Want to Start Finding Even Odd");
    int a = sc.nextInt();
    System.out.println("enter the no. till which you want to find Even Odd :");   
    int b = sc.nextInt();
    for(int i = a ; i<=b ;i++){
        if(i%2==0){
            System.out.println(i + " - Even");

        } else{
            System.out.println(i + " - Odd");
        }
    }sc.close();    
    }
    
}
