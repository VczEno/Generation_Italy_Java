package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class esercizio1_3 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner file = new Scanner(new File("ESERCIZI\\es_07_vettori\\src\\res\\es1_auto3.txt"));
        Scanner kb = new Scanner(System.in);

        String risp = "";

        String[] modelli = file.nextLine().split("-");
        String[] prezziString = file.nextLine().split("-");
        double[] prezzi = new double[prezziString.length];

        for (int i = 0; i < prezzi.length; i++) {

            prezzi[i] = Double.parseDouble(prezziString[i]);
        }

        file.close();

        System.out.println("Inserisci un modello Fiat per verificarne la disponibilità");
        String input = kb.nextLine();

        for (int i = 0; i < prezzi.length; i++) {

            if (modelli[i].equalsIgnoreCase(input.trim()))
                risp += "il modello fiat " + modelli[i] + " è disponibile!\nA partire da " + prezzi[i] + " sterline";

        }

        if (risp.equals(""))
            System.out.println("ERRORE: modello non trovato");
        else
            System.out.println(risp);

        kb.close();

    }

}
