
import java.util.Scanner;

public class Esercizio6 {

    /*
     * Provando ad utilizzare i ternari dove possibile calcolare il prezzo di
     * ingresso per il colosseo
     * di base il prezzo è 10 ma a seconda di alcune condizioni
     * verranno effettuati degli sconti
     * chiedere all'utente l'età, la professione, la residenza e se ha un coupon
     * i residenti a Roma non pagano, quindi è gratis
     * chi ha meno di 5 anni o più di 70 paga 5
     * chi come professione è studente o docente ha uno sconto di 2 euro
     * chi ha il coupon ha un ulteriore sconto di 2 euro
     * 
     * chiedere ad un utente le informazioni necessarie per
     * fornigli il biglietto al giusto prezzo
     */

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        int prezzo = 10;
        int eta;
        String professione, residenza;
        boolean coupon;

        System.out.println("Inserisci le tue informazioni e calcoleremo il costo del biglietto\nQuanti hanni hai?");
        eta = Integer.parseInt(tastiera.nextLine());
        System.out.println("Che professione svolgi?");
        professione = tastiera.nextLine();
        System.out.println("Dove risiedi?");
        residenza = tastiera.nextLine();
        System.out.println("Hai un coupon? scrivi 'true' o 'false'");
        coupon = Boolean.parseBoolean(tastiera.nextLine());

        if ("roma".equalsIgnoreCase(residenza)) {
            prezzo = 0;
            System.out.println("Si romano, entri aggratise!");
        } else {
            if (eta < 5 || eta > 70) {
                prezzo = 5;
            } else if ("docente".equalsIgnoreCase(professione) || "studente".equalsIgnoreCase(professione)) {
                prezzo = 8;
            }

            if (coupon) {
                prezzo -= 2;
            }
        }

        System.out.println("Prezzo:" + prezzo + " coupon: " + coupon);

        tastiera.close();
    }

}
