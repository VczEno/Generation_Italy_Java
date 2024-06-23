package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class esercizio1_2 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner file = new Scanner(new File("ESERCIZI\\es_07_vettori\\src\\res\\es1_auto2.txt"));
        Scanner kb = new Scanner(System.in);

        String risp = "";

        String[] modelli = file.nextLine().split("-");

        file.close();

        System.out.println("Inserisci un modello Fiat per verificarne la disponibilità");
        String input = kb.nextLine();

        for (String modello : modelli) {

            if (modello.equalsIgnoreCase(input.trim()))
                risp += "il modello fiat " + modello + " è disponibile!";

        }

        if (risp.equals(""))
            System.out.println("ERRORE: modello non trovato");
        else
            System.out.println(risp);

        kb.close();

    }

}
