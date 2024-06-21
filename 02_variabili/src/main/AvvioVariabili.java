package main;

public class AvvioVariabili {

    // UNA VARIABILE e' un contenitore di un certo tipo che contiene un certo valore
    // il tipo ce lo immaginiamo come un'etichetta sul contenitore
    // il valore lo immaginiamo come il contenuto
    public static void main(String[] args) {
        // TIPI DI VARIABILI:
        /*
         * 1) 8 TIPI PRIMITIVI, tra essi abbiamo
         * - tipi numerici
         * int
         * short
         * byte
         * double
         * float
         * long
         * 
         * - tipi caratteri
         * char
         * 
         * - tipi booleani
         * boolean
         * 
         * 2) TIPI COMPLESSI
         * String, che contiene piu caratteri
         * 
         */

        // per creare una variabile e' necessario fare 2 operazioni:

        // I) DICHIARAZIONE, che associa il tipo alla variabile
        // attraverso la sintassi: [tipo] [nome];
        int numero;
        double decimaleDouble;
        float decimaleFloat;
        long numeroGrande;
        char carattere;
        boolean booleano;
        String parola;

        // II) INIZIALIZZAZIONE, andiamo a dare un valore alla variabile
        // attraverso la sintassi: [nome] = [nuovo valore];
        numero = 1;
        decimaleDouble = 1.5;
        decimaleFloat = 3.45f;
        numeroGrande = 7367429872L;
        carattere = 'c';
        booleano = false;
        // .... codice
        booleano = true;
        parola = "la mia Casa è bella un sacco ma proprio tanto!! tipo 4";

        // I + II) DICHIARAZIONE e INIZIALIZZAZIONE nello stesso comando:
        // attraverso la sintassi: [tipo] [nome] = [nuovo valore];
        int numeroSpeciale = 6;
        String parolaSpeciale = "aò";
        System.out.println(parola);

        /*
         * ATTENZIONE:
         * - non posso creare due variabili con lo stesso nome
         */

    }

}
