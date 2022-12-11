package Loops;
import java.util.Scanner;


public class JavagramSignIn {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String un = "Anshuman";
    String pass = "Java<3";
    System.out.println("Welcome To Javagram . Try Signing In into Your Account..");
    System.out.println("Enter Username : ");
    String UN = sc.nextLine();
    System.out.println("Enter PassWord : ");
    String Pass = sc.nextLine();
    while(!UN.equals(un) || !Pass.equals(pass)){
        System.out.println("Incorrect Username Or Password . Please Try Again");
        System.out.println("Username : ");
        UN = sc.nextLine();
        System.out.println("Password : ");
        Pass = sc.nextLine();
    }System.out.println("\nSUCCESS!!!!");
    sc.close();
 }  
}
