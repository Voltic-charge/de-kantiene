import java.util.*;

/**
 * Deze methode simuleert eigenlijk de voorraad van een winkel
 * Het houdt de voorraad bij en vuld deze zo nodig bij.
 * @author (Jeroen Bakker & Bas de Ruiter)
 * @version (2.0)
 */
public class KantineAanbod {
    // interne opslag voorraad
    private HashMap<String, ArrayList<Artikel>> aanbod;
    private String[] artikelnaam;
    private int[] hoeveelheid;
    private double[] prijs;
    
    /**
     * Constructor. Het eerste argument is een lijst met artikelnamen,
     * het tweede argument is een lijst met prijzen en het derde argument
     * is een lijst met hoeveelheden. Let op: de dimensies van de drie arrays
     * moeten wel gelijk zijn!
     */
    public KantineAanbod(String[] artikelnaam, double[] prijs, int[] hoeveelheid) {
        aanbod=new HashMap<String, ArrayList<Artikel>>();
        this.artikelnaam = artikelnaam;
        this.hoeveelheid = hoeveelheid;
        this.prijs = prijs;
                
        for(int i=0;i<artikelnaam.length;i++) 
        {
            ArrayList<Artikel> artikelen=new ArrayList<Artikel>();
            for(int j=0;j<hoeveelheid[i];j++) 
            {
                artikelen.add(new Artikel(artikelnaam[i], prijs[i]));
            }
            aanbod.put(artikelnaam[i], artikelen);
        }
    }

    /*
     * Private methode om de lijst van artikelen te krijgen op basis van de    
     * naam van het artikel. Retourneert null als artikel niet bestaat.
     */
    private ArrayList<Artikel> getArrayList(String productnaam) {
         return aanbod.get(productnaam); 
    }

    /**
     * Private methode om een Artikel van de stapel artikelen af te pakken. 
     * Retourneert null als de stapel leeg is.
     */
    private Artikel getArtikel(ArrayList<Artikel> stapel) {
        if (stapel==null) { 
            return null;
        }
        if (stapel.size() == 100)
        {
           return null;
        }
        else 
        {
            Artikel a=stapel.get(0);
            stapel.remove(0);
            checkVoorraad();
            return a;
        }
    }
    
    /**
     * checkVoorraad controleerd voor elk artikel of deze onder het bestelniveau is
     * en vult deze bij als dit zo nodig is
     */
    private void checkVoorraad(){
        for(int i = 0;i < artikelnaam.length; i++){
            ArrayList<Artikel> artikelen = aanbod.get(artikelnaam[i]);
            if(artikelen.size()<=100){
                while(artikelen.size()<= hoeveelheid[i]){
                   aanbod.get(artikelnaam[i]).add(new Artikel(artikelnaam[i], prijs[i]));
                }
            }
        }
    }

    /**
     * Publieke methode om een artikel via naam van de stapel te pakken.
     * Retouneert null als artikel niet bestaat of niet op voorraad is.
     * @param naam (van artikel)
     * @return artikel (of null)
     */
    public Artikel getArtikel(String naam) {
        return getArtikel(getArrayList(naam));
    }
}