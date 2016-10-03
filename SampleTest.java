/**
 * @author pvelesko
 * @version 2016-09-21
 */
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Main test class for Sample
 * @author pvelesko
 * @version 1.0
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

    /**
     * test return of a invalid double sapmle
     */
    @Test
    public void testSampleDouble() {
        Sample test = new Sample(-999.99);
        assertFalse(test.isValid());
        
        test = new Sample(1);
        assertTrue(test.isValid());
        assertEquals(test.getValue(), 1, 0.1);
    }

    /**
     * check correcttness of tostring
     */
    @Test
    public void testToString() {
        Sample test = new Sample(1.0);
        assertTrue(test.toString().equals("1.0000"));
        
        test = new Sample(1.12345);
        assertTrue(test.toString().equals("1.1235"));
        
        test = new Sample(-999.9);
        assertTrue(test.toString().equals("invalid"));
    }

    /**
     * test for validity
     */
    @Test
    public void testIsValid() {
        Sample test = new Sample();
        assertFalse(test.isValid());
    }
    
    /**
     * test less than
     */
    @Test
    public void testIsLessThan()
    {
        Sample a = new Sample(5.0);
        Sample b = new Sample(7.0);
        assertTrue(a.isLessThan(b));
        assertFalse(b.isLessThan(a));
        
        Sample c = new Sample();
        assertTrue(a.isLessThan(c));
        assertTrue(c.isLessThan(c));
        assertFalse(c.isLessThan(a));
    }

    /**
     * test greater than
     */
    @Test
    public void testIsGreaterThan()
    {
        Sample a = new Sample(5.0);
        Sample b = new Sample(7.0);
        assertFalse(a.isGreaterThan(b));
        assertTrue(b.isGreaterThan(a));
        
        Sample c = new Sample();
        assertTrue(a.isGreaterThan(c));
        assertTrue(c.isGreaterThan(c));
        assertFalse(c.isGreaterThan(a));
    }
}
