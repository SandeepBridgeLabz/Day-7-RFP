import java.util.Random;

public class UC1GamblingSimulator {

    public static void main(String[] args) {

        int stake = 100;
        int bet = 1;

        Random random = new Random();

        boolean isWin = random.nextBoolean();

        if (isWin) {
            stake += bet;
            System.out.println("Gambler won $1");
        } else {
            stake -= bet;
            System.out.println("Gambler lost $1");
        }

        System.out.println("Current Stake: $" + stake);
    }
}