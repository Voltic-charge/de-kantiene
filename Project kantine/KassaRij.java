import java.util.LinkedList;
/**
 * Write a description of class KassaRij here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KassaRij
{
    // instance variables - replace the example below with your own
    private Persoon eerstePersoonInRij;
    private LinkedList<Persoon> kassarij;
    private boolean rij;

    /**
     * Constructor for objects of class KassaRij
     */
    public KassaRij()
    {
        // initialise instance variables
        kassarij = new LinkedList();
        //personen.add("lol");
        
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
        //method body omitted
        if(kassarij.size() > 0)
        {
            rij = true;
        }else{
            rij = false;
        }
        
        return rij;
    }
}
