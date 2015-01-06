
/**
 * Klasse die een contante betaalwijze voorsteld
 * 
 * @author (Jeroen Bakker & Bas de Ruiter) 
 * @version (06-01-201)
 */
public class Contant extends Betaalwijze
{
    /**
     * constructor of contant
     * Wordt alleen gebruikt als test, voor het setten van een saldo
     */
    public Contant(){
        this.saldo = 5.00;
    }
    
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
