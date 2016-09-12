/**
 * 
 * @author CS2334.  Modified by: pvelesko
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
    /** Unique ID of the station */
    private String stationID;
    /** Maximum speed of wind for the day */
    private Sample windSpeedMax;
    /** Minimum speed of wind for the day */
    private Sample windSpeedMin;
    /** Average speed of wind for the day */
    private Sample windSpeedAverage;
    /** Amount of solar radiation for the day */
    private Sample solarRadiation;

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
        //set all the fields
        this.year = year;
        this.month = month;
        this.day = day;
        this.stationID = stationID;
        this.solarRadiation = solarRadiation;
        this.windSpeedMin = windSpeedMin;
        this.windSpeedMax = windSpeedMax;
        this.windSpeedAverage = windSpeedAverage;
        
    }

    /**
     * Describe the data for the day
     * 
     * @return String describing the day
     */
    public String toString()
    {
        String out = "";
        out += "%4d-%02d-%02d, "; //for the date
        out += "%s: "; //ID
        out += "Wind = [%.04f, %.04f, %.04f], "; //wind
        out += "Solar Radiation = %.4f"; // radiation
        return String.format(out, 
                this.getYear(), 
                this.getMonth(),
                this.getDay(),
                
                this.getStationID(), 
                
                this.getWindSpeedMin().getValue(), 
                this.getWindSpeedAverage().getValue(), 
                this.getWindSpeedMax().getValue(), 
                
                this.getSolarRadiation().getValue());
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @return the stationID
     */
    public String getStationID() {
        return stationID;
    }

    /**
     * @return the windMax
     */
    public Sample getWindSpeedMax() {
        return windSpeedMax;
    }

    /**
     * @return the windMin
     */
    public Sample getWindSpeedMin() {
        return windSpeedMin;
    }

    /**
     * @return the windAverage
     */
    public Sample getWindSpeedAverage() {
        return windSpeedAverage;
    }

    /**
     * @return the solarRadiation
     */
    public Sample getSolarRadiation() {
        return solarRadiation;
    }
    
    
}
