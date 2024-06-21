
import java.util.Scanner;

// PROGRAMMAZIONE CLASSICA: cosa bbiamo visto finora? ci sono 3 principi
// 1) sequenza
// 2) selezione (if, if-else, if-elseif-else, switch-case, ternario)
// 3) iterazione - cicli

public class AvvioWhile {

    // vediamo il primo costrutto dell'iterazione: il WHILE
    // sintassi:
    // while(condizione){
    // istruzioni...
    // }
    // il ciclo while effettua un controllo sulla condizione tra le () esattamente
    // come farebbe un if
    // quindi i comandi tra le {} vengono eseguiti solo se la condizione e' true
    // DIFFERENZA SOSTANZIALE CON L'IF:
    // dopo che viene eseguito l'ultimo comando tra le {}, viene valutata nuovamente
    // la condizione tra le ()
    // --> il ciclo continua all'infinito finche' la condizione risulta falsa

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da uno a dieci:");
        int numero = Integer.parseInt(scanner.nextLine());

        while (numero < 1 || numero > 10) {
            System.out.println("Il numero inserito non e' corretto! ripigliati!\nRiprova");
            numero = Integer.parseInt(scanner.nextLine());
        }

        // ATTENZIONE: se entra nel ciclo sotto, non ne esce piu' ----> ciclo infinito
        // while (numero<1 || numero>10) {
        // System.out.println("Il numero inserito non e' corretto!
        // ripigliati!\nRiprova");
        // }

        System.out.println("Bravo ce l'hai fatta!");

        scanner.close();

    }
}
