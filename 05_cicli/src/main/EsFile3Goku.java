
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EsFile3Goku {
    /*
     * Scrivere un programma che chieda all'utente di inserire una destinazione.
     * Verificare che la destinazione inserita sia presente nel seguente elenco
     * inserito
     * in un file chiamato "destinazioni.txt"
     * Londra
     * Roma
     * Parigi
     * Madrid
     * Barcellona
     * 
     * LIVELLO 1 - GOKU
     * Se la destinazione è presente il programma termina stampando un feedback
     * all'utente.
     * Se la destinaizone NON è presente invece stampiamo che non è presente e
     * ripetiamo
     * la domanda finché non viene inserito un valore corretto.
     * 
     * LIVELLO 2 - SUPER SAYAN
     * Se l'utente scrive una destinazione non presente nell'elenco (immaginiamo
     * Oslo),
     * dalla seconda volta in avanti oltre alla richiesta di inserire
     * una destinazione valida stampare l'elenco delle destinazioni disponibili
     * formattato come segue:
     * 
     * La destinazione Oslo non è disponibile.
     * Ti proponiamo:
     * ELENCO DESTINAZIONI
     * 1: Londra
     * 2: Roma
     * 3: Parigi
     * 4: Madrid
     * 5: Barcellona
     * 
     * Ripetere questo processo finché l'utente non inserirà una destinazione
     * presente tra quelle in elenco.
     */

    public static void main(String[] args) throws FileNotFoundException {

        Scanner tastiera = new Scanner(System.in); // dichiaro la variabile di tipo scanner per permettere all'utente di
                                                   // fornire input da tastiera

        String percorso = "src\\res\\Destinazioni.txt";
        Scanner file; // dichiaro le variabili per leggere il file

        System.out.println("Inserisci una destinazione"); // chiedo all'utente di inserire una destinazione
        String risp = tastiera.nextLine(); // registro la risposta dell'utente

        String riga = ""; // variabile d'appoggio dove salvo le righe lette dal file

        Boolean presente = false; // variabile booleana inizializzata a falso, verrà sovrascritto una volta che l'
                                  // utente inserirà una destinazione presente nell'elenco

        // ciclo do while, che si esegue almeno una volta, e cicla finchè la variabile
        // presente è false
        do {

            file = new Scanner(new File(percorso)); // 'apro' il file da leggere, ogni volta affinchè possa leggerlo di
                                                    // nuovo

            // ciclo while che si esegue finchè ci sono righe da leggere nel file
            while (file.hasNextLine()) {

                riga = file.nextLine(); // salvo il valore della righa nella variabile d' appoggio

                if (risp.equalsIgnoreCase(riga)) { // se l'input dell'utente è pari ad una destinazione presente nel
                                                   // file entro nell'if e rendo true la variabile presente
                    presente = true;
                }

            }

            file.close(); // chiudo il file una volta finita la lettura

            if (presente) { // se la destinazione è presente entro nell'if stampo il messaggio e termino il
                            // programma
                System.out.println(" Destinazione presente");
            } else { // altrimenti chiedo nuovamente all'utente di inserire una destinazione
                System.out.println(
                        "Destinazione non dispobile. Inserisci una nuova destinazione");
                risp = tastiera.nextLine();

            }

        } while (presente == false);

        tastiera.close();

    }

}
