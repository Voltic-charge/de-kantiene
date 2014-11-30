import java.util.ArrayList;
/**
 * Write a description of class KassaRij here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KassaRij
{
    // instance variables - replace the example below with your own
    private int x;
    private ArrayList<Persoon> personen;

    /**
     * Constructor for objects of class KassaRij
     */
    public KassaRij()
    {
        // initialise instance variables
        x = 0;
        personen = new ArrayList<Persoon>();
    }
    /**
     * persoon sluit achter in de rij aan
     * @param persoon
     */
    public void sluitAchteraan(Persoon persoon) 
    {
        personen.add(persoon);        
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
