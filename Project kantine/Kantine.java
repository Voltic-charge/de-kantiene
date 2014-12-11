/**
 * Deze klasse simuleert een kantine met een kasse, rij, en een methode die er voor zorgt dat mensen in een rij kunnen gaan staan.
 * 
 * @author (Bas de Ruiter & Jeroen Bakker) 
 * @version (v2.0)
 */
public class Kantine {
    private Kassa kassa;
    private KassaRij kassarij;
    private KantineAanbod kantineAanbod;
    
    /**
     * Constructor
     */
    public Kantine() {
        kassarij=new KassaRij(); 
        kassa=new Kassa(kassarij);
    }
         
    /**
     * In deze methode kiest een Persoon met een dienblad
     * de artikelen in artikelnamen.
     * @param persoon
     * @artikelnamen
     */
     public void loopPakSluitAan(Persoon persoon, String[] artikelnamen) {
        //Persoon persoon = new Persoon();
        //Dienblad dienblad = new Dienblad();
        //persoon.pakDienblad(dienblad);
        //Artikel artikel1 = new Artikel("patat", 2);
        //Artikel artikel2 = new Artikel("frikandel", 1);
        //dienblad.voegToe(artikel1);
        //dienblad.voegToe(artikel2);
                
        persoon = new Persoon();
        Dienblad dienblad = new Dienblad();
        persoon.pakDienblad(dienblad);
        for(String artikel : artikelnamen) {
            dienblad.voegToe(kantineAanbod.getArtikel(artikel));
        } 
        kassarij.sluitAchteraan(persoon);
     } 
        
    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() {
        while(kassarij.erIsEenRij()) {
            kassa.rekenAf(kassarij.eerstePersoonInRij());
        }
    }
        
    /**
     * getKassa
     */
    public Kassa getKassa(){
        return kassa;      
    } 
    
    /**
     * Deze methode reset de bijgehouden telling van
     * het aantal artikelen
     * en "leegt" de inhoud van de kassa.
     */
    public void resetKassa() {
        kassa.resetKassa();
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
    public void setKantineAanbod(KantineAanbod kantineAanbod){
        this.kantineAanbod = kantineAanbod;
    }
}