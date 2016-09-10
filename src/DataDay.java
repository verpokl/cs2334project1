/**
 * 
 * @author CS2334.  Modified by: ?????
 * <P>
 * Date: 2015-09-10 <BR>
 * Project 1
 * <P>
 * This class represents a summary of one day's data from a single Mesonet station.
 *
 */

public class DataDay {
    /** Year in which the data were sampled */
    private int year;
    /** Month in which the data were sampled */
    private int month;
    /** The day on which the data were sampled (1=January, 2=February, etc */
    private int day;
    
    // TODO: Fill in remaining components

    /**
     * DataDay constructor
     * 
     * @param year Year of the sample
     * @param month Month of the sample
     * @param day Day of the sample
     * @param solarRadiation Amount of solar radiation (in Mj/m^2)
     * @param stationID Station identifier
     * @param windSpeedMin Minimum wind speed
     * @param windSpeedAverage Average wind speed
     * @param windSpeedMax Maximum wind speed
     */
    public DataDay(int year, int month, int day, String stationID,
            Sample solarRadiation, Sample windSpeedMin, 
            Sample windSpeedAverage, Sample windSpeedMax) {
        
        // TODO: complete implementation
    }

    // TODO: supply the getters
    

    /**
     * Describe the data for the day
     * 
     * @return String describing the day
     */
    public String toString(){
        // TODO: complete the implementation

    }
    
}
