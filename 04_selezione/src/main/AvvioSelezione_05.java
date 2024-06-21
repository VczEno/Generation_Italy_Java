
//          SWITCH CASE

import java.util.Scanner;

public class AvvioSelezione_05 {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome: ");
        String nomeInput = tastiera.nextLine();
        String animalePreferito;

        /*
         * if(nomeInput.equals("Emanuel")){
         * animalePreferito = "Cavallo";
         * }
         * else if(nomeInput.equals("Claudio")){
         * animalePreferito = "Cane";
         * }
         * else if(nomeInput.equals("Simone")){
         * animalePreferito = "Maiale";
         * }
         * else if(nomeInput.equals("Armando")){
         * animalePreferito = "Coniglio";
         * }
         * else if(nomeInput.equals("Lucrezia")){
         * animalePreferito = "Panterone";
         * }
         * else{
         * animalePreferito = "Lucertola";
         * }
         */

        // se dobbiamo dividere il nostro codice in piu strade in base al valore assunto
        // da una variabile
        // possiamo sfruttare lo switch case invece di utilizzare un sacco di else-if

        /*
         * sintassi:
         * 
         * switch (variabileDaConfrontare){
         * case valore1:
         * istruzioni
         * break;
         * case valore2:
         * istruzioni
         * break;
         * case valore3:
         * istruzioni
         * break;
         * ...
         * default:
         * istruzioni
         * break;
         * }
         * 
         * DEFAULT:
         * nel default vado a inserire tutte le casisistiche che non sono state prese in
         * considerazione dai vari case:
         * Quindi possiamo dire che il default corrisponde all'else.
         * 
         * ATTENZIONE!!!
         * se mi dimentico di inserire il break tra un case e l'altro, potrebbe
         * succedere che
         * vengano eseguite anche istruzioni contenute in case non verificati.
         * 
         */
        switch (nomeInput) {
            case "Emanuel":
                animalePreferito = "Cavallo";
                break;

            case "Claudio":
                animalePreferito = "Cane";
                break;

            case "Simone":
                animalePreferito = "Maiale";
                break;

            case "Armando":
                animalePreferito = "Coniglio";
                break;

            case "Lucrezia":
                animalePreferito = "Panterone";
                break;

            default:
                animalePreferito = "Lucertola";
                break;
        }

        // ATTENZIONE 2:
        // se il confronto tra la variabile da switchare e i case avviene tra
        // stringhe(come il nostro caso)
        // il confronto internamente viene fatto attraverso il comando .equals()
        // Ma se voglio utilizzare .equalsIgnoreCase() allora devo trovare una
        // strategia...
        // la vediamo nel prossimo file...

        System.out.println("Ciao " + nomeInput + " il tuo animale preferito e': " + animalePreferito);

        tastiera.close();

    }
}
