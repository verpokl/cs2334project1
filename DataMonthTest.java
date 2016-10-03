/**
 * @author pvelesko
 * @version 2016-09-21
 */
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

/**
 * Main class for testing dataMonth class
 * @author pvelesko
 * @version 1.0
 */
public class DataMonthTest {

    /**
     * main method for testing dataMonth class
     * @throws IOException
     */
    @Test
    public void testToString() throws IOException {
        DataMonth testMonth = new DataMonth("test3.csv");
        String correct = "2014-06, TISH: Wind = [0.1000, 2.0000, 3.0000], ";
        correct += "Solar Radiation = [1.0000, 1.5000, 2.0000, 3.0000]";


        assertEquals(testMonth.getDays().size(), 3); 
        assertTrue(testMonth.toString().equals(correct));
        
        testMonth = new DataMonth("test2.csv");
        correct = "2014-06, TISH: Wind = [0.1000, 1.5000, 2.0000], ";
        correct += "Solar Radiation = [1.0000, 1.5000, 2.0000, 3.0000]";

        assertEquals(testMonth.getDays().size(), 2); 
        assertTrue(testMonth.toString().equals(correct));
        
        testMonth = new DataMonth("test1.csv");
        correct = "2014-06, TISH: Wind = [0.1000, 1.0000, 1.0000], ";
        correct += "Solar Radiation = [1.0000, 1.0000, 1.0000, 1.0000]";
        System.out.println(correct);
        System.out.println(testMonth.toString());
        assertEquals(testMonth.getDays().size(), 1); 

        assertTrue(testMonth.toString().equals(correct));
        
        //testMonth = new DataMonth("test0.csv");
        //assertTrue(testMonth.getDays().size() == 0); 
        //assertTrue(testMonth.toString().equals(correct));
        
        //TODO: Complete the tests for new stuff
    }

    
    @Test
    public DataDay test_getWindSpeedMinDay() {
        // TODO Auto-generated method stub
        return null;
    }

    @Test
    public DataDay test_getWindSpeedMaxDay() {
        // TODO Auto-generated method stub
        return null;
    }

    @Test
    public Sample test_getWindSpeedAvgDay() {
        // TODO Auto-generated method stub
        return null;
    }

    @Test
    public DataDay test_getSolarRadiationMinDay() {
        // TODO Auto-generated method stub
        return null;
    }

    @Test
    public DataDay test_getSolarRadiationMaxDay() {
        // TODO Auto-generated method stub
        return null;
    }

    @Test
    public Sample test_getSolarRadiationAvgDay() {
        // TODO Auto-generated method stub
        return null;
    }
}
