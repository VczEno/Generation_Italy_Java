
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class EsFile1 {
    /*
     * Scrivere un programma che legga un file contenente una serie di numeri
     * scritti uno sotto l'altro.
     * Es:
     * 5
     * 94
     * 3
     * 45
     * Stampare:
     * il numero dei numeri presenti nel file
     * la somma dei numeri
     * la media dei numeri
     */

    public static void main(String[] args) throws FileNotFoundException {

        /* dichiaro le variabili percorso e file per leggere il .txt */
        String percorso = "src\\res\\numeri.txt";
        Scanner file = new Scanner(new File(percorso));

        int nTot = 0; // variabile contatore dei numeri presenti nel file
        double somma = 0; // variabile per la somma, progressivamente aggiungo i numeri letti dal file
        String risp = ""; // variabile per registrare la risposta finale
        double riga; // variabile d'appoggio dove salvo il valore letto in ogni riga del file
        double media = 0; // variabile per calcolare la media, serve che sia duoble per avere i decimali

        // ciclo while che cicla finchè ci sono righe da leggere nel file
        while (file.hasNextLine()) {

            riga = Double.parseDouble(file.nextLine()); // leggo la riga come stringa e lo converto a Double
            somma += riga; // incremento la variabile somma con il valore appena letto
            nTot++; // incremento il contatore

        }
        file.close(); // finita la lettura chiudo l'oggetto file
        media = somma / nTot; // calcolo la media
        risp = "Il numero totale di numeri presenti nel file è: " + nTot + ".\nLa somma è pari a: " + somma
                + ".\nLa media è pari a: " + media + ".";
        // registro la risposta e la stampo
        System.out.println(risp);

    }
}
