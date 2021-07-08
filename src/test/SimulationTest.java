import junit.framework.TestCase;
import org.junit.Assert;

public class SimulationTest extends TestCase {

    public void testRunSimulation() {
        Simulation toss = new Simulation(5, 7);
        int[] testArray = toss.runSimulation();
        int actual = testArray.length;
        int expected = 31 ;
        Assert.assertEquals(expected, actual);


    }

    public void testPrintResults() {

    }

    public void testStars() {
        Simulation star = new Simulation(2,5);
        String actual = star.stars(4);
        String expected = "****";
        Assert.assertEquals(expected,actual);

    }
}