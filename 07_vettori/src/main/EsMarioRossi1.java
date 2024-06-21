package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Scrivere un file chiamato "alfabeto.txt" contenente la seguente riga:
//ABCDEFGHIJKLMNOPQRSTUVWXYZ

//Livello 1
//Trasformare la parola "MARIOROSSI"
//in "12_0_17_8_14_17_14_18_18_8_" sapendo che 
//il valore numerico 12 corrisponde alla "M" dell'alfabeto.

//Livello 2
//Fare l'inverso rispetto all'esercizio 1
//Trasformare "12_0_17_8_14_17_14_18_18_8_"
//in "MARIOROSSI"

public class EsMarioRossi1 {
    public static void main(String[] args) throws FileNotFoundException {

        // variabile di tipo scanner per leggere il file
        Scanner file = new Scanner(new File("src\\res\\alfabeto.txt"));

        // splitto l'alfabeto in un array che conterrà una lettera per posizione
        String[] alfabeto = file.nextLine().split("");

        String nome = "MARIOROSSI";
        String codice = "";

        // splitto il nome nei singoli caratteri e li salvo in un array
        String[] caratteri = nome.split("");

        // ciclo for each per ogni carattere nel nome MARIOROSSI
        for (String c : caratteri) {

            // per ogni carattere del nome ciclo le lettere dell'alfabeto
            for (int i = 0; i < alfabeto.length; i++) {

                // quando trovo il carattere nell'alfabeto
                // concateno l'indice della lettera nell'array alfabeto
                if (c.equals(alfabeto[i]))
                    codice += i + "_";
            }
        }
        file.close();
        System.out.println(codice);
    }

}
