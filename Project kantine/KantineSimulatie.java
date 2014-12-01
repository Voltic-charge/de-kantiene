
/**
 * Write a description of class KantineSimulatie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class KantineSimulatie {
     private Kantine kantine;
     private int i;
     /**
      * Constructor
      */
     public KantineSimulatie() {
         kantine=new Kantine();
         i = 0;
     }
     
     /**
      * Deze methode simuleert een aantal dagen in het
      * verloop van de kantine
      * @param dagen
      */
    public void simuleer(int dagen) {
        // for lus voor dagen
        for(int k=0; k <= dagen - 1; k++ ) {
            // per dag nu even vast 10+i personen naar binnen
            // laten gaan, wordt volgende week veranderd...
            // for lus voor personen
            for(int j=0;j<10+i;j++){
                kantine.loopPakSluitAan();       
            }
            kantine.verwerkRijVoorKassa();
            System.out.println("Dag " + k + 1);
            System.out.println("Dagtotalen:");
            System.out.println("Totaal in kassa: " + kantine.hoeveelheidGeldInKassa());
            System.out.println("Totaal aantal artikelen: " + kantine.aantalArtikelen());
            
            
            // verwerk rij voor de kassa
            // toon dagtotalen (artikelen en geld in kassa)
            // reset de kassa voor de volgende dag
        }
     }
}
