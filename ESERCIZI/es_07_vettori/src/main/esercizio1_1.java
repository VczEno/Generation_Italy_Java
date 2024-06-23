package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class esercizio1_1 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner file = new Scanner(new File("ESERCIZI\\es_07_vettori\\src\\res\\es1_auto.txt"));
        Scanner kb = new Scanner(System.in);

        String risp = "";

        int nRighe = 0;
        while (file.hasNextLine()) {
            file.nextLine();
            nRighe++;
        }
        file.close();

        file = new Scanner(new File("ESERCIZI\\es_07_vettori\\src\\res\\es1_auto.txt"));

        String[] modelli = new String[nRighe];

        for (int i = 0; i < modelli.length; i++) {
            modelli[i] = file.nextLine();
        }

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
