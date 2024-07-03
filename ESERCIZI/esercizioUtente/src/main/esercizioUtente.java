package main;

import entities.Utente;

// creare delle utenze e verificare l'accesso di queste
public class esercizioUtente {

    public static void main(String[] args) {

        // dichiarazione
        Utente utente1;
        // inizializzazione
        utente1 = new Utente();
        // valorizziamo le proprieta' di utente1:
        utente1.username = "ciao";
        utente1.password = "ciao1234";
        // creiamo un secondo oggetto Utente
        Utente utente2 = new Utente();
        utente2.username = "buongiorno";
        utente2.password = "buongiorno1234";
    }
}
