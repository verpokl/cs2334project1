/**
 * @author pvelesko
 * @version 2016-10-03
 */

/**
 * Abstract statistics class
 * @author pvelesko
 * @version 1.0
 */
public abstract class StatisticsAbstract {
    
    /**
     * Find the day with minimum wind speed
     * @return DataDay representing a day with minimum wind speed
     */
    public abstract DataDay getWindSpeedMinDay();

    
    /**
     * Find the day with maximum wind speed
     * @return DataDay representing it
     */
    public abstract DataDay getWindSpeedMaxDay();

    
    /**
     * Find the day with average wind speed
     * @return sample representing it
     */
    public abstract Sample getWindSpeedAvgDay();
    
    
    
    
    

    /**
     * Find the day with minimum wind speed
     * @return DataDay representing a day with minimum solar radiation
     */
    public abstract DataDay getSolarRadiationMinDay();

    
    /**
     * Find the day with maximum solar radiation
     * @return DataDay representing it
     */
    public abstract DataDay getSolarRadiationMaxDay();

    
    /**
     * Find the day with average solar radiation
     * @return Sample representing it
     */
    public abstract Sample getSolarRadiationAvgDay();

}
