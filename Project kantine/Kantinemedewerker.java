
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
     * Constructor for objects of class Kantinemedewerker
     */
    public Kantinemedewerker(String medewerkersNummer, boolean isKassaBevoegd,
                             String bsn, String voornaam, String achternaam, 
                             int dag, int maand, int jaar, char geslacht)
    {
        super(bsn, voornaam, achternaam, dag, maand, jaar, geslacht);
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
    
    /**
     * druk kantinemedewerkers gegevens af
     */
    public String toString()
    {
        return
        "############################################" + "\n" +
        "Kantinemedewerker" + "\n" +
        //super.toString() + "\n" +
        "Medewerkersnummer: " + this.medewerkersNummer + "\n" +
        "isKassaBevoegd: " + this.isKassaBevoegd;
    }
    
    /**
     * methode om kortingspercentage op te vragen
     */
    public double geefKortingsPercentage(){
        return 0.35;
    }
    /** 
     * methode om op te vragen of er maximum per keer aan de korting zit
     */
    public boolean heeftMaximum(){
        return false;
    }
    /**
     * methode om het maximum kortingsbedrag op te vragen
     */
    public double geefMaximum(){
        return 0.00;
    }

}
