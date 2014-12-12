
/**
 * Deze klasse moet een student voorstellen
 * 
 * @author (Jeroen Bakker & Bas de Ruiter) 
 * @version (v1.0)
 */
public class Student extends Persoon
{
    // instance variables - replace the example below with your own
    private String studentNummer;
    private String studieRichting;

    /**
     * Constructor for objects of class Student
     */
    public Student(String studentNummer, String studieRichting)
    {
        super();
        this.studentNummer = studentNummer;
        this.studieRichting = studieRichting;
    }
    
    /**
     * Constructor for objects of class Student
     */
    public Student(String studentNummer, String studieRichting,
                   String bsn, String voornaam, String achternaam, 
                   int dag, int maand, int jaar, char geslacht)
    {
        super(bsn, voornaam, achternaam, dag, maand, jaar, geslacht);
        this.studentNummer = studentNummer;
        this.studieRichting = studieRichting;
    }

    /**
     * set studentNummer
     * @param studentNummer 
     */
    public void setStudentNummer(String studentNummer)
    {
        this.studentNummer = studentNummer;
    }
    
    /**
     * set studieRichting
     * @param studieRichting
     */
    public void setStudieRichting(String studieRichting)
    {
        this.studieRichting = studieRichting;
    }
    
    /**
     * get studentNummer
     * @return studentNummer
     */
    public String getStudentNummer()
    {
        return this.studentNummer;
    }
    
    /**
     * get studieRichting
     * @return studieRichting
     */
    public String getStudieRichting()
    {
        return this.studieRichting;
    }
    
    /**
     * druk studentgegevens af
     */
    public void drukAf()
    {
        System.out.println("############################################");
        System.out.println("Student");
        System.out.println("Studentnummer: "+ this.studentNummer);
        System.out.println("StudieRichting: "+ this.studieRichting);
    }
}
