package main;

import java.util.*;
import java.io.*;

public class Main_Eccezioni_03 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        // Immaginiamo di voler leggere il file
        // Oggetti_01\main\elencoParole.txt
        // Il programma ci avverte che potremmo incorrere nell'eccezione
        // FileNotFoundException ovvero il file non viene trovato al percorso designato.
        String percorso = "11_eccezioni\\src\\main\\elencoNumeri.txt";
        // L'oggetto di tipo Scanner lo dichiariamo fuori dal try catch
        // a dimostrazione del fatto che non è la dichiarazione il problema bensì
        // la creazione di un oggetto di tipo File che serve alla lettura dello Scanner.
        Scanner file = null;
        try {
            // Prova a creare un File con il percorso che gli abbiamo dato.
            file = new Scanner(new File(percorso));
            // Se legge questa riga significa che il file è stato trovato e il programma
            // procede come sempre.
            String[] riga;
            // Creiamo un AL nel quale inseriremo tutti i numeri letti dal file
            ArrayList<Integer> numeri = new ArrayList<Integer>();
            int numero;
            while (file.hasNextLine()) {
                // 9,3,42,65,2,1,1,743,0
                riga = file.nextLine().split(",");
                // Cicliamo riga e inseriamo ogni valore all'interno dell'AL numeri.
                for (int i = 0; i < riga.length; i++) {
                    // I dati all'interno del file sono String.
                    // Il tipo accettato dall'AL è int.
                    // Per poter inserire i valori letti da file all'interno dell'AL devo provare a
                    // parsarli.
                    // Il parse potrebbe generare un'eccezione che DEVO GESTIRE.
                    try {
                        numero = Integer.parseInt(riga[i]);
                        // Da qui in avanti tutti i valori sono di tipo INTERO e posso inserirli senza
                        // problemi nell'AL
                        numeri.add(numero);
                    } catch (NumberFormatException e) {
                        System.out.println("riga[" + i + "] contiene un " + riga[i] + " non parsabile a intero.");
                    }
                }
            }
            System.out.println("Dimensione dell'AL numeri: " + numeri.size());
            String ris = "";
            int indice;
            System.out.println(
                    "Inserisci un numero tra 0 e " + numeri.size() + " per stampare il valore in quella posizione.");
            try {
                indice = Integer.parseInt(tastiera.nextLine());
                ris = "RIGA 58: Hai scelto la posizione " + indice + ": " + numeri.get(indice);
            } catch (NumberFormatException e) {
                ris = "RIGA 62: Il valore inserito non è un numero.";
            } catch (IndexOutOfBoundsException e) {
                ris = "RIGA 66: Il valore inserito non è compreso tra 0 e " + numeri.size();
            }
            System.out.println(ris);
        } catch (FileNotFoundException e) {
            // Qui il programma finisce quando il FILE non viene trovato.
            System.out.println("RIGA 73: Non ho trovato il file.");
            e.printStackTrace();
        } finally {
            // Il blocco canonico TRY/CATCH comprende queste due keyword.
            // Ad esse all'occorrenza se ne può aggiungere una terza: FINALLY che identifica
            // un blocco di codice
            // ovvero un insieme di istruzioni che viene eseguito in tutti i casi ovvero sia
            // che il programma finisca
            // nel try, sia che il programma finisca nel catch.
            // Questo finally nello specifico riguarda la lettura del file quindi sia che
            // venga letto, sia che non venga letto
            // possiamo dire al programma di chiudere lo scanner:
            // PROBLEMA!
            // Scanner a questo punto del programma potrebbe non essere mai stato creato e
            // quindi essendo solo dichiarato
            // ha valore null...e non si può chiudere qualcosa che è null...
            try {
                file.close();
                System.out.println("Scanner chiuso con successo.");
            } catch (NullPointerException e) {
                System.out.println("Problemi nella chiusura dello Scanner. Probabilmente è null.");
            }
        }
        tastiera.close();
    }
}