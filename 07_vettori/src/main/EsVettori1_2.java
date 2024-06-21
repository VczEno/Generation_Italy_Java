package main;

import java.util.Scanner;

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

public class EsVettori1_2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String[] nomi;
        String invitato;
        String risp = "Lista invitati: ";
        System.out.println("Inserisci la dimensione dell'array");
        int dimensione = Integer.parseInt(kb.nextLine());
        if (dimensione == 0)
            System.out.println("Niente festa");
        else {
            nomi = new String[dimensione];
            for (int i = 0; i < nomi.length; i++) {
                System.out.println("inserisci il nome dell'invitato");
                invitato = kb.nextLine();
                nomi[i] = invitato.equals("") ? "ERRORE" : invitato;
                if (i != (nomi.length - 1))
                    risp += nomi[i] + ", ";
                else
                    risp += nomi[i] + ".";

            }
        }

        kb.close();
        System.out.println(risp);
    }

}
