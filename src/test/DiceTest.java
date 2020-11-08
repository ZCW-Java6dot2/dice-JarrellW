import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class DiceTest extends TestCase {


//    @Test
//    public void constructorDiceTest() {
//        Dice testDice = new Dice(2);
//        int actual = testDice.getNumberOfDices();
//        int expected = 2;
//        Assert.assertEquals(expected,actual);
//    }
    @Test
    public void testTossAndSum() {
        Dice value = new Dice(1);
        int actual = value.tossAndSum(1);
        Assert.assertTrue(actual >= 1 && actual <= 6);
    }
}