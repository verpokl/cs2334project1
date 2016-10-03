/**
 * @author pvelesko
 * @version 2016-09-21
 */
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Main test class for the DataDay
 * @author pvelesko
 * @version 1.0
 */
public class DataDayTest {

    /**
     * test if resulting string is correct
     */
    @Test
    public void testToString() {
        DataDay test = new DataDay(2004, 10, 8, "UPLAND",
                new Sample(15.5700), new Sample(0.1), 
                new Sample(13.23), new Sample(26.893));
        String correct = "2004-10-08, UPLAND: Wind = "
                + "[0.1000, 13.2300, 26.8930],";
        correct += " Solar Radiation = 15.5700";
        assertTrue(test.toString().equals(correct));
    }

}
