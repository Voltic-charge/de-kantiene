
/**
 * Reageert als je teweinig geld hebt.
 * 
 * @author (Bas de Ruiter & Jeroen Bakker) 
 * @version (8-1-2015)
 */
public class TeWeinigGeldException extends Exception
{
   

    /**
     * Constructor for objects of class TeWeinigGeldException
     */
    public TeWeinigGeldException()
    {
    }

    public TeWeinigGeldException(Exception e){
        e.toString();
    }
    
    public TeWeinigGeldException(String message){
        super(message);
    }
    
    public String toString(){
        return "U heeft te weinig geld";    
    }
}
