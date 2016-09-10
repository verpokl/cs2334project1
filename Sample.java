/**
 * 
 * @author CS2334.  Modified by: ?????
 * <P>
 * Date: 2016-09-10 <BR>
 * Project 1
 * <P>
 * This class represents individual, real-valued samples.  This class
 * explicitly addresses the fact that some samples are invalid.
 *
 */

/**
 * Sample class representing real world mesonet data. 
 * @author pvelesko
 *
 */
public class Sample {
	/** The observed value.  */
	private double value;
	
	/** Indicates whether the observation is a valid one */
	private boolean valid;
	
	/**
	 * Creates an invalid sample
	 */
	public Sample()
	{
	    this.valid = false;
	}
	
	/**
	 * creates a sample with checks for validity
	 * @param in sample data
	 */
	public Sample(double in)
	{
	    if(in > -900)
	    {
	        this.value = in;
	        this.valid = true;
	    }
	    else
	    {
            this.valid = false;  
	    }
	}
	
	/**
	 * Make a properly formatted string
	 * @return a String in proper format
	 */
	public String toString()
	{
	   if (this.isValid())
	   {
	       return String.format("%.4f", this.getValue());
	   } 
	   else
	   {
	       return "invalid";
	   }
	}

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @return the valid
     */
    public boolean isValid() {
        return valid;
    }
	
	
	
	
	
	
	
}
