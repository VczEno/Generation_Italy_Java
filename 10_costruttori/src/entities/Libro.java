package Oggetti_01.entities;

public class Libro
{
    //Creiamo una classe modello Libro
    //Proprietà dell'OGGETTO -> deve esistere l'oggetto per poterle richiamare.
    public String titolo;
    public double prezzoBase;
    public double prezzo;
    
    //Proprietà della CLASSE -> Esistono a prescindere dall'oggetto
    //IVAMIN è una proprietà della classe Libro che identifica il valore minimo dell'iva da
    //applicare sui libri. Essendo il valore minimo consentito dobbiamo essere sicuri che non
    //venga sovrascritto o modificato quindi lo rendiamo FINAL.
    public static final int IVAMIN = 4;
    //Idem per IVAMAX. Nessun oggetto Libro in commercio potrà avere un valore di IVA superiore al 22%
    public static final int IVAMAX = 22;
    //Per quanto riguarda lo sconto invece la proprietà di classe non sarà final perché il valore
    //potrà cambiare a seconda del periodo dell'anno. Un libro ad esempio potrà avere uno sconto di
    //base del 5% che durante alcuni periodi varia diventando 10, 15, 50 etc.. a seconda della situazione.
    public static int SCONTO = 5;

    //Costruttore
    public Libro(String titolo, double prezzoBase)
    {
        this.titolo = titolo;
        this.prezzoBase = prezzoBase;
    }

    public Libro(String titolo, double prezzoBase, int iva, String casaEd)
    {
        this.titolo = titolo;
        this.prezzoBase = prezzoBase;
        this.prezzo = calcolaPrezzo(prezzoBase, iva, casaEd);
    }

    //Calcolare il prezzo di vendita
    //Come calcolo il prezzo di vendita?
    //Al prezzoBase aggiungo l'IVA e tolgo lo sconto.
    public double calcolaPrezzo(double pb, int i, String cEd)
    {
        double ris = pb;
        //100 : iva = prezzoBase : x
        //x = (iva * prezzoBase) / 100
        ris += (i * prezzoBase) / 100;
        if(cEd.equalsIgnoreCase("Mondadori"))
            SCONTO = 20;
        //A questo punto del codice il valore della proprietà di classe SCONTO può essere SOLO:
        //5 - se la casaEditrice ricevuta come parametro è diversa da "Mondadori"
        //20 - se la casaEditrice ricevuta come parametro è "Mondadori"
        ris -= (SCONTO * pb) / 100;
        return ris;
    }

    public String toString()
    {
        String ris =    "Titolo: "      +   titolo      +   "\n"        +
                        "Prezzo base: " +   prezzoBase  +   " euro\n"   ;
                        if(prezzo > 0)
                        {  
                            ris +=  "Sconto: "      +   SCONTO      +   "\n"        +
                                    "Prezzo: "      +   prezzo      +   " euro\n"   ;
                        }
        return ris;
    }
}