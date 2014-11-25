
/**
 * Write a description of class Artikel here.
 * 
 * @author (Bas de Ruiter) 
 * @version (v.1)
 */
public class Artikel
{
    // instance variables - replace the example below with your own
    private String Naam;
    private int Prijs;

    /**
     * Constructor for objects of class Artikel
     */
    public Artikel(String ArtikelNaam, int ArtikelPrijs)
    {
        // initialise instance variables
        Naam = ArtikelNaam;
        Prijs = ArtikelPrijs;
    }
    
    /**
     * constructor for objects of class Artikel
     * onderdeel van opgave 1 van leertaakweek 2
     */
    public Artikel(){
        
    }

    /**
     * Get ArtikelNaam
     */
   public String getArtikelNaam()
   {
        return Naam;
   }  
   /**
    * Get ArtikelPrijs
    */
   public int getArtikelPrijs()
   {
       return Prijs;
   }
   
   /**
    * Set ArtikelNaam
    */
   public void setArtikelNaam(String ArtikelNaam)
   {
       Naam = ArtikelNaam;
   }
   
   /**
    * Set ArtikelPrijs
    */
   public void setArtikelPrijs(int ArtikelPrijs)
   {
       Prijs = ArtikelPrijs;
   }/**
    * get gegevens
    * print alle gegevens van het artikel
    */
   public void drukAf()
   {
       System.out.println("############################################");
       System.out.println("Artikelnaam: " + Naam);
       System.out.println("Artikelprijs: " + Prijs +"cent");
       System.out.println("############################################");
       
       
   }
   
   
       
}
