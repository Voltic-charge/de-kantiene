
/**
 * Write a description of class Kantiene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kantine {
    private Kassa kassa;
    private KassaRij kassarij;
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
        }
        
         /**
          * Deze methode handelt de rij voor de kassa af.
         */
         public void verwerkRijVoorKassa() {
             while() {
                 //omitted
             }
         }
         /**
          * Deze methode telt het geld uit de kassa
          * @return hoeveelheid geld in kassa
          */
         public double hoeveelheidGeldInKassa() {
             //omitted
         }
         
         /**
          * Deze methode geeft het aantal gepasseerde artikelen.
          * @return het aantal gepasseerde artikelen
          */
         public int aantalArtikelen(){
             //omitted
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