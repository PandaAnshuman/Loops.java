package Loops;

public class DiceRolling {
    public static void main(String[] args) {
        int dice1 = random();
        int dice2 = random();
        System.out.println("Dice 1 = " + dice1);
        System.out.println("Dice 2 = " + dice2  + "\n");
        while(dice1!=dice2){
            dice1 = random();
            dice2 = random();
            System.out.println("Dice 1 : " + dice1);
            System.out.println("Dice 2 : "+ dice2 + "\n");

        }
        System.out.println("You Rolled Doubles !!!");
    }
    public static int random(){
        double random = Math.random()*6;
        random+=1;
        return (int)random;

    }
    
}
