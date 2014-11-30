import java.util.ArrayList;
/**
 * Write a description of class KassaRij here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KassaRij
{
    // instance variables - replace the example below with your own
    private int x;
    private ArrayList<Artikel> persoon;
    private ArrayList<Persoon> personen;

    /**
     * Constructor for objects of class KassaRij
     */
    public KassaRij()
    {
        // initialise instance variables
        x = 0;
        personen = new ArrayList<Persoon>();
    }
    /**
     * persoon sluit achter in de rij aan
     * @param persoon
     */
    public void sluitAchteraan(Persoon persoon) 
    {
        personen.add(persoon);        
    }
    /**
     * indien er een rij bestaat, de eerste persoon uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze
     * @return eerste persoon in de rij of null
     */
    public void eerstePersoonInRij() {//Persoon eerstePersoonInRij() {
        return ;
    }
    /**
     * Methode kijkt of er personen in de rij staan.
     * @return of er well of geen rij bestaat
     */
    public boolean erIsEenRij() {
        //method body omitted
        return true;
    }
}
