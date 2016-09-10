import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author CS2334.  Modified by: ?????
 * <P>
 * Date: 2015-09-10 <BR>
 * Project 1
 * <P>
 * This class represents the data for all of the days within a single month
 *
 */


public class DataMonth {
	/** The set of days.  */
	private ArrayList<DataDay> days;
	
	// TODO: complete implementation
	
	
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
	 * @param fileName The name of a file that contains the data for a month.  For
	 * this project, it will be of the form "data/YYYY.csv"
	 * 
	 * @throws IOException  Error reading the file
	 */
	public DataMonth(String fileName) throws IOException
	{
		// TODO: complete implementation
		
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
	private void computeSolarRadiationStats(){
		solarRadiationMin = Double.POSITIVE_INFINITY;
		solarRadiationMax = Double.NEGATIVE_INFINITY;
		
		// TODO: complete implementation
				
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
	private void computeWindSpeedStats(){
		// TODO: complete implementation
				
	}
	
	// TODO: provide specified getters only
	
	/**
	 * Describe the month
	 * 
	 * @return A string describing all of the days and the statistics for the month
	 */
	public String toString(){
		// TODO: complete implementation
	}
	
}
