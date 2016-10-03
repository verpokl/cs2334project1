/**
 * @author pvelesko
 * @version 2016-09-21
 */
import java.io.IOException;


/**
 * Main driver class for project 1 
 * @author pvelesko
 * @version 1.0
 */
public class Driver {

    /**
     * @param args command line args
     * @throws IOException in case of problems with reading files
     */
    public static void main(String[] args) throws IOException { 
        DataMonth month = new DataMonth("./data/june_2014.csv");
        System.out.println(month.toString());
    }

}
