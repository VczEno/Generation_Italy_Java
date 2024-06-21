
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EsFile2 {
    /*
     * Scrivere un programma che legga un file contenente una serie di numeri
     * positivi
     * maggiori di zero scritti uno sotto l'altro.
     * Es:
     * 5
     * 94
     * 3
     * 45
     * Stampare:
     * l'elenco dei numeri maggiori di 10
     * la somma dei numeri dispari
     * il numero col valore più alto
     */

    public static void main(String[] args) throws FileNotFoundException {
        // dichiaro la varibile percorso e la inizializzo con il relative path
        String percorso = "src\\res\\numeri.txt";
        // dichiaro la variabile file di tipo scanner per leggere il file
        Scanner file = new Scanner(new File(percorso));

        double num = 0; // variabile d'appoggio dove salvo il valore letto
        String numeriMaggioriDiDieci = "I numeri maggiori di dieci sono: \n"; // variabile string dove progressivamente
                                                                              // registro i numeri > 10
        double sommaDispari = 0; // variabile somma a cui aggiungo progressivamente i numeri dispari
        double numMaggiore = 0; // variabile dove salvo il numero maggiore presente nel file

        // while che cicla finchè ci sono righe da leggere nel file
        while (file.hasNextLine()) {

            num = Double.parseDouble(file.nextLine()); // leggo la riga nel file e lo converto a double

            if (num > 10) // se il numero è maggiore di 10 entro nell'if e lo concateno alla stringa
                numeriMaggioriDiDieci += num + "\n";

            if (num % 2 != 0) // se il numero non è divisibile per due entro nell'if e lo aggiungo alla somma
                              // dei dispari
                sommaDispari += num;

            if (num > numMaggiore) // se il numero incontrato è più grande di quelli incotrati in precedenza entro
                                   // nell'if e sostituisco il valore
                numMaggiore = num;

        }

        file.close(); // chiudo l'oggetto file finita la lettura del .txt

        // stampo la risposta
        System.out.println(numeriMaggioriDiDieci + "La somma dei numeri dispari è:" + sommaDispari
                + ".\nIl numero più grande è: " + numMaggiore);

    }
}
