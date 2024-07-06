package main;

/* 
 * Esercizio 2                     

Gestire l'eccezione generata dal codice
String s=null;
int l = s.length();
 */

public class es02 {

    public static void main(String[] args) {

        String s = null;
        try {
            int l = s.length();
        } catch (NullPointerException e) {
            System.out.println("Impossibile calcolare la lunghezza della stringa. Non è stata inizializzata");
            System.out.println(e.getMessage());
        }

    }

}
