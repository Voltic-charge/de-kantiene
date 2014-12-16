
/**
 * Klasse die een contante betaalwijze voorsteld
 * 
 * @author (Jeroen Bakker & Bas de Ruiter) 
 * @version (v1.0)
 */
public class Contant extends Betaalwijze
{
    /**
     * Methode om betaling af te handelen
     * @param tebetalen
     */
    public boolean betaal(double tebetalen) {
        if(tebetalen > this.saldo){
            return false;
        }else {
            this.saldo -= tebetalen;
            return true;
        }
    }   
}
