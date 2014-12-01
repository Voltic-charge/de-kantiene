
/**
 * Write a description of class Kantiene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kantine {
    private Kassa kassa;
    private KassaRij kassarij;
    private Persoon persoon;
    private Dienblad dienblad;
    private Artikel artikel;
    private Artikel artikel1;
    
    /**
     * Constructor
     */
         public Kantine() {
             kassarij=new KassaRij();
             kassa=new Kassa(kassarij);
         }
         
         /**
          * In deze methode wordt een Persoon en Dienblad
          * gemaakt en aan elkaar
          * gekoppeld. Maak twee Artikelen aan en plaats
          * deze op het dienblad.
          * Tenslotte sluit de Persoon zich aan bij de rij
          * voor de kassa.
          */
         public void loopPakSluitAan() {
             //omitted
              persoon = new Persoon();
              dienblad = new Dienblad();
              persoon.pakDienblad(dienblad);
              artikel = new Artikel();
              artikel1 = new Artikel();
              persoon.pakArtikel(artikel);
              persoon.pakArtikel(artikel1);
              kassarij.sluitAchteraan(persoon);
              kassarij.erIsEenRij();
        }
        
         /**
          * Deze methode handelt de rij voor de kassa af.
         */
        public void verwerkRijVoorKassa() {
             while(kassarij.erIsEenRij()) {
                 //omitted
                 kassa.rekenAf(kassarij.eerstePersoonInRij());
             }
         }
         /**
          * Deze methode telt het geld uit de kassa
          * @return hoeveelheid geld in kassa
          */
         public double hoeveelheidGeldInKassa() {
             //omitted
             return 0;
         }
         
         /**
          * Deze methode geeft het aantal gepasseerde artikelen.
          * @return het aantal gepasseerde artikelen
          */
         public int aantalArtikelen(){
             //omitted
             return 0;
         }
        
         /**
          * Deze methode reset de bijgehouden telling van
          * het aantal artikelen
          * en "leegt" de inhoud van de kassa.
          */
         public void resetKassa() {
             // omitted
         }
}