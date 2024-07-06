package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entities.Viaggio;

public class main_viaggi {
    /**
     * LIVELLO 1
     * Scrivere una classe Viaggio con le seguenti proprietà private:
     * destinazione, nGiorni, mese, nPosti e mezzo
     * Creare un metodo per la determinazione del prezzo del viaggio
     * Creare tutti i metodi di controllo per le proprietà. Non vi metto paletti ma
     * se volete
     * potete seguire alcune linee guida:
     * una destinazione è valida se è presente in un file
     * nGiorni è valida se è maggiore di 0
     * mese è valido se esiste: da Gennaio a Dicembre o da 1 a 12
     * nPosti è valida se è maggiore di 0
     * mezzo è valido se è presente in un elenco di mezzi. Es.: aereo, nave,
     * macchina...
     * Leggere da un file un elenco di viaggi, creare gli oggetti solo se possibile
     * (in caso contrario
     * dare un feedback).
     * Stampare l'elenco dei viaggi
     * ------------------------------ FINO A QUI TUTTI
     * --------------------------------------------
     * --------------- PRIMA DI PROSEGUIRE RIPASSATE PER IL TEST ORALE DI DOMANI
     * -------
     * LIVELLO 2
     * Stampare l'elenco dei viaggi con un mezzo a vostra scelta (es nave)
     * Stampare l'elenco dei viaggi di almeno una settimana in nave
     * Stampare il prezzo medio dei viaggi in aereo
     * Stampare il numero dei viaggi che hanno un prezzo superiore alla media
     * LIVELLO 3
     * Stampare la differenza di prezzo tra il viaggio più costoso fatto in aereo e
     * quello
     * meno costoso fatto con un altro mezzo a vostra scelta.
     * 
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner file = new Scanner(new File("ESERCIZI\\esViaggi\\src\\res\\elencoViaggi.txt"));

        ArrayList<Viaggio> elenco = new ArrayList<Viaggio>();
        Viaggio v;
        int rigaFile = 0;
        String errori = "";

        String[] riga;
        while (file.hasNextLine()) {
            rigaFile++;
            riga = file.nextLine().split(",");

            if (riga.length == 5) {
                if (Viaggio.CHECKVIAGGIO(riga[0], Integer.parseInt(riga[1]), riga[2], Integer.parseInt(riga[3]),
                        riga[4])) {
                    v = new Viaggio(riga[0], Integer.parseInt(riga[1]), riga[2], Integer.parseInt(riga[3]), riga[4]);
                    elenco.add(v);
                } else
                    errori += "Alla riga " + rigaFile + " sono presenti errori.\n";
            } else
                errori += "Alla riga " + rigaFile
                        + " non ci sono abbastanza parametri per la creazione di un Viaggio.\n";
        }
        file.close();

        String ris = "";
        if (errori.equals(""))
            ris = "Non sono presenti errori nel file.";
        else
            ris = "ERRORI\n" + errori;
        System.out.println(ris);

        // Stampiamo il nostro AL di Libri
        ris = "ELENCO DEI VIAGGI\nNUMERO VIAGGI: " + elenco.size() + "\n";
        for (Viaggio vi : elenco)
            ris += vi.toString() + "\n";
        System.out.println(ris);
    }
}
