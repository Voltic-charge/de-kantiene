import java.util.LinkedList;
/**
 * This class is a LinkedList where you can store people in with the principle FIFO.
 * 
 * @author (Jeroen Bakker & Bas de Ruiter) 
 * @version (v2.0)
 */
public class KassaRij
{
    // instance variables - replace the example below with your own
    private LinkedList<Persoon> kassarij;
    
    /**
     * Constructor for objects of class KassaRij
     */
    public KassaRij()
    {
        // initialise instance variables
        kassarij = new LinkedList();        
    }
    
    /**
     * persoon sluit achter in de rij aan
     * @param persoon
     */
    public void sluitAchteraan(Persoon persoon) 
    {
        kassarij.add(persoon);        
    }
    
    /**
     * indien er een rij bestaat, de eerste persoon uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze
     * @return eerste persoon in de rij of null
     */
    public Persoon eerstePersoonInRij() {
        Persoon eerstePersoonInRij;
        if(erIsEenRij() == true){
            eerstePersoonInRij = kassarij.poll();          
        }else{
            eerstePersoonInRij = null;
        }
        return eerstePersoonInRij;
    }
    /**
     * Methode kijkt of er personen in de rij staan.
     * @return of er well of geen rij bestaat
     */
    public boolean erIsEenRij() {
        boolean rij;
        if(kassarij.size() > 0)
        {
            rij = true;
        }else{
            rij = false;
        }
        return rij;
    }
}
