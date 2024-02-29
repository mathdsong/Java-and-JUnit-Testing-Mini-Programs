package miniPrograms;
import java.util.Random;
import java.util.Scanner;
public class LuckySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much you would like to bet?");
        int initialBet = sc.nextInt();
        int maxReward = 0, totalRolls = 0;
        double avgRolls = (double) 0;
        for (int i = 1; i < 11; i++) {
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
              } else {
                  currReward -= 1;
              }
              maxReward = Math.max(maxReward, currMax);
          }
          System.out.println("Number of rolls played: " + rollsPlayed);
          System.out.println("Max player money: " + currMax);
          totalRolls += rollsPlayed;
        }
        avgRolls = (double) totalRolls / 10;
        System.out.println("Average rolls per simulation: " + avgRolls);
        System.out.println("Most money player won: " + maxReward);
    }
}
