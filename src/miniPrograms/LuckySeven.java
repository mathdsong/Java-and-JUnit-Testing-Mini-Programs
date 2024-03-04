package miniPrograms;
import java.util.Random;
import java.util.Scanner;

public class LuckySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var initialBet = "0";

        while (Double.parseDouble(initialBet) > 999999 || Double.parseDouble(initialBet)  < 1) {
            // Prompt the user to input a bet:
            System.out.print("How much you would like to bet?");
            initialBet = sc.nextLine();
            // if the bet entered by user is not a decimal (including negative) or if it's a blank input, will ask user to re-enter a new bet
            while (!initialBet.matches("^-?\\d*\\.?\\d*$") || initialBet.matches("^\\s*$")) {
                System.out.println("invalid literal for int() with base 10: '" + initialBet + "'");
                System.out.print("How much you would like to bet?");
                initialBet = sc.nextLine();
            }
            // control the bet range:
            if (Double.parseDouble(initialBet)  > 999999) {
                System.out.println("Bet too much!");
            } else if (Double.parseDouble(initialBet)  < 1) {
                System.out.println("Bet too little!");
            }
        }

        sc.close();

        double maxReward = 0, totalRolls = 0;
        for (int i = 1; i < 101; i++) {
            System.out.println("Game " + i + " :");
            int rollsPlayed = 0;
            double currReward = Double.parseDouble(initialBet) , currMax = Double.parseDouble(initialBet) ;
            Random r = new Random();
            while (currReward >= 0) {
                rollsPlayed++;
                int dice1 = r.nextInt(6) + 1, dice2 = r.nextInt(6) + 1;
                if (dice1 + dice2 == 7) {
                    currReward += 4;
                    currMax = Math.max(currMax, currReward);
                    maxReward = Math.max(maxReward, currMax);
                } else {
                    currReward -= 1;
                }
            }
            System.out.println("Number of rolls played: " + rollsPlayed);
            System.out.println("Max player money: " + currMax);
            totalRolls += rollsPlayed;
        }
        System.out.println("Average rolls per simulation: " + (double) totalRolls / 100);
        System.out.println("Most money player won: " + maxReward);
    }
}