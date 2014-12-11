
/**
 * Deze klasse houdt de administratie bij van een kantine
 * 
 * @author (Jeroen Bakker en Bas de Ruiter) 
 * @version (1.0)
 */
public class Administratie
{
    //Aantal dagen in de week dat de kantine open is
    private static final int DAYS_IN_WEEK = 7;
    
    /**
     * constructor
     * Deze klasse is static omdat we geen instanties van deze klasse willen maken
     */
    private Administratie(){
        
    }
    
    /**
     * Deze methode berekent van de int array aantal de
     * gemiddelde waarde
     * @param aantal
     * @return het gemiddelde
     */
    public static double berekenGemiddeldAantal(int[] aantal) {
        int teller = 0;
        double totaal = 0;
        if(aantal.length > 0){
            for(int getal : aantal){
                teller++;
                totaal += getal;            
            }
            double gemiddelde = totaal/teller;
            return gemiddelde;
        }else{
            return 0;
        }
        //return totaal/teller;
    }
    
    /**
     * Deze methode berekent van de double array omzet de
     * gemiddede waarde
     * @param omzet
     * @return Het gemiddelde
     */
    public static double berekenGemiddeldeOmzet(double[] omzet) {
        int teller = 0;
        double totaal = 0;
        if(omzet.length > 0){
            for(double getal : omzet){
                teller++;
                totaal += getal;
            }
            double gemiddelde = totaal/teller;
            return gemiddelde;
        }else{
            return 0;
        }
    }
    
    /**
     * Methode om dagomzet uit te rekenen
     * @param omzet
     * @return array (7 elementen) met dagomzetten
     */
    public static double[] berekenDagOmzet(double[] omzet) {
        double[] temp=new double[7];
        for(int i=0;i<DAYS_IN_WEEK;i++) {
            int j=0;
            while(omzet.length > i+7*j) {
                temp[i]+= omzet[i+7*j];
                j++;
            }
        }
        return temp;
    }
}
