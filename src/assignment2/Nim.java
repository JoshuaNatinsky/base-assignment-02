package assignment2;

import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        System.out.println("How many sticks would you like to play with?");
        Scanner scan = new Scanner(System.in);
        int numberSticks = scan.nextInt();

        int round = 0;

        boolean brokeRules = false;

        while (numberSticks > 0 && brokeRules == false) {
            if (round % 2 == 0){
                System.out.println("How many sticks would you like to take? You can take 1 or 2 (unless less than 2 remain).");
                int playerTakes = scan.nextInt();

                if (playerTakes <=0 || playerTakes >= 3 || playerTakes > numberSticks) {
                    brokeRules = true;
                    System.out.println("Player broke the rules. The player loses, and the game is over.");
                }

                else {
                    System.out.println("Round " + round + ": " + numberSticks + " at start, human takes " + playerTakes + ", so " + (numberSticks - playerTakes) + " remain");

                    numberSticks = numberSticks - playerTakes;}
        }

            else {
                int computerTakes;

                if (numberSticks > 1){
                    computerTakes = (int) (Math.random() * 2) + 1;
                }

                else {
                    computerTakes = 1;
                }

                System.out.println("Round " + round + ": " + numberSticks + " at start, computer takes " + computerTakes + ", so " + (numberSticks - computerTakes) + " remain");

                numberSticks = numberSticks - computerTakes;
            }

            round++;

        if (numberSticks == 0){
            if (round % 2 == 0){
                System.err.println("You lose! Computer wins.");
            }

            else{
                System.err.println("You win!");
            }
        }
        }
}
}
