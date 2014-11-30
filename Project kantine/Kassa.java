
/**
 * Write a description of class Kassa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kassa {
    private Persoon persoon;
    
     /**
      * Constructor
      */
     public Kassa(KassaRij kassarij) {
        persoon = kassarij.eerstePersoonInRij();
        jaljdfaljflaj
         
     }
     /**
      * vraag het aantal artikelen en de totaalprijs op.
      * De implementatie wordt later vervangen
      * door een echte betaling door de persoon.
      * @param persoon die moet afrekenen
      */
     public void rekenAf(Persoon persoon) {
     //method body omitted
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
     return persoon;
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
     }
     
     /**
      * reset de waarden van het aantal gepasseerde artikelen en
      * de totale hoeveelheid geld in de kassa.
      */
     public void resetKassa() {
     //method body omitted
     }
    }
