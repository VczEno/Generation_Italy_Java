
// if -   CONDIZIONI VS BOOLEANI

import java.util.Scanner;

public class AvvioSelezione_02 {
    public static void main(String[] args) {

        // all'interno della condizione dell'if posso inserire anche una variabile
        // booleana.

        Scanner tastiera = new Scanner(System.in);
        System.out.println("ciao, quanti anni hai? ");
        int eta = Integer.parseInt(tastiera.nextLine());
        int classe; // questa varibile la dichiaro e basta. verra' inizializzata piu' avanti

        boolean maggiorenne = eta >= 18;
        // ho assegnato alla variabile booleana una valore che sarà o true o false
        // a seconda del valore di eta

        if (maggiorenne) // "diverso da true" == "uguale a false"
            System.out.println("Sei maggiorenne");

        System.out.println("sono fuori dall'if(maggiorenne)");
        // se ometto le parentesi {} viene considerata interna all'if solo la prima
        // istruzione che
        // viene incontrata dal compilatore

        if (!maggiorenne) // coincide con eta<18
        {
            System.out.println("Peccato, devi crescere ancora. Niente alcolici");
            System.out.println("in che classe sei?");
            classe = Integer.parseInt(tastiera.nextLine());
            System.out.println("Che bello essere in classe " + classe);
        }

        System.out.println("Arrivederci!");

        tastiera.close();
    }
}
