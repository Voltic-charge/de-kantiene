
/**
 * Klasse die de betaalwijze met pinpas voorsteld
 * 
 * @author (Jeroen Bakker & Bas de Ruiter) 
 * @version (06-01-2015)
 */
public class Pinpas extends Betaalwijze {
    private double kredietlimiet;
    
    /**
     * constructor of pinpas
     * Wordt alleen gebruikt als test, voor het setten van een saldo
     */
    public Pinpas(){
        this.saldo = 7.50;
    }
    
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
    public void betaal(double tebetalen) throws TeWeinigGeldException {
        if((this.saldo - tebetalen) < this.kredietlimiet){
            throw new TeWeinigGeldException("U heeft te weinig geld");
        }else {
            this.saldo -= tebetalen;
            
        }  
    }
}
