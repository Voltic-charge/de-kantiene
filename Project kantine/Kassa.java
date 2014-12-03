/**
 * Write a description of class Kassa here.
 * This class creates a kassa.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kassa {
    private double totaalPrijs;
    private int totaalGepasseerd;
    
    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij) {
        totaalGepasseerd = 0;         
    }
    /**
     * vraag het aantal artikelen en de totaalprijs op.
     * De implementatie wordt later vervangen
     * door een echte betaling door de persoon.
     * @param persoon die moet afrekenen
     */
    public void rekenAf(Persoon persoon) {
        int aantalArtikelen;
        double teBetalen;
        Dienblad blad = persoon.getDienblad();
        aantalArtikelen = blad.getAantalArtikelen(); 
        teBetalen = blad.getTotaalPrijs(); 
        totaalPrijs += teBetalen;
        totaalGepasseerd += aantalArtikelen;
         
        //System.out.println("############################################");
        //System.out.println("KASSABON"); 
        //System.out.println("Te betalen: " + teBetalen + " euro");
        //System.out.println("Aantal artikelen: " + aantalArtikelen); 
        // System.out.println("############################################");
    }
     
    /**
     * Geeft het aantal artikelen dat de kassa
     * heeft gepasseerd,
     * vanaf het moment dat de methode resetWaarden
     * is aangeroepen.
     * @return aantal artikelen
     */
    public int aantalArtikelen() {
        return totaalGepasseerd;    
    }
     
    /**
     * Geeft het totaalbedrag van alle artikelen die
     * de kassa zijn gepasseerd, vanaf het moment dat de methode
     *resetKassa
     * is aangeroepen.
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        return totaalPrijs;
    }
    
    /**
     * reset de waarden van het aantal gepasseerde artikelen en
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa() {
        totaalGepasseerd = 0;
        totaalPrijs = 0;
    }
}
 