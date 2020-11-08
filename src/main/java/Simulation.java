public class Simulation {
    private int dices;
    private int tosses;
    private Dice dice;
    private Bins bin;

    public Simulation(int numberOfDice, int numberOfTosses) {
        int totalNumberOfSides = numberOfDice * 6;
        this.dices = numberOfDice;
        this.tosses = numberOfTosses;
        this.dice = new Dice(numberOfDice);
        this.bin = new Bins(numberOfDice, totalNumberOfSides);
    }

    public int[] runSimulation() {
        for (int i=1; i <= tosses; i++) {
            int x = this.dice.tossAndSum(dices);
            bin.binCount(x);
        }
        return bin.displayBin();
    }

    public void printResults(int[] outPut) {
       for (int i = dices; i <= dices *6; i++) {
           double outPutR = outPut[i];
           double toss = tosses;
           double percent = outPutR/toss;
           long numberOfStars = Math.round(percent * 100);
//           System.out.println(i + " : " + outPut[i] + " : " + percent + stars(numberOfStars));
           System.out.println(String.format("%2s %1s %8s %1s %.2f %s", i , ":" , bin.getBin(i), ":" ,
                   (double)bin.getBin(i)/tosses, stars((int)bin.getBin(i)*100/tosses)));
       }

    }
    public String stars(long numberOfStars) {
        String result = "";
        for (int i = 1; i <= numberOfStars; i++){
            result += "*";
        }
        return result;
    }





}
