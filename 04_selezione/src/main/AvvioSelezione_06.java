
import java.util.Scanner;

//          SWITCH CASE (con toUpperCase() e toLowerCase())

// vediamo come modificare il costrutto switch-case al fine di effettuare un confronto tra stringhe
// che sia del tipo "IgnoreCase" visto che di default java quando esegue lo switch effettua
// internamente un confronto utilizzando un equals semplice
// 2 passaggi:
// 1) modificare la variabile da confrontare andando a inserirla tutta MAIUSCOLA o tutta minuscola
// 2) modificare tutti i valori dei case andando a scriverli in MAIUSCOLO

public class AvvioSelezione_06 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome: ");
        String nomeInput = tastiera.nextLine();
        String nomeMaiuscolo = nomeInput.toUpperCase();
        // String nomeMaiuscolo = tastiera.nextLine().toUpperCase();
        String animalePreferito;

        /*
         * if(nomeInput.equalsIgnoreCase("Emanuel")){
         * animalePreferito = "Cavallo";
         * }
         * else if(nomeInput.equalsIgnoreCase("Claudio")){
         * animalePreferito = "Cane";
         * }
         * else if(nomeInput.equalsIgnoreCase("Simone")){
         * animalePreferito = "Maiale";
         * }
         * else if(nomeInput.equalsIgnoreCase("Armando")){
         * animalePreferito = "Coniglio";
         * }
         * else if(nomeInput.equalsIgnoreCase("Lucrezia")){
         * animalePreferito = "Panterone";
         * }
         * else{
         * animalePreferito = "Lucertola";
         * }
         */

        switch (nomeMaiuscolo) { // oppure direttamente nomeInput.toUpperCase() mi consente di non utilizzare la
                                 // variabile nomeMaiuscolo
            case "EMANUEL":
                animalePreferito = "Cavallo";
                break;

            case "CLAUDIO":
                animalePreferito = "Cane";
                break;

            case "SIMONE":
                animalePreferito = "Maiale";
                break;

            case "ARMANDO":
                animalePreferito = "Coniglio";
                break;

            case "LUCREZIA":
                animalePreferito = "Panterone";
                break;

            default:
                animalePreferito = "Lucertola";
                break;
        }

        // VISTO CHE CI SIAMO, UTILIZZIAMO IL toUpperCase() anche nell'output:
        System.out.println("Ciao " + nomeInput + " il tuo animale preferito e': " + animalePreferito.toUpperCase());

        tastiera.close();
    }
}
