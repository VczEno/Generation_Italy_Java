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

public class EsMarioRossi2 {
    public static void main(String[] args) throws FileNotFoundException {

        // variabile di tipo scanner per leggere il file
        Scanner file = new Scanner(new File("src\\res\\alfabeto.txt"));

        // splitto l'alfabeto in un array che conterrà una lettera per posizione
        String[] alfabeto = file.nextLine().split("");

        String nome = "";
        String codice = "12_0_17_8_14_17_14_18_18_8_";

        // splitto il codice nei singoli valori e li salvo in un array
        String[] numeri = codice.split("_");

        // ciclo for each per ogni valore del codice numerico
        for (String n : numeri) {

            // per ogni carattere del nome ciclo le lettere dell'alfabeto
            for (int i = 0; i < alfabeto.length; i++) {

                // quando trovo l'indice pari al valore del codice
                // concateno la lettera associata a quell'indice
                if (Integer.parseInt(n) == i)
                    nome += alfabeto[i];
            }
        }
        file.close();
        System.out.println(nome);
    }

}
