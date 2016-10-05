import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author Edgar
 * @version Oct 5 2016
 * 
 * This class represents a years worth of data
 */
public class DataYear 
{
    //Specific year for data
    private int year;
    //Station's ID
    private String stationID;
    //Array contaning DataMonth arrays
    private ArrayList<DataMonth> months;
    
    public DataYear(String fileName) throws IOException
    {
      //create a buffered reader
      BufferedReader br = new BufferedReader(new FileReader(fileName));
      //assert (br.ready()); //assert that file is not empty
      String in = br.readLine();
      in = br.readLine(); 
      //skip the description line
      this.months = new ArrayList<DataMonth>(); 
      //initialize the arrayList to hold my stuff
      //TODO: finish implementation
//      while (in != null)
//      {
//          String[] tokenized = in.split(","); //tokenize
//          this.year = Integer.parseInt(tokenized[0]); //start parsing 
//          this.month = Integer.parseInt(tokenized[1]); //as per spec
//          int day = Integer.parseInt(tokenized[2]);
//          this.stationID = tokenized[3];
//          Sample solar = new Sample(Double.parseDouble(tokenized[4]));
//          Sample speedMax = new Sample(Double.parseDouble(tokenized[5]));
//          Sample speedMin = new Sample(Double.parseDouble(tokenized[6]));
//          Sample speedAvg = new Sample(Double.parseDouble(tokenized[7]));
//          
//          DataDay newDay = new DataDay(this.year,
//                  this.month, day, this.stationID,
//                  solar, speedMin, speedAvg, speedMax); 
//          //make a new day object
//          this.days.add(newDay); //add to my days
//          in = br.readLine();
//      }
//      br.close(); //clease the reader
//      this.computeSolarRadiationStats(); //calc solar stats
//      this.computeWindSpeedStats(); //and wind stats
      protected void addDay(DataDay day)
      {
          //TODO 
         
      }
      protected DataDay getItem(int i)
      {
          //TODO
          return null;
          
      }
      protected int itemCount() 
      {
          //TODO
          return 0;
      }
      public String toString()
      {
          TODO
          return null;    
      }
    }
}
