
/**
 * Deze klasse stelt een kantinemedewerker voor
 * 
 * @author (Jeroen Bakker & Bas de Ruiter) 
 * @version (v1.0)
 */
public class Kantinemedewerker extends Persoon
{
    // instance variables - replace the example below with your own
    private String medewerkersNummer;
    private boolean isKassaBevoegd;

    /**
     * Constructor for objects of class Kantinemedewerker
     */
    public Kantinemedewerker(String medewerkersNummer, boolean isKassaBevoegd)
    {
        super();
        this.medewerkersNummer = medewerkersNummer;
        this.isKassaBevoegd = isKassaBevoegd;
    }

    /**
     * set medewerkersNummer
     * 
     * @param  medewerkersNummer
     */
    public void setMedewerkersNummer(String medewerkersNummer)
    {
        this.medewerkersNummer = medewerkersNummer;
    }
    
    /**
     * set isKassaBevoegd
     * 
     * @param isKassaBevoegd
     */
    public void setIsKassaBevoegd(boolean isKassaBevoegd)
    {
        this.isKassaBevoegd = isKassaBevoegd;
    }
    
    /**
     * get medewerkersNummer
     * 
     * @return medewerkersNummer
     */
    public String getMedewerkersNummer()
    {
        return this.medewerkersNummer;
    }
    
    /**
     * get isKassaBevoegd
     * 
     * @return isKassaBevoegd
     */
    public boolean getIsKassaBevoegd()
    {
        return this.isKassaBevoegd;
    }
}
