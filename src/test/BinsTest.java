import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void binCountTest() {
        Bins binC = new Bins(1, 6);
        binC.binCount(3);
        int count = binC.getBin(3);
        Assert.assertEquals(1, count);
    }



    @Test
    public void getBinTest() {
        Bins binA = new Bins(2, 12);
        binA.binCount(10);
        int count = binA.getBin(10);
        Assert.assertEquals(1, count);
    }

//    @Test
//    void displayBinTest() {
//    }
}