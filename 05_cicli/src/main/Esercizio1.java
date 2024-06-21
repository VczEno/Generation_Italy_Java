
import java.util.Scanner;

public class Esercizio1 {
    // Scrivere un programma che abbia come scopo una raccolta fondi.
    // Chiedere all'utente se vuole partecipare.
    // Se risponde si, chiedere il nome e l'importo che desidera versare.
    // L'obiettivo della raccolta sono 1000 euro.

    // Livello 1 - Maestro Muten
    // Ripetere l'operazione finché non si raggiunge l'obiettivo (non importa se
    // viene superato).
    // Stampare il numero di utenti che hanno partecipato alla raccolta fondi

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        int quota = 0; // VARIABILE PER CONTEGGIARE PROGRESSIVAMENTE IL VALORE DELLA QUOTA RACCOLTA
        String nomePartecipante; // SALVO IL NOME PARTECIPANTE PER STAMPARLO A SCHERMO
        int quotaPartecipante; // SALVO LA QUOTA DEL SINGOLO PARTECIPANTE PER STAMPARLA A SCHERMO
        int numeroPartecipanti = 0; // CONTATORE CHE SI INCREMENTA AD OGNI NUOVA DONAZIONE
        boolean risp; // SALVO LA RISPOSTA DELL'UTENTE S

        System.out.println(
                "Benvenuto sul 'Save the Entry Level Developer', raccogliamo fondi per le vittime illuse dal mercato del lavoro");
        while (quota < 1000) { // BLOCCO WHILE CHE SI ESEGUE FINCHE 'QUOTA' E' INFERIORE A 1000
            System.out.println("Vuoi partecipare? rispondi con 'true' o 'false' ");
            risp = Boolean.parseBoolean(tastiera.nextLine());
            if (risp) { // BLOCCO IF CHE SI ESEGUE SE L'UTENTE VUOLE DONARE
                System.out.println("Come ti chiami?");
                nomePartecipante = tastiera.nextLine(); // SALVO IL NOME DEL UTENTE
                System.out.println("Quanto vuoi donare?");
                quotaPartecipante = Integer.parseInt(tastiera.nextLine()); // SALVO LA DONAZIONE DEL UTENTE
                quota += quotaPartecipante; // AGGIORNO LA QUOTA RAGGIUNTA
                numeroPartecipanti++; // INCREMENTO IL NUMERO DI PARTECIPANTI
                System.out.println("Grazie " + nomePartecipante + ", per aver donato " + quotaPartecipante + " euro");
            } else {
                System.out.println("Grazie lo stesso :(");
            }

        }
        // RAGGIUNTA LA QUOTA ESCE DAL BLOCCO WHILE E STAMPO UN MESSAGGIO CON IL NUMERO
        // DEI PARTECIPANTI
        System.out.println(
                "E' stata raggiunta la soglia di 1000 euro! Numero totale di partecipanti: " + numeroPartecipanti);

        tastiera.close();
    }

}
