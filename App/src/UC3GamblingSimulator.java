import java.util.Random;

public class UC3GamblingSimulator {

    private static final int STAKE = 100;
    private static final int BET = 1;
    private static final int DAYS = 20;

    public static void main(String[] args) {

        int totalAmount = 0;

        for (int day = 1; day <= DAYS; day++) {

            int result = playForDay();

            totalAmount += result;

            System.out.println("Day " + day + ": $" + result);
        }

        System.out.println("Total Amount After 20 Days: $" + totalAmount);
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