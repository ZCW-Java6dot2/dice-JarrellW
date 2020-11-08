import java.util.Random;

public class Dice {

    private int numberOfDices = 6;


    public Dice(int diceNumber) {
        this.numberOfDices = diceNumber;

    }

    public int tossAndSum(int numberOfDice) {
        Random rand = new Random();

        int result = 0;
        for (int i = 1; i <= numberOfDice; i++) {
            result += rand.nextInt(6) + 1;
        }
        return result;

    }
    public int getNumberOfDices() {
        return numberOfDices;
    }

}
