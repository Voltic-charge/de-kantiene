
/**
 * Write a description of class Artikel here.
 * This class creates objects with a name and a price. 
 * 
 * @author (Bas de Ruiter & Jeroen Bakker) 
 * @version (v.1)
 */
public class Artikel
{
    // instance variables - replace the example below with your own
    private String naam;
    private double prijs;

    /**
     * Constructor for objects of class Artikel
     */
    public Artikel(String ArtikelNaam, double ArtikelPrijs)
    {
        // initialise instance variables
        naam = ArtikelNaam;
        prijs = ArtikelPrijs;
    }
    
    /**
     * constructor for objects of class Artikel
     * onderdeel van opgave 1 van leertaakweek 2
     */
    public Artikel(){
         naam = null;
         prijs = 0;
    }

     /**
      * Get ArtikelNaam
      */
    public String getArtikelNaam()
    {
         return naam;
    }  
    /**
     * Get ArtikelPrijs
     */
    public double getArtikelPrijs()
    {
        return prijs;
    }
   
    /**
     * Set ArtikelNaam
     */
    public void setArtikelNaam(String ArtikelNaam)
    {
        naam = ArtikelNaam;
    }
   
    /**
     * Set ArtikelPrijs
     */
    public void setArtikelPrijs(int ArtikelPrijs)
    {
        prijs = ArtikelPrijs;
    }
   
    /**
     * get gegevens
     * print alle gegevens van het artikel
     */
    public void drukAf()
    {
        System.out.println("############################################");
        System.out.println("Artikelnaam: " + naam);
        System.out.println("Artikelprijs: " + prijs +"cent");
        System.out.println("############################################");       
    }      
}
