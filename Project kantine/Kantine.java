/**
 * This class simulates a kantine with a cash register, a row, and methods for people to get in line
 * 
 * @author (Bas de Ruiter & Jeroen Bakker) 
 * @version (v1)
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
        //kassarij.sluitAchteraan(persoon);
        
        persoon = new Persoon();
        Dienblad dienblad = new Dienblad();
        persoon.pakDienblad(dienblad);
        for(String artikel : artikelnamen) {
            dienblad.voegToe(kantineAanbod.getArtikel(artikel));
        }        
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
}