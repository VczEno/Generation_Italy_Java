package main;

import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Quanti numeri vuoi memorizzare?");
        int n = Integer.parseInt(kb.nextLine());
        double[] valori = new double[n];
        int i = 0;

        while (i < n) {

            System.out.print("Inserisci il valore n° " + (i + 1) + "\n");

            valori[i] = Double.parseDouble(kb.nextLine());
            i++;
        }

        int op = 0;

        do {
            System.out.println(
                    "Scegli l'operazione da eseguire:\n1- Calcolare la somma dei numeri\n2- Calcolare la media dei numeri\n3- Trovare il numero più alto\n4- Trovare il numero più basso\n5- Modificare un determinato numero\n6- stampare i numeri al contrario\n7- stampare i numeri al contrario ma solo quelli di indice dispari\n8- stampare i numeri al contrario ma solo quelli pari di indice dispari\n9- chiudi il programma\n");
            op = Integer.parseInt(kb.nextLine().trim());

            switch (op) {

                case 1:
                    double sum = 0;

                    for (double val : valori) {
                        sum += val;
                    }
                    System.out.println("La somma dei valori è pari a: " + sum + "\n");
                    break;
                case 2:
                    double sum2 = 0;

                    for (double val : valori) {
                        sum2 += val;
                    }

                    System.out.println("La media dei valorei è pari a: " + (sum2 / n) + "\n");

                    break;
                case 3:

                    double max = valori[0];

                    for (double val : valori) {
                        max = val > max ? val : max;
                    }

                    System.out.println("Il valore massimo è pari a: " + max + "\n");

                    break;
                case 4:

                    double min = valori[0];

                    for (double val : valori) {
                        min = val < min ? val : min;
                    }
                    System.out.println("Il valore minimo è pari a: " + min + "\n");

                    break;
                case 5:
                    String list = "";
                    for (int j = 0; j < valori.length; j++) {
                        list += (j + 1) + ") " + valori[j] + "\n";
                    }
                    System.out.println("Quale numero vuoi modificare?Indica l'indice del numero scelto\n" + list);
                    int index = (Integer.parseInt(kb.nextLine().trim()) - 1);
                    System.out.println("\nInserisci il nuovo valore?\n");
                    double newValue = Double.parseDouble(kb.nextLine().trim());
                    valori[index] = newValue;
                    break;
                case 6:
                    String reverseList = "";
                    for (int k = valori.length - 1; k >= 0; k--) {
                        reverseList += valori[k] + "\n";
                    }
                    System.out.println(reverseList);
                    break;
                case 7:
                    String reverseListEvenInd = "";
                    for (int ii = valori.length - 1; ii >= 0; ii--) {
                        if (ii % 2 == 0)
                            reverseListEvenInd += valori[ii] + "\n";

                    }
                    System.out.println(reverseListEvenInd);

                    break;
                case 8:
                    String reverseListOddInd = "";
                    for (int jj = valori.length - 1; jj >= 0; jj--) {

                        if (jj % 2 != 0)
                            reverseListOddInd += valori[jj] + "\n";
                    }
                    System.out.println(reverseListOddInd);

                    break;
                case 9:
                    System.out.println("a presto!");
                    break;

                default:
                    System.out.println("ERRORE! inserire di nuovo il numero dell'operazione desiderata");
                    break;
            }

        } while (op != 9);
        System.out.println("a presto!");

        kb.close();

    }

}
