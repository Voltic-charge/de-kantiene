
/**
 * Write a description of class Kassa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kassa {
    private Persoon persoon;
    private double totaalPrijs;
    private int aantalArtikelen;
    private int totaalGepasseerd;
    private Dienblad blad;
    
     /**
      * Constructor
      */
     public Kassa(KassaRij kassarij) {
        //persoon = kassarij.eerstePersoonInRij();
       totaalGepasseerd = 0;
         
     }
     /**
      * vraag het aantal artikelen en de totaalprijs op.
      * De implementatie wordt later vervangen
      * door een echte betaling door de persoon.
      * @param persoon die moet afrekenen
      */
     public void rekenAf(Persoon persoon) {
         //method body omitted
         blad = persoon.getDienblad();
         aantalArtikelen = blad.getAantalArtikelen();
         totaalPrijs = blad.getTotaalPrijs();             
     }
     
     /**
      * Geeft het aantal artikelen dat de kassa
      * heeft gepasseerd,
      * vanaf het moment dat de methode resetWaarden
      * is aangeroepen.
      * @return aantal artikelen
      */
     public int aantalArtikelen() {
         //method body omitted
         return aantalArtikelen;
     
     }
     
     /**
      * Geeft het totaalbedrag van alle artikelen die
      * de kassa zijn gepasseerd, vanaf het moment dat de methode
      *resetKassa
      * is aangeroepen.
      * @return hoeveelheid geld in de kassa
      */
     public double hoeveelheidGeldInKassa() {
         //method body omitted
         return totaalPrijs;
     }
     
     /**
      * reset de waarden van het aantal gepasseerde artikelen en
      * de totale hoeveelheid geld in de kassa.
      */
     public void resetKassa() {
     //method body omitted
     aantalArtikelen = 0;
     totaalPrijs = 0;
    }
}
 