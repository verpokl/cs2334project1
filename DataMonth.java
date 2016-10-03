/**
 * @author pvelesko
 * @version 2016-09-21
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author CS2334.  Modified by: Paulius Velesko
 * <P>
 * Date: 2015-09-10 <BR>
 * Project 1
 * <P>
 * This class represents the data for all of the days within a single month
 */

/**
 * A class to reprent  month's worth of data
 * @author pvelesko
 * @version 1.0
 */
public class DataMonth {
    /** The set of days.  */
    private ArrayList<DataDay> days;
    private int year;
    private int month;
    private String stationID;
    private double windSpeedMin;
    private double windSpeedAverage;
    private double windSpeedMax;
    private double solarRadiationMin;
    private double solarRadiationMax;
    private double solarRadiationAverage;
    private double solarRadiationTotal;
    /**
     * DataMonth constructor
     * <P>
     * This constructor:
     * <UL>
     * <LI> Reads in the file, creating one DataDay object for each row
     * <LI> Places each DataDay object into an ArrayList
     * <LI> Closes the file
     * <LI> Computes the solar radiation and windSpeed statistics
     * <LI> Sets the month and year to be equal to those of the first day
     * </UL>
     * 
     * @param fileName The name of a file that contains the data for a month.For
     * this project, it will be of the form "data/YYYY.csv"
     * 
     * @throws IOException  Error reading the file
     */
    public DataMonth(String fileName) throws IOException
    {
        ///create a buffered reader
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        //assert (br.ready()); //assert that file is not empty
        String in = br.readLine();
        in = br.readLine(); //skip the description line
        this.days = new ArrayList<DataDay>(); 
        //initialize the arrayList to hold my stuff
        while (in != null)
        {
            String[] tokenized = in.split(","); //tokenize
            this.year = Integer.parseInt(tokenized[0]); //start parsing 
            this.month = Integer.parseInt(tokenized[1]); //as per spec
            int day = Integer.parseInt(tokenized[2]);
            this.stationID = tokenized[3];
            Sample solar = new Sample(Double.parseDouble(tokenized[4]));
            Sample speedMax = new Sample(Double.parseDouble(tokenized[5]));
            Sample speedMin = new Sample(Double.parseDouble(tokenized[6]));
            Sample speedAvg = new Sample(Double.parseDouble(tokenized[7]));
            
            DataDay newDay = new DataDay(this.year,
                    this.month, day, this.stationID,
                    solar, speedMin, speedAvg, speedMax); 
            //make a new day object
            this.days.add(newDay); //add to my days
            in = br.readLine();
        }
        br.close(); //clease the reader
        this.computeSolarRadiationStats(); //calc solar stats
        this.computeWindSpeedStats(); //and wind stats
    }
    
    /**
     * Compute and fill in the solar radiation-related statistics 
     * (solarRadiationMin, solarRadiationMax, solarRadiationAverage,
     * and solarRadiationTotal).
     * <P>
     * Notes: 
     * <UL>
     * <LI> Only valid samples can be used in these computations
     * <LI> You may assume that every month has at least one valid sample
     * </UL>
     */
    private void computeSolarRadiationStats()
    {
        this.solarRadiationMin = Double.POSITIVE_INFINITY;
        this.solarRadiationMax = Double.NEGATIVE_INFINITY;
        //accumulate the first value
        int samples = 0;
        for (int i = 0; i < this.days.size(); i++ )
        {
            if (this.days.get(i).getSolarRadiation().isValid())
            {
                samples += 1;
                double rad = this.days.get(i).getSolarRadiation().getValue();
                if (rad < this.solarRadiationMin)
                {
                    this.solarRadiationMin = rad; //set new min
                }
                if (rad > this.solarRadiationMax)
                {
                    this.solarRadiationMax = rad; //set new max
                }
                this.solarRadiationTotal += rad; //add current radiation total  
            }
        }     
        this.solarRadiationAverage = this.solarRadiationTotal / samples; //avg
    }
    
    /**
     * Compute and fill in the windSpeed-related statistics:
     * <UL>
     * <LI> windSpeedMin: minimum of the daily windSpeedMins
     * <LI> windSpeedMax: maximum of the daily windSpeedMaxes
     * <LI> windSpeedAverage: average of the daily windSpeedAverages
     * </UL>
     * <P>
     * Notes: 
     * <UL>
     * <LI> Only valid samples can be used in these computations
     * </UL>
     */
    private void computeWindSpeedStats()
    {
        this.windSpeedMin = Double.POSITIVE_INFINITY;
        this.windSpeedMax = Double.NEGATIVE_INFINITY;    
        this.windSpeedAverage = 0;    
    
        int samples = 0;
        for (int i = 0; i < this.days.size(); i++ )
        {
            if (this.days.get(i).getWindSpeedAverage().isValid())
            {
                //increase number of valid samples
                samples++;
                //add average speed
                this.windSpeedAverage += 
                        this.days.get(i).getWindSpeedAverage().getValue();
            }
            
            if (this.days.get(i).getWindSpeedMin().isValid()) 
            {
                double min = this.days.get(i).getWindSpeedMin().getValue(); 
                if (min < this.windSpeedMin)
                {
                    this.windSpeedMin = min;
                }
            }
            
            if (this.days.get(i).getWindSpeedMax().isValid())
            {
                double max = this.days.get(i).getWindSpeedMax().getValue();
                if (max > this.windSpeedMax)
                {
                    this.windSpeedMax = max;
                }
            }
    
        }
        this.windSpeedAverage = this.windSpeedAverage / samples;
    }
     
    /**
     * Describe the month
     * 
     * @return A string describing all of the days and 
     * the statistics for the month
     */
    public String toString()
    {
        String out = "%d-%02d, %s: Wind = "; //year, month, ID
        out += "[%.4f, %.4f, %.4f], Solar Radiation = "; // min avg max
        out += "[%.4f, %.4f, %.4f, %.4f]"; // min avg max total
        
        return String.format(out, this.getYear(), this.getMonth(),
            this.getStationID(), this.getWindSpeedMin(),
            this.getWindSpeedAverage(), this.getWindSpeedMax(),
            this.getSolarRadiationMin(), this.getSolarRadiationAverage(),
            this.getSolarRadiationMax(), this.getSolarRadiationTotal());
    }
    
    /**
     * @return the days
     */
    public ArrayList<DataDay> getDays() {
        return days;
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
     * @return the stationID
     */
    public String getStationID() {
        return stationID;
    }
    
    /**
     * @return the windSpeedMin
     */
    public double getWindSpeedMin() {
        return windSpeedMin;
    }
    
    /**
     * @return the windSpeedAverage
     */
    public double getWindSpeedAverage() {
        return windSpeedAverage;
    }
    
    /**
     * @return the windSpeedMax
     */
    public double getWindSpeedMax() {
        return windSpeedMax;
    }
    
    /**
     * @return the solarRadiationMin
     */
    public double getSolarRadiationMin() {
        return solarRadiationMin;
    }
    
    /**
     * @return the solarRadiationMax
     */
    public double getSolarRadiationMax() {
        return solarRadiationMax;
    }
    
    /**
     * @return the solarRadiationAverage
     */
    public double getSolarRadiationAverage() {
        return solarRadiationAverage;
    }
    
    /**
     * @return the solarRadiationTotal
     */
    public double getSolarRadiationTotal() {
        return solarRadiationTotal;
    }

}
