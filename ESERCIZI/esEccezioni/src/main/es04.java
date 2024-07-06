package main;

import java.util.Scanner;

/* Esercizio 4                     

parte A:
Scrivi un programma che istanziato un vettore di interi di 5 posizioni chieda all'utilizzatore di inserire un numero desiderato in una posizione a scelta.
Gestire l'eventualità che vengano violati i limiti dell'array.
parte B:
aggiungere alla parte A anche la gestione dell'eventuale eccezione scatenata dall'inserimento da tastiera scorretto (ad esempio un numero decimale o una stringa) */
public class es04 {

    public static void main(String[] args) {
        int[] numeri = new int[5];
        int n = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Inserisci un valore");
        boolean inputValido = false, indiceValido = false;
        do {
            try {
                n = Integer.parseInt(kb.nextLine());
                inputValido = true;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("ERRORE! Inserire un numero intero");
            }

        } while (!inputValido);

        System.out.println("in quale posizione vuoi inserirlo?");
        int ind;

        do {
            try {
                ind = Integer.parseInt(kb.nextLine());
                numeri[ind] = n;
                indiceValido = true;

            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Inserire un numero intero");
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("ERRORE! out of bound, inserire un indice valido");

            }
        } while (!indiceValido);

        System.out.println("Fine");
    }

}
