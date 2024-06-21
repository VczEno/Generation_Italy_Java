package main;
//Creare un vettore di String

import java.util.Scanner;

//LIVELLO 1
//Decidendo voi la dimensione associare ad ogni posizione/indice un valore
//Stampare:
//Elenco delle String stampandole una vicino all'altra separata da una virgola
//  Se il nome è l'ultimo della lista aggiungere un "." anziché la canonica ", "
//  Es: string1, string2, string3.

//LIVELLO 2
//Chiedere all'utente quanti amici vuole invitare alla festa
//In base alla risposta definire la dimensione. Se risponde 0 stampare un
//messaggio e chiudere il programma.
//Altrimenti:
//Chiedere all'utente il valore che intende associare ad ogni posizione.
//Se risponde "" associare il valore "ERRORE"
//Stampare:
//Elenco delle String stampandole una vicino all'altra separata da una virgola
//  Se il nome è l'ultimo della lista aggiungere un "." anziché la canonica ", "
//  Es: string1, string2, string3.
//Il numero dei valori "ERRORE"

public class EsVettori1_1 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Inserisci la dimensione dell'array");
        String[] nomi = new String[Integer.parseInt(kb.nextLine())];
        String risp = "Lista dei nomi inseriti: \n";

        for (int i = 0; i < nomi.length; i++) {
            System.out.println("Inserisci un nome");
            nomi[i] = kb.nextLine();
            if (i != (nomi.length - 1))
                risp += nomi[i] + ", ";
            else
                risp += nomi[i] + ".";
        }
        kb.close();
        System.out.println(risp);
    }

}
