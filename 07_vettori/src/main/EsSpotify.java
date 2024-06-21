package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
SPOTIFY
-creare 3 vettori di dimensione 5: artisti, brani, durata(in minuti).
-andarli a riempire tramite lettura da file.
-il file deve essere strutturato in questo modo:
    artista1-artista2-artista3...
    brano1 brano2 brano3...
    durata1Pdurata2Pdurata3P...
- stampare il contenuto dei vettori attraverso uno o piu cicli for oppure for each
- la stampa deve visualizzarsi in questo modo:
artista1 - brano1 - durata1
artista2 - br.....
 */

public class EsSpotify {

    public static void main(String[] args) throws FileNotFoundException {

        String[] artisti = new String[5];
        String[] brani = new String[5];
        String[] durate = new String[5];

        String risp = "";

        String percorso = "src\\res\\spotify.txt";

        Scanner file = new Scanner(new File(percorso));

        if (file.hasNextLine())
            artisti = file.nextLine().split("-");
        if (file.hasNextLine())
            brani = file.nextLine().split(" ");
        if (file.hasNextLine())
            durate = file.nextLine().split("P");

        for (int i = 0; i < artisti.length; i++) {
            risp += artisti[i] + " - " + brani[i] + " - " + durate[i] + "\n";
        }
        System.out.println(risp);
        file.close();
    }
}
