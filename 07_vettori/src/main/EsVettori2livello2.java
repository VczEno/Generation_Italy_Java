package main;
//Creare un vettore di numeri interi

import java.util.Scanner;

//LIVELLO 2
//Chiedere all'utente quanti numeri vuole inserire nel vettore.
//In base alla risposta definire la dimensione.
//Chiedere all'utente il valore che intende associare ad ogni posizione.
//Se risponde "" associare il valore 0
//Stampare:
//Elenco dei numeri contenuti nel vettore
//La somma dei numeri
//La media dei numeri esclusi gli zeri

public class EsVettori2livello2 {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci la dimensione dell'array");

        int[] numeri = new int[Integer.parseInt(tastiera.nextLine())];

        String risposta = "I numeri contenuti nell'array sono: ";
        double somma = 0;
        double media = 0;

        int indice = 0;
        int nDiversiDaZero = 0;
        while (indice < numeri.length) {
            String input;
            System.out.println("Inserisci un valore per la posizione n " + (indice + 1) + " (indice " + indice + ")");
            input = tastiera.nextLine();

            if (input.equals("")) {
                numeri[indice] = 0;
            } else {
                numeri[indice] = Integer.parseInt(input);

            }
            if (numeri[indice] == 0)
                nDiversiDaZero++;
            risposta += " \t" + numeri[indice];
            somma += numeri[indice];
            indice++;

        }
        System.out.println("fuori dal while");
        media = somma / nDiversiDaZero;
        tastiera.close();
        System.out.println(risposta + "\n La somma è pari a: " + somma + "\n La media è pari a: " + media
                + "\n i numeri inseriti diversi da zero sono: " + nDiversiDaZero);

    }

}
