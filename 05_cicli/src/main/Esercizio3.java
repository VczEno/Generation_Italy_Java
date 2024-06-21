
import java.util.Scanner;

public class Esercizio3 {
    // Scrivere un programma che abbia come scopo una raccolta fondi.
    // Chiedere all'utente se vuole partecipare.
    // Se risponde si, chiedere il nome e l'importo che desidera versare.
    // L'obiettivo della raccolta sono 1000 euro.

    // Livello 1 - Maestro Muten
    // Ripetere l'operazione finché non si raggiunge l'obiettivo (non importa se
    // viene superato).
    // Stampare il numero di utenti che hanno partecipato alla raccolta fondi

    // Livello 2 - Crilin
    // In aggiunta al livello 1
    // Stampare il numero totale di utenti ai quali è stato chiesto di partecipare
    // Stampare il numero degli utenti che hanno deciso di non partecipare.

    // Livello 3 - Goku
    // In aggiunta al livello 2
    // Impedire all'utente di contribuire se desidera partecipare
    // con un importo maggiore rispetto a quello necessario al raggiungimento
    // dell'obiettivo proponendogli di versare invece l'esatta differenza.
    // Stampare l'elenco degli utenti che hanno partecipato con accanto l'importo
    // versato.

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        int quota = 0; // VARIABILE PER CONTEGGIARE PROGRESSIVAMENTE IL VALORE DELLA QUOTA RACCOLTA
        int utentiTotali = 0; // VARIABILE CONTATORE; SOMMA DEI DONATORI E NON DONATORI
        String nomePartecipante; // SALVO IL NOME PARTECIPANTE PER STAMPARLO A SCHERMO
        int quotaPartecipante; // SALVO LA QUOTA DEL SINGOLO PARTECIPANTE PER STAMPARLA A SCHERMO
        int numeroPartecipanti = 0; // CONTATORE CHE SI INCREMENTA AD OGNI NUOVA DONAZIONE
        boolean risp; // SALVO LA RISPOSTA DELL'UTENTE SULLA VOLONTA DI DONARE
        String lista = "Lista donatori:\n";

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
                if ((quotaPartecipante + quota) > 1000) {
                    System.out.println("Mancano solo " + (1000 - quota)
                            + " per raggiungere l'obbiettivo, vuoi versare questo importo? rispondi con 'true' o 'false'");
                    risp = Boolean.parseBoolean(tastiera.nextLine());
                    if (risp)
                        quotaPartecipante = 1000 - quota;
                    else
                        System.out.println("Grazie per tua generosità");
                }
                quota += quotaPartecipante; // AGGIORNO LA QUOTA RAGGIUNTA
                numeroPartecipanti++; // INCREMENTO IL NUMERO DI PARTECIPANTI
                System.out.println("Grazie " + nomePartecipante + ", per aver donato " + quotaPartecipante + " euro");
                lista += "nome: " + nomePartecipante + " , donazione: " + quotaPartecipante + ";\n";

            } else {
                System.out.println("Grazie lo stesso :(");
            }

            // INDIPENDENTEMENTE DALLA DONAZIONE INCREMENTO IL CONTATORE DEI VISITATORI
            // TOTALI
            utentiTotali++;

        }
        // RAGGIUNTA LA QUOTA ESCE DAL BLOCCO WHILE E STAMPO UN MESSAGGIO CON IL NUMERO
        // DEI PARTECIPANTI E LA DIFFERENZA TRA GLI UTENTI TOTALI E I DONATORI
        System.out.println(
                "E' stata raggiunta la soglia di 1000 euro! Hanno deciso di partecipare " + numeroPartecipanti
                        + " persone, mentre " + (utentiTotali - numeroPartecipanti)
                        + " persona hanno deciso di non supportare la causa\n" + lista);

        tastiera.close();
    }

}
