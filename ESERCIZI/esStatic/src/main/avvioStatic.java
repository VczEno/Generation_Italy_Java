package main;

import java.io.FileNotFoundException;
import java.util.Scanner;

import entities.VikNumeri;

public class avvioStatic {// LIVELLO 1
    // A - Scrivere un metodo che ricevuto un input dall'utente verifica che sia
    // compreso tra 0 e 100
    int[] numeri = { 9, 3, 42, 65, 2, 1, 1, 743, 0 };
    // B - Scrivere un metodo che riceve un input dall'utente e verifica che tale
    // input sia presente
    // all'interno del vettore numeri.
    // C - Scrivere un metodo che riceve un input dall'utente e verifica che tale
    // valore sia presente
    // all'interno di un file formattato in questo modo:
    // 9,3,42,65,2,1,1,743,0

    // LIVELLO 2
    // A - Scrivere un metodo che ricevuto un vettore contenente numeri interi
    // restituisca la media
    // B - Scrivere un metodo che ricevuto un vettore contenente numeri interi
    // restituisca il piÃ¹ alto
    // C - Scrivere un metodo che ricevuto un vettore contenente numeri interi
    // restituisca la somma dei numeri pari
    public static void main(String[] args) throws FileNotFoundException {

        Scanner tastiera = new Scanner(System.in);
        System.out.println("inserisci un valore");
        double input = Double.parseDouble(tastiera.nextLine());
        /* System.out.println(VikNumeri.CHECKNUMBER(input)); */
        /* System.out.println(VikNumeri.NUMBERINARRAY(input)); */
        System.out.println(VikNumeri.NUMBERINFILE(input));
        tastiera.close();

    }

}
