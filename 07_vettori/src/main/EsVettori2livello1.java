package main;
//Creare un vettore di numeri interi

import java.util.Scanner;

//LIVELLO 1
//Decidendo voi la dimensione associare ad ogni posizione/indice un valore
//Stampare:
//Elenco dei numeri contenuti nel vettore
//La somma dei numeri
//La media dei numeri

public class EsVettori2livello1 {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci la dimensione dell'array");

        int[] numeri = new int[Integer.parseInt(tastiera.nextLine())];

        String risposta = "I numeri contenuti nell'array sono: ";
        double somma = 0;
        double media = 0;

        int indice = 0;
        while (indice < numeri.length) {
            System.out.println("Inserisci un valore per la posizione n " + (indice + 1) + " (indice " + indice + ")");
            numeri[indice] = Integer.parseInt(tastiera.nextLine());
            risposta += " \t" + numeri[indice];
            somma += numeri[indice];
            indice++;

        }
        System.out.println("fuori dal while");
        media = somma / numeri.length;
        tastiera.close();
        System.out.println(risposta + "\n La somma è pari a: " + somma + "\n La media è pari a: " + media);

    }

}
