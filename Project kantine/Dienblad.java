import java.util.Stack;
/**
 * Write a description of class Diemblad here.
 * This class creates an object with a stack were you can store youre acticles
 * 
 * @author (Bas de Ruiter & Jeroen Bakker) 
 * @version (v1)
 */
public class Dienblad {
    private Stack<Artikel> artikelen;
 
    /**
     * Constructor
     */
    public Dienblad() {
        artikelen = new Stack<Artikel>();
    }
    /**
     * Methode om artikel aan dienblad toe te voegen
     * @param artikel
     */
    public void voegToe(Artikel artikel) {
         artikelen.add(artikel);
    }
    
    /**
     * Methode om aantal artikelen op dienblad te tellen
     * @return Het aantal artikelen 
     */
    public int getAantalArtikelen() {
         return artikelen.size();
    }
    
    /**
     * Methode om de totaalprijs van de artikelen 
     * op dienblad uit te rekenen
     * @return De totaalprijs
     */
    public double getTotaalPrijs() {
        double totaal = 0;
        if(artikelen.size() > 0){
            for (Artikel artikel : artikelen){
                totaal += artikel.getArtikelPrijs();
            }
     
        }
        return totaal;
        // Kijk wat de kosten zijn per product
        // Tel alle kosten per product bij elkaar op.
        // geef totaal terug
        //return 0;
    }
}

