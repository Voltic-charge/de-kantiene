
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
        this.saldo = 7.50;
    }
    
    /**
     * Methode om betaling af te handelen
     * @param tebetalen
     */
    public void betaal(double tebetalen) throws TeWeinigGeldException {
        if(tebetalen > this.saldo){
            throw new TeWeinigGeldException("U heeft te weinig geld");
        }else {
            this.saldo -= tebetalen;
        }
    }   
}
