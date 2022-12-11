package Loops;
import java.util.Scanner;
public class Timmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number Till Which You Want To Count :");
        int no = sc.nextInt();
        for(int i = 0 ; i<=no ;i++ ){
            System.out.print(i  + " ");
        }sc.close();
    }
}
