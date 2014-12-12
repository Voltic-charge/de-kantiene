
/**
 * Deze klasse moet een docent voorstellen
 * 
 * @author (Jeroen Bakker & Bas de Ruiter) 
 * @version (v1.0)
 */
public class Docent extends Persoon
{
    // instance variables - replace the example below with your own
    private String afdeling;
    private String afkorting;

    /**
     * Constructor for objects of class Docent
     */
    public Docent(String afdeling, String afkorting)
    {
        super();
        this.afdeling = afdeling;
        this.afkorting = afkorting;
    }

    /**
     * set afdeling
     * @param afdeling
     */
    public void setAfdeling(String afdeling)
    {
        this.afdeling = afdeling;
    }
    
    /**
     * set afkorting
     * @param afkorting
     */
    public void setAfkorting(String afkorting)
    {
        this.afkorting= afkorting;
    }
    
    /**
     * get afdeling
     * @return afdeling
     */
    public String getAfdeling()
    {
        return this.afdeling;
    }
    
    /**
     * get afkorting
     * @return afkorting
     */
    public String getAfkorting()
    {
        return this.afdeling;
    }
}
