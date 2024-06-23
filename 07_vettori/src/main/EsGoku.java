package main;
//Leggere da un file un elenco di numeri scritti uno sotto l'altro.

//Inserire ogni numero alla posizione iesima di un vettore
//Stampare:
//LIVELLO GOKU
//1 - Elenco dei numeri pari
//2 - Elenco dei numeri in posizione dispari
//3 - Somma dei numeri
//4 - Media dei primi 5 numeri
//5 - Somma del primo e dell'ultimo numero
//6 - Elenco dei numeri partendo dall'ultimo
//LIVELLO SUPER SAYAN
//7 - Numero maggiore
//8 - Numero minore
//LIVELLO BROLY
//9 - Elenco dei numeri maggiori della media dei numeri
//RIFATTORIZZAZIONE
//10 - Rifare l'esercizio leggendo i numeri su un'unica riga del file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EsGoku {
    public static void main(String[] args) throws FileNotFoundException {

        // scanner per leggere il file
        Scanner file = new Scanner(new File("07_vettori\\src\\res\\listaNumeri.txt"));
        // contatore per il numero di righe nel file
        int nLines = 0;
        // scorro il documento riga per riga e incremento il documento
        while (file.hasNextLine()) {
            nLines++;
            file.nextLine();
        }
        // chiudo la lettura del file
        file.close();

        // definisco un array di dimensione pari alle righe del file
        int[] numbers = new int[nLines];

        // riapro il file per riportare il cursore alla prima riga
        file = new Scanner(new File("07_vettori\\src\\res\\listaNumeri.txt"));

        // definisco le variabili necessarie per immagazzinare i dati
        String evenList = "List of even number: \n";
        String oddIndexList = "List of number with odd index: \n";
        int sum = 0;
        int averageFirstFiveN = 0;
        int sumFirstLast = 0;

        // ciclo l'array (inizialmente vuoto)
        for (int i = 0; i < numbers.length; i++) {
            // metto nella posizione i-esima il valore della i-esima riga
            numbers[i] = Integer.parseInt(file.nextLine());

            // se il numero è pari lo concateno nella lista
            if (numbers[i] % 2 == 0)
                evenList += numbers[i] + "\n";

            // se l'indice è dispari concateno il valore nella lista
            if (i % 2 != 0)
                oddIndexList += numbers[i] + "\n";

            // incremento la sommatoria con il valore
            sum += numbers[i];

            // i primi 5 numeri li sommo nella variabile
            if (i < 5)
                averageFirstFiveN += numbers[i];

            // i valori nella prima e ultima posizione li sommo nella variabile
            if (i == 0 || i == (numbers.length - 1))
                sumFirstLast += numbers[i];

        }

        // variabile per registrare la lista al contrario
        String reverseList = "Reverse list of all numbers: \n";

        // ciclo a partire dall'ultima posizione e decremento l'indice fino a 0
        for (int i = (numbers.length - 1); i >= 0; i--) {
            // concateno il valore nella lista
            reverseList += numbers[i] + "\n";
        }

        // chiudo il file
        file.close();

        // stampo tutto
        System.out.println("PUNTO 1: \n" + evenList + "PUNTO 2: \n" + oddIndexList + "PUNTO 3: \nSum of all number: "
                + sum + "\nPUNTO 4: Average value of the first five numbers: " + (1.0 * averageFirstFiveN / 5)
                + "\nPUNTO 5: Sum of the first and last values: " + sumFirstLast + "\nPUNTO 6: \n" + reverseList);
    }
}
