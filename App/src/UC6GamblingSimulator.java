import java.util.Random;

public class UC6GamblingSimulator {

    private static final int STAKE = 100;
    private static final int BET = 1;
    private static final int DAYS = 20;

    public static void main(String[] args) {

        int totalAmount = 0;

        for (int day = 1; day <= DAYS; day++) {

            totalAmount += playForDay();
        }

        System.out.println("Monthly Amount: $" + totalAmount);

        if (totalAmount > 0) {
            System.out.println("Gambler will continue next month.");
        } else {
            System.out.println("Gambler will stop gambling.");
        }
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