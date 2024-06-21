package main;

import java.util.Scanner;

/* Scrivere un programma che chieda all'utente il nome e l'età
     * e poi chieda di inserire i dati delle figure geometriche
     * calcolare l'area e il perimetro come nell'esercizio precedente,
     * stampare tutti i risultati
     */
public class EsercizioInput {
    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Ciao, come ti chiami?");
        String nome;
        nome = tastiera.nextLine();
        System.out.println("Benvenuuto " + nome + ". Quanti anni hai?");
        int eta = Integer.parseInt(tastiera.nextLine());
        System.out.println("quindi hai " + eta + " anni.");
        System.out.println(
                "Calcoliamo l'area e il perimetro di un rettangolo, inserisci due valori per i lati (premi INVIO tra un input e l'altro)");
        int latoA = Integer.parseInt(tastiera.nextLine());
        int latoB = Integer.parseInt(tastiera.nextLine());
        System.out.println("Il nostro rettangolo ha lati: " + latoA + " e " + latoB);
        int perimetro = (latoA + latoB) * 2;
        int area = latoA * latoB;
        System.out.println("L'area è pari a " + area + " e il perimetro pari a " + perimetro);

        tastiera.close();

    }

}
