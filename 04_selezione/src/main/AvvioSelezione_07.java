
import java.util.Scanner;

//      TERNARIO
//  talvolta per essere piu veloce e conciso posso sostituire un if-else con un ternario, ma non sempre mi è concesso.
// QUANDO POSSO USARE UN TERNARIO?
//  - quando devo ASSEGNARE un VALORE ad una variabile a seconda del verificarsi o meno di una condizione
//  - la condizione deve essere UNA SOLA (come nell'if-else) e NON plurime (come nell'if-elseif-else)
// SINTASSI:
//  variabile = condizione ? valoreSeCondizioneTrue : valoreSeCondizioneFalse;

public class AvvioSelezione_07 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String nome;
        String tipologia;
        int nGusti;
        String gusto;
        double prezzo;
        String ris;

        System.out.println("Benvenut* nella gelateria Jaicescream127!\nCome ti chiami?");
        nome = tastiera.nextLine();

        System.out.println("Ciao " + nome + ", cono o coppetta?");
        tipologia = tastiera.nextLine();

        /*
         * if(tipologia.equalsIgnoreCase("cono"))
         * prezzo = 3.5;
         * else
         * prezzo = 4;
         */

        // assegnamo alla variabile prezzo il valore 3.5 euro se la condizione
        // 'tipologia.equalsIgnoreCase("cono")' è vera
        // altrimenti assegniamo 4 euro
        prezzo = tipologia.equalsIgnoreCase("cono") ? 3.5 : 4;

        System.out.println("Quanti gusti vuoi?");
        nGusti = Integer.parseInt(tastiera.nextLine());
        // aumentiamo la variabile prezzo di 1 euro se la condizione 'nGusti > 2' e'
        // vera
        // altrimenti la aumentiamo di 0.5 euro
        prezzo += nGusti > 2 ? 1 : 0.5;

        System.out.println("che gusto vuoi?");
        gusto = tastiera.nextLine();

        ris = (gusto.equalsIgnoreCase("cioccolato") || gusto.equalsIgnoreCase("nocciola"))
                ? "Attento, contiene lattosio"
                : "buon gelato";

        System.out.println("Il tuo gelato costa " + prezzo + " euro\n" + ris);

        // ATTENZIONE
        // posso utilizzare i ternari all'interno del mio OUTPUT SENZA creazione di
        // VARIABILI
        System.out.println(nome.equals("piero") ? "Mi stai sulle balle" : "buona giornata");

        tastiera.close();

    }

}
