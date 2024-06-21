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

public class EsBrolyRefactoring {
    public static void main(String[] args) throws FileNotFoundException {

        // scanner per leggere il file
        Scanner file = new Scanner(new File("src\\res\\rigaNumeri.txt"));
        // contatore per il numero di righe nel file

        // definisco un array di dimensione pari alle righe del file, facendo lo split
        // l'array è di stringhe

        String[] numbers = file.nextLine().split("-");

        // definisco le variabili necessarie per immagazzinare i dati
        String evenList = "List of even number: \n";
        String oddIndexList = "List of number with odd index: \n";
        int sum = 0;
        int averageFirstFiveN = 0;
        int sumFirstLast = 0;
        int bigestN = 0;
        int smallestN;
        int parsedN;
        String biggerThanAverageList = "List of bigger than average values: \n";

        // ciclo l'array (inizialmente vuoto)
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            // dato che ora sto usando un array di stringhe ad ogni ciclo mi salvo il valore
            // parsato ad intero
            // nella variabile parsedN, così da poter svolgere le operazioni matematiche
            parsedN = Integer.parseInt(numbers[i]);

            // se il numero è pari lo concateno nella lista
            if (parsedN % 2 == 0)
                evenList += numbers[i] + "\n";

            // se l'indice è dispari concateno il valore nella lista
            if (i % 2 != 0)
                oddIndexList += numbers[i] + "\n";

            // incremento la sommatoria con il valore
            sum += parsedN;

            // i primi 5 numeri li sommo nella variabile
            if (i < 5)
                averageFirstFiveN += parsedN;

            // i valori nella prima e ultima posizione li sommo nella variabile
            if (i == 0 || i == (numbers.length - 1))
                sumFirstLast += parsedN;

            // sei il valore è il più grande incontrato finora lo salvo nella variabile
            if (parsedN > bigestN)
                bigestN = parsedN;

            if (parsedN > (1.0 * sum / numbers.length))
                biggerThanAverageList += numbers[i] + "\n";

        }

        // inizializzo il numero più piccolo pari al più grande, così scorrendo di nuovo
        // tutti i numeri posso sovrascrivere
        // la variabile ogni volta che incontro un numero più piccolo
        smallestN = bigestN;

        // variabile per registrare la lista al contrario
        String reverseList = "Reverse list of all numbers: \n";

        // ciclo a partire dall'ultima posizione e decremento l'indice fino a 0
        for (int i = (numbers.length - 1); i >= 0; i--) {

            // dato che ora sto usando un array di stringhe ad ogni ciclo mi salvo il valore
            // parsato ad intero
            // nella variabile parsedN, così da poter svolgere le operazioni matematiche
            parsedN = Integer.parseInt(numbers[i]);

            // concateno il valore nella lista
            reverseList += numbers[i] + "\n";

            // sei il valore è il più grande incontrato finora lo salvo nella variabile
            if (parsedN < smallestN)
                smallestN = parsedN;

            // se il valore è maggiore della media (la sommatoria l'ho calcolata nel primo
            // ciclo)
            // lo concateno nella lista
            if (parsedN > (1.0 * sum / numbers.length))
                biggerThanAverageList += numbers[i] + "\n";
        }

        // chiudo il file
        file.close();

        // stampo tutto
        System.out.println("PUNTO 1: \n" + evenList + "PUNTO 2: \n" + oddIndexList + "PUNTO 3: \nSum of all number: "
                + sum + "\nPUNTO 4: Average value of the first five numbers: " + (1.0 * averageFirstFiveN / 5)
                + "\nPUNTO 5: Sum of the first and last values: " + sumFirstLast + "\nPUNTO 6: \n" + reverseList
                + "PUNTO 7: Biggest value: " + bigestN + "\nPUNTO 8: Smallest value: " + smallestN
                + "\nPUNTO 9:" + biggerThanAverageList);
    }
}
