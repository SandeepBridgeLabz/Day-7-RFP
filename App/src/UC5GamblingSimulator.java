import java.util.Random;

public class UC5GamblingSimulator {

    private static final int STAKE = 100;
    private static final int BET = 1;
    private static final int DAYS = 20;

    public static void main(String[] args) {

        int maxWin = Integer.MIN_VALUE;
        int maxLoss = Integer.MAX_VALUE;

        int luckiestDay = 0;
        int unluckiestDay = 0;

        for (int day = 1; day <= DAYS; day++) {

            int result = playForDay();

            if (result > maxWin) {
                maxWin = result;
                luckiestDay = day;
            }

            if (result < maxLoss) {
                maxLoss = result;
                unluckiestDay = day;
            }
        }

        System.out.println("Luckiest Day: Day " + luckiestDay
                + " Won $" + maxWin);

        System.out.println("Unluckiest Day: Day " + unluckiestDay
                + " Lost $" + maxLoss);
    }

    public static int playForDay() {

        int cash = STAKE;

        Random random = new Random();

        while (cash > 50 && cash < 150) {

            boolean isWin = random.nextBoolean();

            if (isWin) {
                cash += BET;
            } else {
                cash -= BET;
            }
        }

        return cash - STAKE;
    }
}