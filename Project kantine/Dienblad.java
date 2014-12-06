import java.util.Stack;
import java.util.Iterator;
/**
 * This class creates an object with a stack were you can store youre acticles
 * 
 * @author (Bas de Ruiter & Jeroen Bakker) 
 * @version (v1)
 */
public class Dienblad {
    private Stack<Artikel> artikelen;
 
    /**
     * Constructor
     */
    public Dienblad() {
        artikelen = new Stack<Artikel>();
    }
    /**
     * Methode om artikel aan dienblad toe te voegen
     * @param artikel
     */
    public void voegToe(Artikel artikel) {
         artikelen.add(artikel);
    }
    /**
     * @return Stack artikelen
     */
    public Iterator getDienblad(){
        Iterator artikelen = this.artikelen.iterator();
        
            
        return artikelen;
    }
}

