package main;

import java.util.Scanner;

/* Scrivere un programma su un viaggio
 * - chiedere all'utente le seguenti informazioni:
 * Nominativo, destinazione, quante persone, quanti under 12, data di partenza, durata del viaggio, disponibilità ad effettuare uno scalo(booleano).
 * - calcoliamo il prezzo complessivo del biglietto:
 * --- durata del viaggio * 100€ per over 12
 * --- oppure durata del viaggio * 40€ per under 12
 * 
 * -stampare in console un riepilogo contenente tutti i dati
 * 
 * consigli:
 * usare la procedure DICO, mettendo dei commenti in ogni fase
 * utilizzare il numero di variabili che vi sembra più opportuno/comodo per voi
 */

public class EsercizioRipassoInput {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        // DICHIARAZIONE

        String risposta;
        int personeTotali, personeUnder, durata, prezzo;
        boolean scalo;

        // INIZIALIZZAZIONE

        System.out.println(
                "Benvenuto nel portale del'agenzia di viaggi JavaJourney. \nPer prenotare un viaggio inserisci il tuo nominativo");
        risposta = "Grazie per aver prenotato con JavaJourney " + tastiera.nextLine() + "! \n";

        System.out.println("inserisci la destinazione desiderata");
        risposta += "La prenotazione è stata effettuata con successo!\nEcco un repilogo\nDestinazione: "
                + tastiera.nextLine() + "\n";

        System.out.println("per quante persone vuoi prenotare?");
        personeTotali = Integer.parseInt(tastiera.nextLine());
        risposta += "Persone totali: " + personeTotali + "\n";

        System.out.println("quante di queste sono under 12? Per i bambini abbiamo delle tariffe agevolate");
        personeUnder = Integer.parseInt(tastiera.nextLine());
        risposta += "Under 12: " + personeUnder + "\n";

        System.out.println("quando vuoi partire?");
        risposta += "Data di partenza: " + tastiera.nextLine() + "\n";

        System.out.println("per quanti giorni?");
        durata = Integer.parseInt(tastiera.nextLine());
        risposta += "Durate del viaggio: " + durata + "\n";

        System.out.println("Siete disponibili ad effetuare uno o più scali? (inserire 'true' o 'false')");
        scalo = Boolean.parseBoolean(tastiera.nextLine());
        risposta += "Disponibilità ad effetuare scali: " + scalo + "\n\n";

        prezzo = (personeTotali - personeUnder) * 100 * durata + personeUnder * 40 * durata;

        risposta += "Per questo viaggio applichiamo una tariffa di 100€ per gli adulti e 40€ per gli under 12\nIl totale ammonta a: "
                + prezzo;

        System.out.println(risposta);
        tastiera.close();
    }
}
