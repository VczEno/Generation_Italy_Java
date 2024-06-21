
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class EsFile4SS {

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

        String percorso = "src\\res\\Destinazioni.txt"; // percorso del file da leggere
        Scanner file = new Scanner(new File(percorso)); // variabile di tipo scanner per leggere il file
        Scanner tastiera = new Scanner(System.in); // variabile di tipo scanner per leggere gli input dell'utente
        String risp = "";
        boolean presente = false; // inizializzo la variabile a false, finchè l'utente non sceglie una
                                  // destinazione valida
        String destinazione = ""; // salvo la destinazione finale dell'utente

        System.out.println("Inserisci una destinazione"); // chiedo all'utente di indicare una destinazione
        risp = tastiera.nextLine();

        while (file.hasNextLine()) { // leggo il file riga per riga

            if (risp.equalsIgnoreCase(file.nextLine())) { // se l'utente indica una destinazione presente la salvo nella
                                                          // variabile destinazione e switcho la variabile presente a
                                                          // true
                presente = true;
                destinazione = risp;
            }
        }
        file.close(); // chiudo il file terminata la lettura

        while (presente == false) { // ciclo finchè l'utente non inserisce una destinazione valida

            System.out.println( // suggerisco all'utente le destinazioni disponibili e registro la sua risposta
                    "La destinazione non è disponibile.\nTi proponiamo:\nELENCO DESTINAZIONI\n1: Londra\n2: Roma\n3: Parigi\n4: Madrid\n5: Barcellona\n");
            risp = tastiera.nextLine();

            switch (risp.toLowerCase()) { // con uno switch confronto la risposta dell'utente con le opzioni
                                          // disponibili, funziona sia con i numeri che con le città
                                          // se l'esito è positivo registro la risposta e switcho la variabile presente
                                          // a true,
                                          // altrimento non faccio nulla si ripete il ciclo while
                case "londra":
                case "1":
                    presente = true;
                    destinazione = "Londra";
                    break;
                case "roma":
                case "2":
                    presente = true;
                    destinazione = "Roma";
                    break;
                case "parigi":
                case "3":
                    presente = true;
                    destinazione = "Parigi";
                    break;
                case "madrid":
                case "4":
                    presente = true;
                    destinazione = "Madrid";
                    break;
                case "barcellona":
                case "5":
                    presente = true;
                    destinazione = "Barcellona";
                    break;

                default:
                    break;
            }
        }

        // stampo un messaggio all'utente con la destinazione indicata
        System.out.println("Destinazione trovata: " + destinazione);
        tastiera.close();
    }
}
