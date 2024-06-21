package main;
//                  VETTORI  (array)
//  un vettore e' un insieme di variabili
// UN VETTORE E' UN INSIEME FINITO E ORDINATO DI VARIABILI DELLO STESSO TIPO
// qui sotto verranno approfondite queste 3 caratteristiche (FINITO, ORDINATO, VARIABILI DELLO STESSO TIPO)

/* quando voglio creare un vettore devo specificare 2 cose:
- la DIMENSIONE: quante varibili puo' contenere
- il TIPO di variabili che puo' contenere
*/
public class AvvioVettori {
    public static void main(String[] args) {
        // VOGLIO CREARE UN VETTORE DI NOMI

        // DICHIARAZIONE
        String[] nomi;

        // INIZIALIZZAZIONE
        nomi = new String[5];
        // chiaramente posso fare:  String[] nomi = new String[5];
        
        // ATTENZIONE
        // ho specificato due cose:
        // - il tipo di varibili che puo' contenere (tutte DELLO STESSO TIPO)
        // - la dimensione (che rende il vettore FINITO)
        // queste due cose non cambieranno mai e apparterranno al vettore fino alla sua morte.
        
        

        String nome = "Matteo";
        // DIAMO UN VALORE AGLI ELEMENTI DEL VETTORE, ALLE CELLE DEL VETTORE
        nomi[0] = "Michele";
        nomi[1] = "Luca";
        nomi[2] = "Riccardo";
        nomi[3] = "Giuseppe";
        nomi[4] = nome;

        // per assegnare i valori agli elementi dobbiamo specificare la posizione (o INDICE)
        // inserendo un numero tra le []
        // questo rende il vettore ORDINATO

        // ATTENZIONE LA DIMENSIONE CHE ABBIAMO SPECIFICATO IN FASE DI INIZIALIZZAZIONE
        // E' FISSA E RENDE IL VETTORE FINITO
        // pertento non posso accedere a celle, posizioni del vettore che vanno oltre
        // quella dimensione perchè quelle celle non esistono!
        // nomi[5] = "Matteo";      Errore: Index 5 out of bounds for length 5
        // nomi[6] = "John";       Errore: Index 6 out of bounds for length 5

        System.out.println(nomi);
        // se inserisco nella stampa il nome del vettore senza specificare alcun INDICE
        // allora mi verrà stampata la posizione in cui e' salvato in memoria il vettore
        System.out.println("Buongiorno " + nomi[0] + " come stai? hai sentito " + nomi[1] +"?");


    }
}
