
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) throws FileNotFoundException {
        String percorso = "src/res/parole.txt";
        Scanner file1 = new Scanner(new File(percorso));

        // quante parole ci sono nel file?
        // trovo questa informazione alla prima riga del file:
        int dimensione = 0;

        if (file1.hasNextLine())
            dimensione = Integer.parseInt(file1.nextLine());
        String[] parole = new String[dimensione];
        // quindi ho creato un vettore della dimensione che ho trovato alla prima riga
        // del file

        // ora andiamo a valorizzare ogni cella
        // nella condizione del for collego due microcondizioni con le &&
        // per avere piu controllo sul programma
        for (int i = 0; i < dimensione && file1.hasNextLine(); i++) {
            parole[i] = file1.nextLine();
        }
        file1.close();

        // adesso stampiamo per vedere se abbiamo inserito correttamente:
        String ris = "ELENCO PAROLE UTILIZZANDO IL FOR CLASSICO: ";
        for (int i = 0; i < dimensione; i++) {
            ris += "\nparola " + (i + 1) + ": " + parole[i];
        }
        System.out.println(ris);

        // proviamo a effettuare un'altra stampa utilizzando un altro ciclo
        // FOR EACH
        // e' molto utile quando non mi interessa usare gli indici
        // sintassi: for( tipoElemento nomeElemento : nomeVettore){...}
        // NB: - tipoElemento dev essere lo stesso del tipo degli elementi del vettore
        // - Elemento e' una variabile che SCORRE lungo tutto il vettore
        // e ad ogni giro del forEach assume il valore dell'elemento che trova nella
        // cella.
        ris = "ELENCO PAROLE UTILIZZANDO IL FOR EACH: ";
        for (String parola : parole) {
            ris += "\n" + parola;
        }
        System.out.println(ris);
        // attenzione: volendo, posso usare un indice nel for each ma devo crearlo
        // artigianalmente
        // così come facevamo con il while. A quel punto tanto vale usare direttamente
        // il for classico!
        // ==>> quindi uso il for solo quando non ho bisogno dell'indice.

    }

}
