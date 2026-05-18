import java.util.Random;

public class UC2GamblingSimulator {

    public static void main(String[] args) {

        final int STAKE = 100;
        final int BET = 1;

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

        System.out.println("End of Day Amount: $" + cash);
    }
}