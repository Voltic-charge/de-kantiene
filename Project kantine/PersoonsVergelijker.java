
/**
 * Deze klasse vergelijkt twee identieke personen met elkaar op verschillende manieren
 * 
 * @author (Bas de Ruiter) 
 * @version (v1.0)
 */
public class PersoonsVergelijker
{
       
    /**
     * Constructor for objects of class PersoonsVergelijker
     */
    public PersoonsVergelijker()
    {
        
    }

    /**
     * 
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String[] args)
    {
        Persoon bas1 = new Persoon("123456789", "Bas", "de Ruiter", 28, 03, 1997, 'm');
        Persoon bas2 = new Persoon("123456789", "Bas", "de Ruiter", 28, 03, 1997, 'm');
        System.out.println(bas1);
        System.out.println(bas2);
        if(bas1 == bas2){
            System.out.println("bas1 is bas2");
        }else{
            System.out.println("bas1 is niet bas2");
        }
        if(bas1.equals(bas2)){
            System.out.println("bas1 equals bas2");
        }else{
            System.out.println("bas1 equals niet bas2");;
        }
    }
}
