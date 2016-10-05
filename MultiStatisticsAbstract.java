/**
 * 
 */

/**
 * @author pvelesko
 * @author Edgar M.
 *
 */
public abstract class MultiStatisticsAbstract extends StatisticsAbstract {

    /**
     * TODO:
     * @param i
     * @return
     */
    protected abstract StatisticsAbstract getItem(int i);

    /**
     * TODO
     * @return
     */
    protected abstract int itemCount();
    
    /**
     * Find the day with minimum wind speed
     * @return DataDay representing a day with minimum wind speed
     */
    @Override
    public abstract DataDay getWindSpeedMinDay();

    
    /**
     * Find the day with maximum wind speed
     * @return DataDay representing it
     */
    @Override
    public abstract DataDay getWindSpeedMaxDay();

    
    /**
     * Find the day with average wind speed
     * @return sample representing it
     */
    @Override
    public abstract Sample getWindSpeedAvgDay();
    
    /**
     * Find the day with minimum wind speed
     * @return DataDay representing a day with minimum solar radiation
     */
    @Override
    public abstract DataDay getSolarRadiationMinDay();

    
    /**
     * Find the day with maximum solar radiation
     * @return DataDay representing it
     */
    @Override
    public abstract DataDay getSolarRadiationMaxDay();

    
    /**
     * Find the day with average solar radiation
     * @return Sample representing it
     */
    @Override
    public abstract Sample getSolarRadiationAvgDay();

}
