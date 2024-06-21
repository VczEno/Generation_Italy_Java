package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Creare un file chiamato elencoParole.txt
//Il file contiene le seguenti parole:
//Parola,ParolaLunga,ParolaMoltoLunga,ParolaLunga,Paro,LungaMoltoParola,Pa,ParolaLunga
//Stampare:
//1 - Il numero delle parole contenute nel file
//2 - L'elenco delle parole formattato come segue:
//    1: Parola
//    2: ParolaLunga
//    3: ParolaMoltoLunga
//    4: ParolaLunga
//    5: Paro
//    6: LungaMoltoParola
//    7: Pa
//    8: ParolaLunga
//3 - Il numero dei caratteri della parola più lunga 
//4 - La parola...o le parole...più lunghe!

public class EsParole {

    public static void main(String[] args) throws FileNotFoundException {

        // definisco la variabile di tipo scanner per leggere il file
        Scanner file = new Scanner(new File("src\\res\\esParole.txt"));
        String[] parole; // array che conterrà le singole parole

        parole = file.nextLine().split(","); // splitto il file nelle singole parole

        String risp = ""; // variabile string per registrare la risposta finale

        String[] singolaParola; // array di appoggio dove splitto mano mano le varie parole
        int maxLettere = 0; // variabile int dove registrerò il numero massimo di lettere

        // ciclo tutte le parole contenuto nell'array parole
        for (int i = 0; i < parole.length; i++) {
            // registro nella risposta le parole associate ad un numero
            risp += (i + 1) + ": " + parole[i] + "\n";
            // splitto la parola corrente nei singoli caratteri
            singolaParola = parole[i].split("");
            // se la lunghezza della parola corrente la più lunga incontrata finora
            // registro il numero di caratteri nella variabile maxLettere
            if (singolaParola.length > maxLettere)
                maxLettere = singolaParola.length;
        }
        // registro nella risposta il numero di caratteri della parola più lunga
        // presente nel file
        risp += "La parola più lunga contiene: " + maxLettere
                + " caratteri\nLe parola o le parole con più caratteri sono: ";

        // potrebbero esserci più parole della stessa lunghezza
        // ciclo for each dell'array che contiene le parole
        for (String parola : parole) {
            // per ogni parola rifaccio lo split
            singolaParola = parola.split("");
            // se la parola corrente ha il numero di caratteri massimo registrato
            // la concateno alla risposta
            if (singolaParola.length == maxLettere)
                risp += "\t" + parola;
        }
        System.out.println(risp);
        file.close();

    }
}
