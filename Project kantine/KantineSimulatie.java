import java.util.*;
import java.text.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;
import java.net.URISyntaxException;
/**
 * This class simulates a few days in a cantine. 
 * 
 * @author (Bas de Ruiter & Jeroen Bakker) 
 * @version (06-01-2015)
 */
public class KantineSimulatie {
    // kassa
    private Kassa kassa;
    // kantine
    private Kantine kantine;

    // kantineaanbod
    private KantineAanbod kantineaanbod;

    // random generator
    private Random random;

    //afronden van getallen
    private NumberFormat roundTwo = new DecimalFormat("#.00");
    
    private int aantalRegels;

    // aantal artikelen
    //private static final int AANTAL_ARTIKELEN=4;
    // aantal studenten
    //private static final int AANTAL_STUDENTEN=89;
    // aantal docenten
    //private static final int AANTAL_DOCENTEN=10;
    // aantal kantinemedewerkers
    //private static final int AANTAL_KANTINEMEDEWERKERS=1;

    // artikelen
    private String[] artikelnamen;
    //    new String[] {"Koffie","Broodje pindakaas", "Broodje kaas",
    //        "Appelsap"};

    // prijzen
    private Double[] artikelprijzen;
    // new double[]{1.50, 2.10, 1.65, 1.65};

    // minimum en maximum aantal artikelen per soort
    private static final int MIN_ARTIKELEN_PER_SOORT=10;
    private static final int MAX_ARTIKELEN_PER_SOORT=20;

    // minimum en maximum aantal personen per dag
    private static final int MIN_PERSONEN_PER_DAG=50;
    private static final int MAX_PERSONEN_PER_DAG=100;

    // minimum en maximum artikelen per persoon
    private static final int MIN_ARTIKELEN_PER_PERSOON=1;
    private static final int MAX_ARTIKELEN_PER_PERSOON=4;

    /**
     * Constructor
     */
    public KantineSimulatie(){
        boolean fileError;
        this.aantalRegels = 0;
        try{
            URL file = getClass().getClassLoader().getResource("artikelenaanbod.txt");
            if(file == null) {
                throw new FileNotFoundException("artikelenaanbod.txt");
            }

            Scanner aanbodden = new Scanner(new File(file.toURI()));
            //int aantalRegels = 0;
            //List<String> regels = ArrayList;
            //while(aanbodden.hasNext()){
            //    this.aantalRegels++;
            //}
            //aanbodden.close();
            //aanbodden.reset();
            
            ArrayList<String> artikelnamenList = new ArrayList<String>();
            List<Double> artikelprijzenList = new ArrayList<Double>();

            
            Scanner aanbod = new Scanner(new File(file.toURI()));
            int teller = 0;
            while(aanbod.hasNextLine()){
                String artikelInfo = aanbod.nextLine();
                String[] deel = artikelInfo.split(" ");
                String deel1 = deel[0];
                artikelnamenList.add(deel1);
                String deel2 = deel[1];
                double d = Double.valueOf(deel2);
                artikelprijzenList.add(d);            
                teller++;
            }
            aanbod.close();
            aanbod.reset();
            this.aantalRegels = artikelnamenList.size();
            artikelnamen = new String[this.aantalRegels];
            artikelprijzen = new Double[this.aantalRegels];
            
            artikelnamen = artikelnamenList.toArray(artikelnamen);
            artikelprijzen = artikelprijzenList.toArray(artikelprijzen);

            kantine=new Kantine();
            random=new Random();
            kassa = kantine.getKassa();
            int[] hoeveelheden=getRandomArray(
                    this.aantalRegels, MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);
            kantineaanbod=new KantineAanbod(artikelnamen, artikelprijzen,
                hoeveelheden);
            kantine.setKantineAanbod(kantineaanbod);
            fileError = false;

            
        }
        catch(URISyntaxException e) {
            System.out.println("Error: " + e);
            fileError = true;
        }
        
        catch(FileNotFoundException e) {
            System.out.println("Error: " + e);
            fileError = true;
        }

        if(fileError) {
            System.out.println("Niet gelukt om het file te lezen: artikelenaanbod.txt" );
            System.out.println("Daarom deze standaard artikelen");
            String[] artikelnamen = new String[] {"Koffie","Broodje pindakaas", "Broodje kaas",
                    "Appelsap"};
            Double[] artikelprijzen = new Double[]{1.50, 2.10, 1.65, 1.65};
            this.aantalRegels = 4;
            kantine=new Kantine();
            random=new Random();
            kassa = kantine.getKassa();
            int[] hoeveelheden=getRandomArray(
                    this.aantalRegels, MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);
            kantineaanbod=new KantineAanbod(artikelnamen, artikelprijzen,
                hoeveelheden);
            kantine.setKantineAanbod(kantineaanbod);
        }
    }

    /**
     * Methode om een array van random getallen liggend tussen min en
     * max
     * van de gegeven lengte te genereren
     * @param lengte
     * @param min
     * @param max
     * @return De array met random getallen
     */
    private int[] getRandomArray(int lengte, int min, int max) {
        int[] temp=new int[lengte];
        for(int i=0;i<lengte;i++) {
            temp[i]=getRandomValue(min, max);
        }
        return temp;
    }

