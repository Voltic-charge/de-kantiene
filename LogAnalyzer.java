/**
 * Read web server data and analyse
 * hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // voor het berekenen van het drukste moment
    private int[] total;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
        }
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
    /**
     * returned de waarde het eerste uur van de drukste twee uren
     */
    public int drukPeriode()
    {
       analyzeHourlyData();
       total = new int[24];
       int max = 0;
       int drukste = 0;
       /*
        * telt de uren bij elkaar op en zet ze in de variable total
        */
       for(int hour = 0; hour < hourCounts.length; hour++) {
           int secondhour = hour + 1;
           if(secondhour < hourCounts.length){
               total[hour] = hourCounts[hour] + hourCounts[secondhour];
               
               //System.out.println(hour + " - " + hours + ": " + total[hour]);
            }
        }
        /*
         * pakt de maximale waarde uit variable total en zet in drukste wat het start uur is
         */
       for(int index = 0; index <= total.length - 1; index++){
           if(max < total[index]){
                   max = total[index];
                   drukste = index;
                }
        }
       return hourCounts[drukste];
    }
    /**
     * maakt een lijst met alle uur waarden
     */
    public void test()
    {
        analyzeHourlyData();
       total = new int[24];
       int max = 0;
       int drukste = 0;
       for(int hour = 0; hour < hourCounts.length; hour++) {
           
           int hours = hour + 1;
           if(hours < hourCounts.length){
               total[hour] = hourCounts[hour] + hourCounts[hours];
               System.out.println(hour + " - " + hours + ": " + total[hour]);
               System.out.println(hour + ": " + hourCounts[hour]);// + " - " + hours + ": " + total[hour]);
            }
        }
    }
}
