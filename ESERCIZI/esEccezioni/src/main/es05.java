package main;
/* 
 * 
Esercizio 5                     

Realizza un programma che sia in grado di leggere un file in cui siano presenti numeri interi e numeri interi immaginari (disposti come volete).
Numero intero immaginario: è un numero intero normale preceduto dalla lettera j (ad esempio sono immaginari: j34, j497, j0, j-34; mentre NON sono immaginari: 35, j 46, jciao34, j -43)
Java di base non riconosce i numeri immaginari, saranno quindi da usare le dovute accortezze.

A) Gestire il caso in cui ci siano difficoltà nella lettura file (e chiudere il file nel finally)
B) Gestire il caso in cui un numero non sia intero.
	Nel caso in cui il numero NON sia intero, c'è il fondato sospetto che si tratti di un numero intero immaginario(ma non è sicuro).
C) Pertanto il corrispondente catch tenta di individuare la 'j' iniziale dell'eventuale numero immaginario.
	Se ci riesce allora dovrà eliminare la j dal numero, altrimenti stamperà un messaggio di errore.
D) Gestire attraverso un ulteriore try-catch (innestato nel catch precedente) il caso in cui il nuovo numero (ottenuto dal ritaglio della lettera j) non sia intero.
E) Creare due Arraylist di interi, uno chiamato interi e l'altro chiamato immaginari. Creare poi un arraylist di stringhe chiamato eccezioni.
Riempire interi con i numeri interi trovati.
Riempire immaginari con i numeri interi immaginari trovati.
Riempire eccezioni con i valori che non rientrano nelle due categorie precedenti.
Stampare tutto.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class es05 {
    public static void main(String[] args) {
        Scanner file = null;
        int n;
        String riga;
        String subriga;
        double d;
        ArrayList<Integer> interi = new ArrayList<>();
        ArrayList<String> immaginari = new ArrayList<>();
        ArrayList<String> eccezioni = new ArrayList<>();
        try {
            String percorso = "ESERCIZI\\esEccezioni\\src\\res\\numeri.txt";
            file = new Scanner(new File(percorso));
            while (file.hasNextLine()) {
                riga = file.nextLine();
                try {
                    n = Integer.parseInt(riga);
                    System.out.println("Il numero intero è: " + n);
                    interi.add(n);
                } catch (NumberFormatException e) {
                    System.out.println(" CATCH non un intero");
                    if (riga.indexOf("j") == 0) {
                        try {
                            n = Integer.parseInt(riga.substring(1));
                            immaginari.add(riga);
                            System.out.println("Numero immaginario: j " + n);
                        } catch (NumberFormatException ex) {
                            subriga = riga.substring(1);
                            try {
                                d = Double.parseDouble(subriga);
                                System.out.println("Il numero double è : " + d);
                            } catch (NumberFormatException exc) {
                                System.out.println("Numero non valido");
                            } finally {
                                eccezioni.add(riga);
                            }

                        }
                    } else {
                        eccezioni.add(riga);
                        System.out.println("Valore non valido");
                    }

                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("ERRORE! file non trovato");
        } finally {
            file.close();
        }

        System.out.println("Valori interi: " + interi);
        System.out.println("Valori immaginari: " + immaginari);
        System.out.println("Eccezioni: " + eccezioni);

    }

}
