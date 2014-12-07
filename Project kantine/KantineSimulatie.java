/**
 * This class simulates a few days in a cantine. 
 * 
 * @author (Bas de Ruiter & Jeroen Bakker) 
 * @version (v1.)
 */

public class KantineSimulatie {
    private Kantine kantine;
    private Kassa kassa;
    private KantineAanbod kantineAanbod;
    /**
     * Constructor
     */
    public KantineSimulatie() {
        kantine=new Kantine();
        kassa = kantine.getKassa();
    }
     
    /**
     * Deze methode simuleert een aantal dagen in het
     * verloop van de kantine
     * @param dagen
     */
    public void simuleer(int dagen) {
        // for lus voor dagen
        for(int i=0; i <= dagen - 1; i++ ) {
            // per dag nu even vast 10+i personen naar binnen
            // laten gaan, wordt volgende week veranderd...
            // for lus voor personen
            for(int j=0;j<10+i;j++){
                kantine.loopPakSluitAan();       
            }
            int dag = i + 1;
            kantine.verwerkRijVoorKassa();
            System.out.println("*****************************************");
            System.out.println("Dag " + dag);
            System.out.println("Dagtotalen:");
            System.out.println("Totaal in kassa: " + kassa.hoeveelheidGeldInKassa());
            System.out.println("Totaal aantal artikelen: " + kassa.aantalArtikelen());
            kantine.resetKassa();
       
            
            // verwerk rij voor de kassa
            // toon dagtotalen (artikelen en geld in kassa)
            // reset de kassa voor de volgende dag
        }
    }
    
    /**
     * @return kantineaanbod
     */
    private KantineAanbod getKantineAanbod(){
        return kantineAanbod; 
    }
    
    /**
     * set the stock of various articles
     * @param String[] artikelnaam
     * @param double[] prijs
     * @param int[] hoeveelheid
     */
    public void setKantineAanbod(String[] artikel, double[] prijs, int[] hoeveelheid){
        kantineAanbod = new KantineAanbod(artikel, prijs, hoeveelheid);
    }
}
