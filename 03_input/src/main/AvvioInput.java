package main;

import java.util.Scanner;

// un primo tipo di input che vediamo è quello tramite tastiera
public class AvvioInput {
    public static void main(String[] args) {
        
        /*
         * Per poter leggere in input da tastiera ho bisogno
         * della classe Scanner.
         * 
         * Per poter utilizzare lo scanner andando a leggere quello 
         * che l'utente digita in console, ho bisogno di dichiarare
         * e inizializzare una variabile di tipo Scanner.
         */


        Scanner tastiera = new Scanner(System.in);

        System.out.println("Ciao, come ti chiami?");
        String nome;
        nome = tastiera.nextLine();
        // invochiamo la variabile Scanner che si chiama tastiera
        // e, attraverso il comando nextLine() andiamo a prenderci quello che digita l'utente

        System.out.println("Qual è il tuo cognome?");
        String cognome = tastiera.nextLine();

        System.out.println("Benvenuto " + nome + " " + cognome +"!");


        // --------- NUMERI
        // Se vogliamo leggere in input dei numeri come facciamo?
        System.out.println("Quanti anni hai?");
        // salviamo in una stringa il numero digitato
        String etaInput;
        etaInput = tastiera.nextLine();
        // parsiamo quel valore dentro a una variabile numerica attraverso il comando
        // Integer.parseInt();
        int eta = Integer.parseInt(etaInput);

        System.out.println("Mio caro " + nome + ", tra un anno avrai " + (++eta) + " anni!");
        System.out.println("eta alla riga dopo: " + eta);
        // ci siamo accorti che c'è una differenza tra eta++ e ++eta
        // eta++ incrementa la variabile, ma solo dopo averla usata in quel punto di codice
        // ++eta incrementa la variabile, ma prima di usarla

        // ---------- DOUBLE
        // proviamo con i double (funziona allo stesso modo anche per boolean, long, ....)
        System.out.println("Quanto sei alto?");
        // String altezzaInput = tastiera.nextLine();
        // double altezza = Double.parseDouble(altezzaInput);
        double altezza = Double.parseDouble(tastiera.nextLine());
        // se voglio posso parsare direttamente l'input in un numero, senza utilizzare la variabile
        // d'appoggio di tipo String 

        System.out.println("Bravo sei alto " + altezza + "m");

        // ---------- CHIUSURA
        // le variabili di tipo Scanner, una volta usate, devono essere chiuse
        tastiera.close();
    }
}
