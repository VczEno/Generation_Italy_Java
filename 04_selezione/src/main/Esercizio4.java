
import java.util.Scanner;

public class Esercizio4 {
    /*
     * 4
     * Chiedere all’utente di inserire un numero intero.
     * Verificare che sia divisibile per 3, se la condizione dovesse risultare vera
     * allora
     * assegnare ad una variabile il valore “il numero è divisibile per tre”, se
     * invece dovesse essere falsa
     * assegnare il valore “il numero non è divisibile per tre”
     */

    public static void main(String[] args) {

        int inputN;
        String output;
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci un numero intero");
        inputN = Integer.parseInt(tastiera.nextLine());

        if (inputN % 3 == 0) {
            output = "Il numero è divisibile per tre";
        } else {
            output = "Il numero NON è divisibile per tre";
        }

        System.out.println(output);

        tastiera.close();
    }

}
