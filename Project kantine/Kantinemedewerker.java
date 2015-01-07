
/**
 * Deze klasse stelt een kantinemedewerker voor
 * 
 * @author (Jeroen Bakker & Bas de Ruiter) 
 * @version (v1.0)
 */
public class Kantinemedewerker extends Persoon implements KortingskaartHouder
{
    // instance variables - replace the example below with your own
    private String medewerkersNummer;
    private boolean isKassaBevoegd;
    private double korting;
    private double maxKorting;

    /**
     * Constructor for objects of class Kantinemedewerker
     */
    public Kantinemedewerker(String medewerkersNummer, boolean isKassaBevoegd)
    {
        super();
        this.medewerkersNummer = medewerkersNummer;
        this.isKassaBevoegd = isKassaBevoegd;
        this.korting = 35.0;
        this.maxKorting = 0.0;
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
        return korting;
    }
    
    /**
     * methode om het maximum kortingsbedrag op te vragen
     */
    public double geefMaximum(){
        return maxKorting;
    }
}
