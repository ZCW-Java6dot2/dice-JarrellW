import java.sql.SQLOutput;
import java.util.Arrays;

public class Bins {

    private int[] binArray;

    public Bins(int min, int max) {
        binArray = new int[max+1];

        for (int i = min; i <= max; i++) {
            binArray[i] = 0;
        }

    }

    public void binCount(int rollResult) {
        binArray[rollResult] += 1;
    }

    public Integer getBin(int binNumber) {
        return binArray[binNumber];
    }

    public int[] displayBin() {
        System.out.println(Arrays.toString(binArray));
        return binArray;
    }



}
