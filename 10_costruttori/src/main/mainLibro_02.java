package Oggetti_01.main;

import java.io.*;
import java.util.*;
import Oggetti_01.entities.Libro;
import Oggetti_01.entities.Vik;

public class mainLibro_02 {
    public static void main(String[] args) throws FileNotFoundException {
        // Leggo il file contenente l'elenco dei libri
        Scanner file = new Scanner(new File("Oggetti_01\\main\\elencoLibri.txt"));
        // Creo un AL elenco che conterrà SOLO i libri accettabili da quell'elenco
        ArrayList<Libro> elenco = new ArrayList<Libro>();
        // Dichiaro un oggetto l di tipo Libro
        Libro l;
        // Dichiaro e inizializzo una variabile rigaFile per controllare eventuali righe
        // di errore nel file
        int rigaFile = 0;
        String errori = "";
        String[] riga;
        while (file.hasNextLine()) {
            rigaFile++;
            // Gli androidi sognano pecore elettriche,P.K.Dick,Fantascienza,Urania,230,12.3
            riga = file.nextLine().split(",");
            // Siccome non mi fido, prima ancora di controllare i valori controllo che il
            // numero di valori
            // presenti sulla riga del file sia esattamente di 6 ovvero del numero
            // necessario alla creazione
            // del libro. Se sono 6 significa che posso controllarli. Se non sono 6, non li
            // considero nemmeno.
            if (riga.length == 6) {
                // riga[0] = "Gli androidi sognano pecore elettriche"; -> TITOLO
                // riga[1] = "P.K.Dick" -> AUTORE
                // Ora, prima di creare l'oggetto verifico se l'oggetto si può creare ovvero se
                // i parametri letti dal file
                // sono accettabili sulla base di regole DEFINITE ALL'INTERNO DELLA CLASSE
                // MODELLO.
                if (Libro.CHECKLIBRO(riga[0], riga[1], riga[2], riga[3],
                        Integer.parseInt(riga[4]), Double.parseDouble(riga[5]))) {
                    l = new Libro(riga[0], riga[1], riga[2], riga[3],
                            Integer.parseInt(riga[4]), Double.parseDouble(riga[5]));
                    elenco.add(l);
                } else
                    errori += "Alla riga " + rigaFile + " sono presenti errori.\n";
            } else
                errori += "Alla riga " + rigaFile + " non ci sono abbastanza parametri per la creazione di un Libro.\n";
        }
        file.close();

        String ris = "";
        if (errori.equals(""))
            ris = "Non sono presenti errori nel file.";
        else
            ris = "ERRORI\n" + errori;
        System.out.println(ris);

        // Stampiamo il nostro AL di Libri
        ris = "ELENCO DEI LIBRI\nNUMERO LIBRI: " + elenco.size() + "\n";
        for (Libro li : elenco)
            ris += li.toString() + "\n";
        System.out.println(ris);

        // Stampiamo i libri di un determinato autore
        // ORA SONO CERTO DI AVERE AUTORI ACCETTABILI e non mi devo preoccupare di fare
        // un check se il valore della
        // proprietà autore dell'oggetto Libro è accettabile o meno.
        String autoreCercato = "Tolkien";
        int libriTrovati = 0;
        ris = "LIBRI DI " + autoreCercato + "\n";
        for (Libro li : elenco) {
            if (Vik.checkStringIndexOf(autoreCercato, li.getAutore())) {
                libriTrovati++;
                ris += li.toString() + "\n";
            }
        }
        ris = libriTrovati > 0
                ? "Libri trovati: " + libriTrovati + "\n" + ris
                : "Non esistono libri di " + autoreCercato;
        System.out.println(ris);
    }
}