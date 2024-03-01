package miniPrograms;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class LuckySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialBet = 0;

        while (initialBet > 999999 || initialBet < 1) {
            System.out.print("How much you would like to bet?");
            while (!sc.hasNextInt()) {

                String temp = sc.nextLine();

                String emptyInputRegex = "^\\s*$";
//                Pattern emptyInputPattern = Pattern.compile(emptyInputRegex);
//                Matcher emptyInputMatcher = emptyInputPattern.matcher(temp);
                boolean test = Objects.equals(temp, " ");
                System.out.println(test + " hhhhhhh");
//                if (test.matches(emptyInputRegex)) {
//                    System.out.println("hahahha");
//                }


                System.out.println("invalid literal for int() with base 10: '" + temp + "'");
                System.out.print("How much you would like to bet?");
            }
            initialBet = sc.nextInt();
            if (initialBet > 999999) {
                System.out.println("Bet too much!");
            } else if (initialBet < 1) {
                System.out.println("Bet too little!");
            }
        }

        sc.close();

        int maxReward = 0, totalRolls = 0;
        for (int i = 1; i < 21; i++) {
            System.out.println("Game " + i + " :");
            int rollsPlayed = 0;
            int currReward = initialBet, currMax = initialBet;
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
        System.out.println("Average rolls per simulation: " + (double) totalRolls / 20);
        System.out.println("Most money player won: " + maxReward);
    }
}