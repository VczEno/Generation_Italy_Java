package main;

import java.util.Scanner;

public class IterazioneELength {
    public static void main(String[] args) {
        
        int[] numeri;

        System.out.println("Inserisci la dimensione del vettore:");
        Scanner tastiera = new Scanner(System.in);
        int dimensione = Integer.parseInt(tastiera.nextLine());

        // ora che ho la dimensione posso INIZIALIZZARE il vettore
        numeri = new int[dimensione];    // int[] numeri = new int[Integer.parseInt(tastiera.nextLine())];



        // adesso assegno ad ogni cella del vettore un valore, ma....
        // System.out.println("inserisci il primo numero");
        // numeri[0] = Integer.parseInt(tastiera.nextLine());
        // ... non posso procedere così perche' non nso qual è la dimensione a priori







        // quindi devo usare un ciclo per sfruttare l'ITERAZIONE

        //  parte 1: inserimento dei numeri da tastiera
        // creo una variabile intera che aumentero' ad ogni iterazione
        int indice=0;
        
        while (indice<dimensione) {             
            System.out.println("inserisci il "+ (indice + 1) +"o numero: ");
            numeri[indice] = Integer.parseInt(tastiera.nextLine());
            indice ++;      // ad ogni iterazione incremento di 1 l'indice
            
        }
        // usando un ciclo while sono sicuro di aver valorizzato tutte le celle del vettore:
        // da quella con indice 0 a quella con indice (dimensione-1)
        // ad esempio se dimensione = 2 --> valorizzero' numeri[0] e numeri[1]

        // attenzione a non confondersi scrivendo la condizione indice<=dimensione
        // infatti il <= porterebbe all'errore perche' la cella incice[dimensione] non esiste
        System.out.println("Grazie, inserimento completato!");





        //  parte 2: stampa dei numeri inseriti
        indice = 0; // riporto il contatore a 0 perchè era diventato = dimensione!
        String messaggio ="";

        System.out.println("Ecco l'elenco dei numeri inseriti: ");
        while (indice<numeri.length) {
            messaggio += " " + numeri[indice];
            indice++;
        }
        System.out.println(messaggio);
        //          .length
        // .length e' un comando CHE MI RESTITUISCE LA DIMENSIONE DI UN VETTORE
        // sintassi: nome_vettore.length
        // in questo caso e' identico rispetto a usare "dimensione"
        // perchè coincidono (dimensione==numeri.length)

        
        // in alternativa posso ragionare nel seguente modo:
        System.out.println("Ecco la stampa dei numeri inseriti al contrario:");
        dimensione --;
        while (dimensione>=0) {
            System.out.println(numeri[dimensione]);
            dimensione --;
        }
        // in questo caso stampera' dall'ultimo numero inserito al primo



        // se non conosco la dimensione?

        tastiera.close();
    }
    
}
