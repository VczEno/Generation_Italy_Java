package main;
//Leggere un file denominato nomiCognomiEta.txt

//contenente la seguente riga:
//Paul:McCartney:82,Isabella:Rossellini:72,Paola:Barbato:53,Monica:Barbaro:34,Patrick:Melton:49
//Stampare:
//Elenco dei nomi
//Elenco dei cognomi
//Elenco delle anagrafiche solo di coloro che hanno un'età maggiore di 60 anni
//  L'anagrafica sarà composta da: COGNOME NOME ETA
//Media delle età delle persone con un'età compresa tra 30 e 50

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EsNomiCognomi {
    public static void main(String[] args) throws FileNotFoundException {

        // variabile di tipo scanner per leggere il file
        Scanner file = new Scanner(new File("src\\res\\nomiCognomiEta.txt"));

        // splitto la riga presente nel file per salvare i dati delle singole persone
        // nell'array
        String[] persone = file.nextLine().split(",");

        // variabile dove salvo i dati da stampare
        String elencoNomi = "";
        String elencoCognomi = "";
        String datiOver60 = "";

        // tengo conto della somma delle ete del numero di persone con eta nel range
        // 3-50
        int sommaEta = 0;
        int contatoreAdulti = 0;
        // array di appoggio dove splitto
        String[] dati;

        // per ogni persona presente nell'array
        for (String p : persone) {
            // splitto i dati in un array
            dati = p.split(":");
            // concateno nome e cognome agli elenchi
            elencoNomi += dati[0] + "\n";
            elencoCognomi += dati[1] + "\n";

            // se l'eta è maggiore di 60 concateno tutti i dati
            if (Integer.parseInt(dati[2]) > 60)
                datiOver60 += dati[0] + "\t" + dati[1] + "\t" + dati[2] + "\n";
            // se l'eta è compresa tra 30 e 50 tengo conto dell'eta per calcolare la media
            // alla fine e incremento il contatore
            if (Integer.parseInt(dati[2]) > 30 && Integer.parseInt(dati[2]) < 50) {
                sommaEta += Integer.parseInt(dati[2]);
                contatoreAdulti++;
            }
        }

        file.close();

        System.out.println("Elenco Nomi:\n" + elencoNomi + "\nElenco Cognomi:\n" + elencoCognomi + "\nDati Over 60:\n"
                + datiOver60 + "\nL'eta media delle persone che hanno tra i 30 e i 50 anni è pari a: "
                + (1.0 * sommaEta / contatoreAdulti));

    }

}
