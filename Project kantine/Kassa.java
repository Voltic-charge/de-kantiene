import java.util.Iterator;
/**
 * This class creates a kassa.
 * 
 * @author (Jeroen Bakker & Bas de Ruiter) 
 * @version (v1)
 */
public class Kassa {
    private double totaalPrijs;
    private int totaalGepasseerd;
    private Iterator<Artikel> artikelen;
    
    /**
     * Constructor
     */
    public Kassa(KassaRij kassaRij) {
        totaalGepasseerd = 5; 
        totaalPrijs = 5;
    }
    
    /**
     * vraag het aantal artikelen en de totaalprijs op.
     * De implementatie wordt later vervangen
     * door een echte betaling door de persoon.
     * @param persoon die moet afrekenen
     */
    public void rekenAf(Persoon persoon) {
        int aantalArtikelen = 0;
        double teBetalen = 0;
        Dienblad dienblad = getDienblad(persoon);
        this.artikelen = dienblad.getDienblad();
        while(artikelen.hasNext()){
            Artikel artikel = this.artikelen.next();
            teBetalen += artikel.getArtikelPrijs();
            aantalArtikelen++;
        }

        totaalPrijs += teBetalen;
        totaalGepasseerd += aantalArtikelen;
         
        //System.out.println("############################################");
        //System.out.println("KASSABON"); 
        //System.out.println("Te betalen: " + teBetalen + " euro");
        //System.out.println("Aantal artikelen: " + aantalArtikelen); 
        // System.out.println("############################################");
    }
    
    /**
     * @return dienblad met de klasse Dienblad van een bepaald persoon
     */
    public Dienblad getDienblad(Persoon persoon){
        Dienblad dienblad = persoon.getDienblad();
        return dienblad;
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
 