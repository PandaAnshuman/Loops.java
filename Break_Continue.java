package Loops;


import java.util.Scanner;

public class Break_Continue {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Lets Play Rolling Java . Type Anything to Start ..  \n");
     sc.nextLine();
     System.out.println("Great Here Are The Rules : \n");
     System.out.println(" If You Roll A 6 The Game Stops \n");
     System.out.println(" If Its A 4 Then You gets Nothing \n");
     System.out.println(" Other Wise You A get A 1 point \n");
     System.out.println("You Must Get Atlest 3 Points To Win The Game . Type Anything To Start..!! \n");
     sc.nextLine();
     int score = 0;

        while (true){
            sc.nextLine();
            System.out.println();
            int diceRoll= rollDice();
            System.out.println("You rolled " + diceRoll);
            if ( diceRoll == 6 ){
                System.out.println("End Of Game ");
                break;
            }else if (diceRoll == 4 ){
                System.out.println("Nothing Happens Keep Rolling");
            }else{
                score++;
                System.out.println("1 point Keep Rolling");
            }
        }

        if(score>=3){
            System.out.println("You Win");
        }else{
            System.out.println("Well Tried But You Lose !!");
        }
        sc.close();

        

        }

        public static int rollDice(){
           double randomnum = Math.random() * 6;
           randomnum++;
           return (int)randomnum;
        }
    }
    

