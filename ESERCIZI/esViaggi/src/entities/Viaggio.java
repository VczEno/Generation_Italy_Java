package entities;

import java.io.FileNotFoundException;

public class Viaggio {

    private String destinazione;
    private int nGiorni;
    private String mese;
    private int nPosti;
    private String mezzo;

    public Viaggio(String destinazione, int nGiorni, String mese, int nPosti, String mezzo) {

        setDestinazione(destinazione);
        setnGiorni(nGiorni);
        setMese(mese);
        setnPosti(nPosti);
        setMezzo(mezzo);

    }

    public static boolean CHECKVIAGGIO(String destinazione, int nGiorni, String mese, int nPosti, String mezzo)
            throws NumberFormatException, FileNotFoundException {
        boolean ris = false;
        if (VikNumeri.StringIsPresente(destinazione.toLowerCase(), "ESERCIZI\\esViaggi\\src\\res\\destinazioni.txt") &&
                nGiorni > 0 &&
                checkMese(mese) &&
                nPosti > 0 &&
                VikNumeri.StringIsPresente(mezzo.toLowerCase(), "ESERCIZI\\esViaggi\\src\\res\\mezzi.txt"))
            ris = true;
        return ris;
    }

    public static boolean checkMese(String mese) throws FileNotFoundException {
        boolean risp = false;
        if (VikNumeri.StringIsPresente(mese.toLowerCase(), "ESERCIZI\\esViaggi\\src\\res\\mesi.txt"))
            risp = true;
        return risp;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public int getnGiorni() {

        return nGiorni;
    }

    public void setnGiorni(int nGiorni) {

        this.nGiorni = nGiorni;
    }

    public String getMese() {
        return mese;
    }

    public void setMese(String mese) {
        this.mese = mese;
    }

    public int getnPosti() {
        return nPosti;
    }

    public void setnPosti(int nPosti) {
        this.nPosti = nPosti;
    }

    public String getMezzo() {
        return mezzo;
    }

    public void setMezzo(String mezzo) {
        this.mezzo = mezzo;
    }

    public String toString() {
        return "Destinazione: " + destinazione + "\n" +
                "Giorni totali: " + nGiorni + "\n" +
                "Mese: " + mese + "\n" +
                "Posti prenotati: " + nPosti + "\n" +
                "Mezzo: " + mezzo + "\n" +
                "----------------------------------------";
    }

}
