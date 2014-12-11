import java.util.Iterator;
/**
 * This class creates a kassa.
 * 
 * @author (Jeroen Bakker & Bas de Ruiter) 
 * @version (v2.0)
 */
public class Kassa {
    private double totaalPrijs;
    private int totaalGepasseerd;
    private int afrekenTeller;
    //private Iterator<Artikel> artikelen;
    
    /**
     * Constructor
     */
    public Kassa(KassaRij kassaRij) {
        totaalGepasseerd = 0; 
        totaalPrijs = 0;
        afrekenTeller = 0;
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
        Iterator<Artikel> artikelen = dienblad.getIterator();
        while(artikelen.hasNext()){
            Artikel artikel = artikelen.next();
            teBetalen += artikel.getArtikelPrijs();
            aantalArtikelen++;
        }

        this.totaalPrijs += teBetalen;
        this.totaalGepasseerd += aantalArtikelen;
        this.afrekenTeller++;
         
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
        return this.totaalGepasseerd;    
    }
     
    /**
     * Geeft het totaalbedrag van alle artikelen die
     * de kassa zijn gepasseerd, vanaf het moment dat de methode
     *resetKassa
     * is aangeroepen.
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        return this.totaalPrijs;
    }
    
    /**
     * geef aantal keren dat is afgerekend
     */
    public int geefAfrekenTeller(){
        return this.afrekenTeller;
    }
    
    /**
     * reset de waarden van het aantal gepasseerde artikelen en
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa() {
        this.totaalGepasseerd = 0;
        this.totaalPrijs = 0;
        this.afrekenTeller = 0;
    }
    
    /**
     * print informatie over de kassa, hoe vaak is er afgerekend? 
     * Wat is het kastotaal
     * @param dag
     */
    public void getKassaInfo(int dag){
        System.out.println("*****************************************");
        System.out.println("Dag " + dag);
        System.out.println("Totaal in kassa: " + this.totaalPrijs);
        System.out.println("Totaal aantal artikelen: " + this.totaalGepasseerd);
        System.out.println("Aantal bezoekers: " + this.afrekenTeller);
    }
}
 