package Driver;
import Domain.MegaMillionsLotto;

public class LotteryGame {

    /**
     * Main calls the method to see what the user picks are and sees if there are
     * any matching values between them and the randomly generated ones.
     */

    public static void main(String[] args) {
        MegaMillionsLotto aMegaMillionsLotto = new MegaMillionsLotto();
        aMegaMillionsLotto.getUserPicks();
        int matchingNums = aMegaMillionsLotto.checkLotteryMatch();

        if (matchingNums == 3) {
            if (aMegaMillionsLotto.getWinningPowerBall() == aMegaMillionsLotto.getUserPowerBall()) {
                System.out.println("You matched 3 regular numbers, plus the Power Ball. You get $50.");
            } else {
                System.out.println("You matched 3 regular numbers. You get a free ticket.");
            }
        } else if (matchingNums == 4) {
            if (aMegaMillionsLotto.getWinningPowerBall() == aMegaMillionsLotto.getUserPowerBall()) {
                System.out.println("You matched 4 regular numbers, plus the Power Ball. You get $1,000.");
            } else {
                System.out.println("You matched 4 regular numbers. You get $100.");
            }
        } else if (matchingNums == 5) {
            if (aMegaMillionsLotto.getWinningPowerBall() == aMegaMillionsLotto.getUserPowerBall()) {
                System.out.println("You matched 5 regular numbers, plus the Power Ball. You get $5,000.");
            } else {
                System.out.println("You matched 5 regular numbers. You get $500.");
            }
        } else if (matchingNums == 6) {
            if (aMegaMillionsLotto.getWinningPowerBall() == aMegaMillionsLotto.getUserPowerBall()) {
                System.out.println("You matched 6 regular numbers, plus the Power Ball. You get $10,000.");
            } else {
                System.out.println("You matched 6 regular numbers. You get $1,000.");
            }
        } else if (matchingNums == 7) {
            if (aMegaMillionsLotto.getWinningPowerBall() == aMegaMillionsLotto.getUserPowerBall()) {
                System.out.println("You matched 7 regular numbers, plus the Power Ball. You get $500,000.");
            } else {
                System.out.println("You matched 7 regular numbers. You get $50,000.");
            }
        } else {
            System.out.println("Sorry, you did not match enough numbers to qualify for a prize. Better luck next time!");
        }
    }
}
