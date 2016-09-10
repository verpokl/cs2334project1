import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Main test class for Sample
 * @author pvelesko
 *
 */
public class SampleTest {

    /**
     * Test that an invalid object is created
     */
    @Test
    public void testSample() {
        Sample test = new Sample();
        assertFalse(test.isValid());
    }

    @Test
    public void testSampleDouble() {
        Sample test = new Sample(-999.99);
        assertFalse(test.isValid());
        
        test = new Sample(1);
        assertTrue(test.isValid());
        assertEquals(test.getValue(), 1, 0.1);
    }

    @Test
    public void testToString() {
        Sample test = new Sample(1.0);
        assertTrue(test.toString().equals("1.0000"));
        
        test = new Sample(1.12345);
        assertTrue(test.toString().equals("1.1235"));
        
        test = new Sample(-999.9);
        assertTrue(test.toString().equals("invalid"));
    }

    @Test
    public void testIsValid() {
        Sample test = new Sample();
        assertFalse(test.isValid());
    }

}
