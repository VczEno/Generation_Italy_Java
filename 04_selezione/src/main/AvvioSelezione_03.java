
import java.util.Scanner;

//     -------   equals() e equalsIgnoreCase()
//     -------   if annidati

// come si fa a imporre condizioni sulle stringhe??
public class AvvioSelezione_03 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Ciao come ti chiami?");
        String nome = tastiera.nextLine();

        // per verificare l'uguaglianza tra due stringhe senza considerare
        // il case (ovvero se le lettere sono maiuscole o minuscole) uso
        // .equalsIgnoreCase()
        if (nome.equalsIgnoreCase("Alice")) { // alice = Alice --> ok
            System.out.println("Benvenuta " + nome + "!\nTi stavamo aspettando!");
            System.out.println("Dicci la parola d'ordine");
            String parolaDordine = tastiera.nextLine();

            // per verificare l'uguaglianza tra due stringhe considerando anche il case uso
            // .equals()
            if ("ciliegia".equals(parolaDordine)) {
                System.out.println("La parola d'ordine e' corretta, puoi entrare!");
            }

            if (!("ciliegia".equals(parolaDordine))) {
                System.out.println("Ci hai mentito, sei bandit dal nostro locale!");
            }
        }
        // qui sopra abbiamo un esmpio di if ANNIDATI,
        // ovvero piu' if uno dentro l'altro

        boolean condizione = nome.equalsIgnoreCase("Alice");
        // per la negazione vale la stessa regola: metto davanti il !
        if (!(condizione)) {
            System.out.println("Vada via, non ti conosciamo!");
        }

        tastiera.close();
    }

}
