package Loops;

import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Pick a number to count by :");
    int a = sc.nextInt();
    System.out.println("Pick a number to count from :");
    int b = sc.nextInt();
    System.out.println("Pick a number to count to :");
    int c = sc.nextInt();
    for(int i = b ; i<= c ; i+=a){
        System.out.print(i + " ");
    }
       sc.close();
    }
}
