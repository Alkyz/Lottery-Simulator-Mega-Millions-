package Domain;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/**
 * This domain class obtains the winning and user lottery picks and compares them.
 */

public class MegaMillionsLotto {
    private int[] winningMegaMillionLotto;
    private int[] userLotteryPicks;
    private int winningPowerBall;
    private int userPowerBall;

    /**
     * This constructor obtains the winning numbers and Power Ball.
     */

    public MegaMillionsLotto () {
        this.winningMegaMillionLotto = new int[7];
        this.userLotteryPicks = new int[7];

        Random myRan = new Random();

        for (int i = 0; i < 7; i++) {
            while (true) {
                winningMegaMillionLotto[i] = myRan.nextInt(70) + 1;
                if (!checkForDuplicates(winningMegaMillionLotto, winningMegaMillionLotto[i]))
                    break;
            }

        }

        this.winningPowerBall = myRan.nextInt(25) + 1;
    }


    /**
     * This method obtains the users lucky guess numbers and Power Ball.
     */

    public void getUserPicks() {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter your 7 lucky numbers from 1-70:");

        for (int i = 0; i < 7; i++) {
            while (true) {
                userLotteryPicks[i] = keyboard.nextInt();
                if (!checkForDuplicates(userLotteryPicks, userLotteryPicks[i]))
                    break;
                else
                    System.out.println("You entered the same number twice, try again:");
            }

            if (userLotteryPicks[i] > 70 || userLotteryPicks[i] < 1) {
                while (userLotteryPicks[i] > 70 || userLotteryPicks[i] < 1) {
                    System.out.println("Not so fast! Value out of bound. Please enter a value between 1-70:");
                    userLotteryPicks[i] = keyboard.nextInt();
                }
            }
        }

        System.out.println("Enter your lucky Power Ball number from 1-25:");
        userPowerBall = keyboard.nextInt();

        if (userPowerBall > 25 || userPowerBall < 1) {
            while(userPowerBall > 25 || userPowerBall < 1) {
                System.out.println("Not so fast! Value out of bound. Please enter a value between 1-25:");
                userPowerBall = keyboard.nextInt();
            }
        }


        System.out.println(Arrays.toString(winningMegaMillionLotto) + " + " + winningPowerBall); // Prints out cheat array
        System.out.println(Arrays.toString(userLotteryPicks) + " + " + userPowerBall);
    }


    public int getWinningPowerBall() {
        return winningPowerBall;
    }

    public int getUserPowerBall() {
        return userPowerBall;
    }

    /**
     * This method checks for duplicate values in the user and random arrays.
     */

    public boolean checkForDuplicates(int[] anArray, int aNum) {
        int counter = 0;
        for (int number : anArray) {
            if (number == aNum) {
                counter++;
            }
        }
        return (counter > 1);

    }

    /**
     * This method counts the number of matches in the user and random arrays and returns the value.
     */

    public int checkLotteryMatch() {
        int numMatches = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (userLotteryPicks[i] == winningMegaMillionLotto[j]) {
                    numMatches++;
                }
            }
        }

        return numMatches;
    }
    
}
