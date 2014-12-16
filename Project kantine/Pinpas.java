
/**
 * Klasse die de betaalwijze met pinpas voorsteld
 * 
 * @author (Jeroen Bakker & Bas de Ruiter) 
 * @version (v1.0)
 */
public class Pinpas extends Betaalwijze {
    private double kredietlimiet;

    /**
     * Methode om kredietlimiet te zetten
     * @param kredietlimiet
     */
    public void setKredietLimiet(double kredietlimiet) {
        this.kredietlimiet = kredietlimiet;
    }

    /**
     * Methode om betaling af te handelen
     */
    public boolean betaal(double tebetalen) {
        if((this.saldo - tebetalen) < this.kredietlimiet){
            return false;
        }else {
            this.saldo -= tebetalen;
            return true;
        }  
    }
}
