
import java.util.Scanner;

// connettori logici

public class AvvioSelezione_04 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.println("ciao, sei di Jaita127?");
        String risposta = tastiera.nextLine();

        // per dire "questa condizione o quell'altra" utilizziamo il
        // connettore or: ||
        // --> la MACROCONDIZIONE (condizione che comprende le due o piu
        // microcondizioni) sara' VERIFICATA
        // se almeno una delle MICROCONDIZIONI e' VERIFICATA
        if (risposta.equalsIgnoreCase("si") || risposta.equalsIgnoreCase("certo")
                || risposta.equalsIgnoreCase("yesss")) {
            System.out.println("Ciao quanti anni hai?");
            int eta = Integer.parseInt(tastiera.nextLine());
            System.out.println("quante birre hai bevuto ieri?");
            int numeroBirre = Integer.parseInt(tastiera.nextLine());

            // per dire "questa condizione e quell'altra" utilizziamo il
            // connettore and: &&
            // --> la MACROCONDIZIONE (condizione che comprende le due o piu
            // microcondizioni) sara' VERIFICATA
            // se entrambe le MICROCONDIZIONI sono VERIFICATE
            if (eta >= 18 && numeroBirre > 5) {
                System.out.println("Sei un* di noi!");
            }

            // ora nego la condizione dell'if precedente andando quindi
            // a prendere in esame tutti i casi che erano stati esclusi.
            if (!(eta >= 18 && numeroBirre > 5)) {
                System.out.println("quanti shottini hai bevuto ieri sera?");
                int numeroShottini = Integer.parseInt(tastiera.nextLine());

                // possiamo mischiare i connettori && e || in base al senso con cui vogliamo
                // costruire la MACROCONDIZIONE FINALE
                if (eta >= 18 && (numeroBirre >= 3 || numeroShottini >= 4)) {
                    System.out.println("Sei comunque un* di noi!!");
                }
            }
            // per capirci qualcosa in piu seguiamo una regola:
            // analiziamo prima il risultato della condizione interna "eta >= 18 &&
            // numeroBirre>5"
            // e poi, visto che viene preceduta dal ! andremo a considerare il risultato
            // opposto:
            // eta >= 18 && numeroBirre>5 = TRUE ===> !(eta >= 18 && numeroBirre>5) = FALSE
            // eta >= 18 && numeroBirre>5 = FALSE ===> !(eta >= 18 && numeroBirre>5) = TRUE

            boolean rangeEta = (eta >= 18 && eta < 100);
            if (rangeEta) {
                System.out.println("Sei vecchio ma non decrepito!");
            }

            if (!rangeEta && eta > 0) {
                if (eta < 18) {
                    System.out.println("pussa via minorenne");
                }
                if (eta >= 100) {
                    System.out.println("Sei veramente vecchio!");
                }
            }

        }

        tastiera.close();
    }

}
