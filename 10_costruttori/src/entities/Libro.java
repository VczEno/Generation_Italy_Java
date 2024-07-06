package Oggetti_01.entities;

import java.io.FileNotFoundException;

public class Libro
{
    private String titolo;
    private String autore;
    private String genere;
    private String casaEd;
    private int nPag;
    private double pBase;

    private static final String[] GENERI = {"Fantascienza","Fantasy","Graphic Novel"};

    /**
     * Il metodo CHECKLIBRO() riceve gli stessi parametri che poi verranno passati al costruttore. 
     * Essendo di tipo STATIC è un metodo di classe che quindi può essere richiamato PRIMA DELLA COSTRUZIONE DELL'OGGETTO. 
     * Il metodo CHECKLIBRO() richiama per ogni parametro un metodo di Vik che controlla quel tipo di parametro secondo determinate logiche. 
     * Se tutti i controlli sui singoli parametri risultano VERI, allora significa che possono essere passati al costruttore per la creazione 
     * dell'oggetto. Se uno solo di loro non passa il controllo, il libro non viene creato.
     * @param titolo
     * @param autore
     * @param genere
     * @param casaEd
     * @param nPag
     * @param pBase
     * @return boolean
     * @throws FileNotFoundException
     */
    public static boolean CHECKLIBRO(   String titolo, String autore, String genere, 
                                        String casaEd, int nPag, double pBase) throws FileNotFoundException
    {
        boolean ris = false;
        //Siccome il valore di Vik.MAX è impostato a 100 e questo creerebbe errori per nPag e pBase
        //andiamo a sovrascrivere quel valore nel metodo CHECKLIBRO così da poterlo utilizzare.
        Vik.MAX = 2000;
        if(     Vik.checkString(titolo) == true &&
                Vik.checkString(autore) == true &&
                Vik.StringIsPresente(genere, GENERI)    == true    &&
                Vik.StringIsPresente(casaEd, "Oggetti_01\\main\\elencoEditori.txt") == true &&
                Vik.isCompreso(nPag)    == true &&
                Vik.isCompreso(pBase)   == true
            )
            ris = true;
        return ris;
    }
    
    public Libro(   String titolo, String autore, String genere, 
                    String casaEd, int nPag, double pBase)
    {
        setTitolo(titolo);
        setAutore(autore);
        setGenere(genere);
        setCasaEd(casaEd);
        setnPag(nPag);
        setpBase(pBase);
    }

    public String getTitolo()
    {
        return titolo;
    }
    
    public void setTitolo(String titolo)
    {
        this.titolo = titolo;
    }
    
    public String getAutore()
    {
        return autore;
    }
    
    public void setAutore(String autore)
    {
        this.autore = autore;
    }
    
    public String getGenere()
    {
        return genere;
    }
    
    public void setGenere(String genere)
    {
        this.genere = genere;
    }
    
    public String getCasaEd()
    {
        return casaEd;
    }
    
    public void setCasaEd(String casaEd)
    {
        this.casaEd = casaEd;
    }
    
    public int getnPag()
    {
        return nPag;
    }
    
    public void setnPag(int nPag)
    {
        this.nPag = nPag;
    }
    
    public double getpBase()
    {
        return pBase;
    }
    
    public void setpBase(double pBase)
    {
        this.pBase = pBase;
    }

    public double prezzo()
    {
        return 0;
    }

    public String toString()
    {
        return  "Titolo: "      +    titolo     +   "\n"    +
                "Autore: "      +    autore     +   "\n"    +
                "Genere: "      +    genere     +   "\n"    +
                "Editore: "     +    casaEd     +   "\n"    +
                "Pagine: "      +    nPag       +   "\n"    +
                "Prezzo: "      +    prezzo()   +   "\n"    +
                "----------------------------------------"  ;
    }
}   