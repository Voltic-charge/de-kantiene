import java.util.ArrayList;
/**
 * This class makes an object with all the information you need for a person
 * 
 * @author (Bas de Ruiter & Jeroen Bakker) 
 * @version (v2.0)
 */
public class Persoon
{
    // instance variables - replace the example below with your own
    private String bsn;
    private String voornaam;
    private String achternaam;
    private int dag;
    private int maand;
    private int jaar;
    private char geslacht;
    private Dienblad dienblad;

    /**
     * Constructor for objects of class Persoon
     */
    public Persoon(String bsn, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht)
    {
        this.bsn = bsn;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        setGeboorteDatum(dag, maand, jaar);
        this.geslacht = geslacht;
        dienblad = null;
    }

    /**
     * Constructor for objects of class Persoon
     * onderdeel van opgave 1 leertaakweek 2
     */
    public Persoon(){
        this.dag = 0;
        this.maand = 0;
        this.jaar = 0;
        this.geslacht = 'm';
    }

    /**
     * Set BSN
     */
    public void setBSN(String bsn)
    {
        this.bsn = bsn;
    }

    /**
     * Set Voornaam
     */
    public void setVoornaam(String voornaam)
    {
        this.voornaam = voornaam;
    }

    /**
     * Set Achternaam
     */
    public void setAchternaam(String achternaam)
    {
        this.achternaam = achternaam;
    }

    /**
     * Set Geboortejaar
     */
    public void setGeboorteDatum(int dag, int maand, int jaar)
    {
        if(dag >= 0 && maand >= 1 && maand <= 12 && jaar >= 1900 && jaar <=2100)
        {
            switch(maand)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                if(dag > 31){
                    System.out.println("Dag/maand combinatie bestaat niet!");
                    this.dag = 0;
                    this.maand = 0;
                    this.jaar = 0;
                }else
                {
                    this.dag = dag;
                    this.maand = maand;
                    this.jaar = jaar;               
                }
                break;

                case 2:
                boolean IsSchrikkelJaar  = ((jaar % 4 == 0) && (jaar % 100 != 0) || (jaar % 400 == 0));
                // boolean is true als newJaar = schikkeljaar.
                if(IsSchrikkelJaar){
                    if(dag > 29){
                        System.out.println("Dag/maand combinatie bestaat niet!");
                        this.dag = 0;
                        this.maand = 0;
                        this.jaar = 0;
                    }else{
                        this.dag = dag;
                        this.maand = maand;
                        this.jaar = jaar; 
                    }                   
                }else{
                    if(dag > 28){
                        System.out.println("Dag/maand combinatie bestaat niet!");
                        this.dag = 0;
                        this.maand = 0;
                        this.jaar = 0;
                    }else{
                        this.dag = dag;
                        this.maand = maand;
                        this.jaar = jaar; 
                    }
                }
                break;

                case 4:
                case 6:
                case 9:
                case 11:
                if(dag > 30){
                    System.out.println("Dag/maand combinatie bestaat niet!");
                    this.dag = 0;
                    this.maand = 0;
                    this.jaar = 0;
                }else
                {
                    this.dag = dag;
                    this.maand = maand;
                    this.jaar = jaar;
                }     
                break;
            }
        }else
        {
            System.out.println("De ingevoerde geboortedatum is ongeldig!!!");
        }  
    }

    /**
     * set Geslacht
     */
    public void setGeslacht(char geslacht)
    {
        if(geslacht != 'v' && geslacht != 'm')
        {
            this.geslacht = 0;
            System.out.println("De invoer van het geslacht klopt niet, voer in: 'v' of 'm'!");
        }else
        {  
            this.geslacht = geslacht;
        }
    }

    /**
     * Getter voor geboortedatum
     * @return Geboortedatum 
     */
    public String getGeboorteDatum() {
        String temp;
        if (dag==0 && maand==0 && jaar==0) {
            temp="Onbekend";
        }else{
            temp=dag+"/"+maand+"/"+jaar;
        }
        return temp;
    }

    /**
     * get burgerservice nummer
     */
    public String getBSN(){
        String temp;
        if(bsn.length() == 9)
        {
            temp = bsn;
            return temp;
        }else{
            temp = "Burgerservicenummer is ongeldig!!!";
            return temp;
        }
    }

    /**
     * get geslacht
     */
    public String getGeslacht(){
        String temp;
        switch(this.geslacht) {
            case 'v':
            temp = "vrouw";
            break;
            case 'm':
            temp = "man";
            break;
            default:
            temp = "onbekent";
            break;
        }
        return temp;
    }

    /**
     * get voornaam
     * return voornaam
     */
    public String getVoornaam()
    {
        return voornaam;
    }

    /**
     * get achternaam
     * return achternaam
     */
    public String getAchternaam()
    {
        return achternaam;
    }

    /**
     * get gegevens
     * print alle gegevens van de persoon
     */
    public String toString2()
    {
        return 
        "Voornaam: " + this.voornaam + "\n" +
        "Achternaam: " + this.achternaam + "\n" +
        "BSN: " + this.bsn + "\n" +
        "Geslacht: " + getGeslacht() + "\n" +
        "Geboortedatum: " + dag + "/" + maand + "/" + jaar;
    }

    /**
     * vergelijk twee objecten met elkaar
     * @param object
     * @return boolean
     */
    public boolean equals(Object object)
    {
        if(object == null){
            return false;
        }
        if(object == this){
            return true;
        }
        if(!(object instanceof Persoon)) {
            return false;            
        }
        Persoon p = (Persoon) object;
        return (getVoornaam().equals(p.getVoornaam()) && 
                getAchternaam().equals(p.getAchternaam()) &&
                getGeslacht().equals(p.getGeslacht()) &&
                getBSN().equals(p.getBSN()) &&
                getGeboorteDatum().equals(p.getGeboorteDatum()));
    }

    /**
     * Methode om dienblad te koppelen aan een persoon
     * @param dienblad
     */
    public void pakDienblad(Dienblad dienblad) {
        this.dienblad = dienblad; 
    }

    /**
     * methode die er voor zorgt dat je dit dienblad(van dit specifiek persoon) kan terughalen in andere klassen.
     */
    public Dienblad getDienblad(){
        return this.dienblad;
    }
}