    /**
     * Methode om een random getal tussen min(incl) en
     * max(incl) te genereren.
     * @param min
     * @param max
     * @return Een random getal
     */
    private int getRandomValue(int min, int max) {
        return random.nextInt(max-min+1)+min;
    }

    /**
     * Methode om op basis van een array van indexen voor de array
     * artikelnamen de bijhorende array van artikelnamen te maken
     * @param indexen
     * @return De array met artikelnamen
     */
    private String[] geefArtikelNamen(int[] indexen) {
        String[] artikelen=new String[indexen.length];
        for(int i=0;i<indexen.length;i++) {
            artikelen[i]=artikelnamen[indexen[i]];
        }
        return artikelen;
    }

    /**
     * Deze methode simuleert een aantal dagen in het
     * verloop van de kantine
     * @param dagen
     */
    public void simuleer(int dagen) {
        // for lus voor dagen

        int[] aantal = new int[dagen];
        double[] omzet = new double[dagen];
        double[] temp = new double[6];
        int index = 0;
        int index0 = 0;
        for(int i=0;i<dagen;i++) {
            // bedenk hoeveel personen vandaag binnen lopen
            int aantalpersonen= 100;
            // laat de personen maar komen...
            int aantaldocenten = 0;
            int aantalstudenten = 0;
            int aantalkantinemedewerkers = 0;
            for(int s=1;s<=aantalpersonen; s++){
                int kans = getRandomValue(1, 100);
                int aantalartikelen = 0;
                Integer nummer = s;
                String[] artikelen = null;
                int[] tepakken = null;
                Persoon persoon = null;
                if (kans >= 90 && kans <=  99){
                    persoon = new Docent("ict", "DOC", nummer.toString());  
                    aantaldocenten++;
                }
                if (kans >= 1 && kans <= 89){
                    persoon = new Student(nummer.toString(), "ict");
                    aantalstudenten++;
                }
                if (kans == 100) {
                    persoon = new Kantinemedewerker(nummer.toString(), true);
                    aantalkantinemedewerkers++;
                }
                aantalartikelen= getRandomValue(MIN_ARTIKELEN_PER_PERSOON, MAX_ARTIKELEN_PER_PERSOON); 
                tepakken=getRandomArray(aantalartikelen, 0, this.aantalRegels-1);
                artikelen=geefArtikelNamen(tepakken);
                kantine.loopPakSluitAan(persoon, artikelen);
            }

            // verwerk rij voor de kassa

            int dag = i + 1;
            kantine.verwerkRijVoorKassa();
            System.out.println("*****************************************");
            System.out.println("Dag " + dag);
            System.out.println("Dagtotalen:");
            System.out.println("Totaal in kassa: " + roundTwo.format(kassa.hoeveelheidGeldInKassa()));
            System.out.println("Totaal aantal artikelen: " + kassa.aantalArtikelen());
            System.out.println("Aantal bezoekers: " + kassa.geefAfrekenTeller());
            System.out.println("aantal docenten: " + aantaldocenten);
            System.out.println("aantal studenten: " + aantalstudenten);
            System.out.println("aantal kantinemedewerkers: " + aantalkantinemedewerkers);
            aantal[index] = kassa.aantalArtikelen();
            omzet[index] = kassa.hoeveelheidGeldInKassa();
            index++;
            kantine.resetKassa();
            //druk de dagtotalen af en hoeveel personen binnen
            // zijn gekomen
            // reset de kassa voor de volgende dag
        }

        System.out.println("*****************************************");
        System.out.println("Periode gemiddeldes van: " + dagen + " dagen");
        System.out.println("Gemmiddelde aantal producten per dag: " + roundTwo.format(Administratie.berekenGemiddeldeAantal(aantal)));
        System.out.println("Gemmiddelde omzet per dag: " + roundTwo.format(Administratie.berekenGemiddeldeOmzet(omzet)));
        System.out.println("Omzet per dag in de week");
        temp = Administratie.berekenDagOmzet(omzet);

        for(double dagGemiddelde : temp){
            switch(index0)
            {
                case 0:
                System.out.println("Maandag: " + roundTwo.format(dagGemiddelde));
                break;
                case 1:
                System.out.println("Dinsdag: " + roundTwo.format(dagGemiddelde));
                break;
                case 2:
                System.out.println("Woensdag: " + roundTwo.format(dagGemiddelde));
                break;
                case 3:
                System.out.println("Donderdag: " + roundTwo.format(dagGemiddelde));
                break;
                case 4:
                System.out.println("Vrijdag: " + roundTwo.format(dagGemiddelde));
                break;
                case 5:
                System.out.println("Zaterdag: " + roundTwo.format(dagGemiddelde));
                break;
                case 6:
                System.out.println("Zondag: " + roundTwo.format(dagGemiddelde));
                break;
            }
            index0++;            
        }  
    }
}