
import java.util.Scanner;

public class Esercizio5 {

    /*
     * creare un programma per un'azienda
     * chiedere all’utente di inserire la propria mansione per settare il suo
     * stipendio.
     * Di base la quota minima è di 1200 euro che verrà maggiorato di una certa
     * cifra a seconda della
     * mansione ricoperta:
     * - se dipendente, avrà una maggiorazione del 20 % inoltre
     * - se collaboratore del 15%
     * - se consulente di 10%
     * inoltre lo stipendio varierà anche in base
     * agli anni di esperienza(da chiedere all’utente)
     * se sono più di 30 ci sarà uno scatto di 500 euro
     * se tra 29 e 20 ci sarà uno scatto di 350
     * se tra 19 e 9 di 200
     * se tra 8 e 6 di 100
     * se no non ci sarà nessuna maggiorazione
     */

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        String ruolo;
        int esperienza;
        int stipendio = 1200;

        System.out.println("Inserisci il ruolo");
        ruolo = tastiera.nextLine()/* .toLowerCase() */;

        System.out.println("Inserire gli anni di esperienza");
        esperienza = Integer.parseInt(tastiera.nextLine());

        if (ruolo.equalsIgnoreCase("dipendente")) {
            stipendio += (stipendio / 100) * 20;

        } else if (ruolo.equalsIgnoreCase("collaboratore")) {
            stipendio += (stipendio / 100) * 15;

        } else if (ruolo.equalsIgnoreCase("consulente")) {
            stipendio += (stipendio / 100) * 10;

        } else {
            System.out.println("sei sicuro di lavorare per noi!?");
        }

        if (ruolo.equalsIgnoreCase("dipendente") || ruolo.equalsIgnoreCase("collaboratore")
                || ruolo.equalsIgnoreCase("consulente")) {
            if (esperienza >= 30) {
                stipendio += 500;
            } else if (esperienza < 30 && esperienza >= 20) {
                stipendio += 350;
            } else if (esperienza < 20 && esperienza >= 9) {
                stipendio += 200;
            } else if (esperienza < 20 && esperienza >= 6) {
                stipendio += 100;
            } else {
                System.out.println("Non hai abbastanza esperienza per meritarti un'aumento");
            }

            System.out.println(stipendio);
        } else {
            System.out.println("Ma chi ti conosce?!");
        }

        tastiera.close();

    }

}
