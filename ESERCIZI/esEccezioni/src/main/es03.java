package main;
/* Esercizio 3                     

parte A:
Scrivi un programma che inseriti due numeri interi da tastiera stampi a video il risultato della divisione di tali numeri, intercettando l'eventuale eccezione della divisione per 0.
parte B:
aggiungere alla parte A anche la gestione dell'eventuale eccezione scatenata dall'inserimento da tastiera scorretto (ad esempio un numero decimale o una stringa).
parte C:
aggiungere alla parte B il fatto che il denominatore sia selezionato randomicamente dall'insieme dei numeri da 0 a 4. */

import java.util.Scanner;

public class es03 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        System.out.println("inserisci un numero intero");
        try {
            n1 = Integer.parseInt(kb.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Errore! non è stato inserito un numero valido");
        }

        System.out.println("inserisci un altro numero intero");
        try {
            n2 = Integer.parseInt(kb.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Errore! non è stato inserito un numero valido, il denominatore verrà scelto random");
            /* n2 = Math.round(Math.random() * 4); */
        }

        try {
            System.out.println("Il risultato della divisione è: " + (n1 / n2));
        } catch (ArithmeticException e) {
            System.out.println("non è possibile dividere per zero");
            System.out.println(e.getMessage());
        }

    }
}
