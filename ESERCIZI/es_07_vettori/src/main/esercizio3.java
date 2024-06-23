package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class esercizio3 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner file = new Scanner(new File("ESERCIZI\\es_07_vettori\\src\\res\\es3_parole.txt"));
        Scanner kb = new Scanner(System.in);

        String[] words = file.nextLine().split(" ");

        int op = 0;

        do {
            System.out.println(
                    "Scegli l'operazione da eseguire:\n1- stampare la parola che contiene piu vocali\n2- stampare la parola che contiene piu vocali e l'indice del vettore in cui essa e' contenuta\n3- stampare la parola che contiene piu vocali (o le parole se sono piu di una)\n4- stampare le parole che iniziano con la lettera 'R' o 'r'\n5- stampare le parole che finiscono con la lettera 'e' o 'E' e i loro indici\n6- stampare le parole piu corte\n7- cercare una parola all'interno del vettore\n8- modificare l'iniziale di una parola a scelta\n9- chiudi il programma\n");
            op = Integer.parseInt(kb.nextLine().trim());

            switch (op) {
                case 1:
                    int wovelsN = 0;
                    int maxWovels = 0;
                    String maxWovelsWord = "";
                    String[] word;
                    for (String w : words) {
                        word = w.split("");
                        for (String letter : word) {
                            if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e")
                                    || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o")
                                    || letter.equalsIgnoreCase("u"))
                                wovelsN++;

                        }
                        if (wovelsN > maxWovels) {
                            maxWovels = wovelsN;
                            maxWovelsWord = w;

                        }

                        wovelsN = 0;
                    }

                    System.out.println("\nLa parola con più vocali è: " + maxWovelsWord + "\n");

                    break;
                case 2:
                    wovelsN = 0;
                    maxWovels = 0;
                    maxWovelsWord = "";
                    int maxWovelsWordIndex = 0;

                    for (int i = 0; i < words.length; i++) {
                        word = words[i].split("");
                        for (String letter : word) {
                            if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e")
                                    || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o")
                                    || letter.equalsIgnoreCase("u"))
                                wovelsN++;

                        }
                        if (wovelsN > maxWovels) {
                            maxWovels = wovelsN;
                            maxWovelsWord = words[i];
                            maxWovelsWordIndex = i;

                        }

                        wovelsN = 0;
                    }

                    System.out.println("\nLa parola con più vocali è: " + maxWovelsWord + ". Si trova all'indice "
                            + maxWovelsWordIndex + " dell'array.\n");
                    break;
                case 3:
                    wovelsN = 0;
                    maxWovels = 0;
                    maxWovelsWord = "";
                    String output = "";

                    for (String w : words) {
                        word = w.split("");
                        for (String letter : word) {
                            if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e")
                                    || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o")
                                    || letter.equalsIgnoreCase("u"))
                                wovelsN++;

                        }
                        if (wovelsN > maxWovels) {
                            maxWovels = wovelsN;
                            maxWovelsWord = w;
                        } else if (wovelsN == maxWovels)
                            maxWovelsWord += " " + w;

                        wovelsN = 0;
                    }

                    output = (maxWovelsWord.indexOf(" ") == -1) ? "\nLa parola con più vocali è: "
                            : "\nLe parole con più vocali sono: ";
                    System.out.println(output + maxWovelsWord + "\n");

                    break;
                case 4:
                    String startingWithR = "";
                    for (String w : words) {
                        if (w.toLowerCase().indexOf("r") == 0)
                            startingWithR += w + " ";
                    }

                    System.out.println("\nLe parole che iniziano con 'r' o 'R' sono: " + startingWithR + "\n");

                    break;
                case 5:
                    String endingWithE = "";

                    for (int i = 0; i < words.length; i++) {

                        word = words[i].split("");

                        if (word[word.length - 1].equalsIgnoreCase("e"))
                            endingWithE += words[i] + " ";

                    }
                    System.out.println("\nLe parole che terminano con 'e' o 'E' sono: " + endingWithE + "\n");

                    break;
                case 6:

                    int minWordLength = words[0].length();
                    String minLengthWords = "";
                    output = "";

                    for (String w : words) {

                        if (w.length() < minWordLength) {
                            minWordLength = w.length();
                            minLengthWords = w;
                        } else if (w.length() == minWordLength)
                            minLengthWords += " " + w;

                    }

                    output = (minLengthWords.indexOf(" ") == -1) ? "\nLa parola più corta è: "
                            : "\nLe parole più corte sono: ";
                    System.out.println(output + minLengthWords + "\n");

                    break;
                case 7:
                    output = "";
                    Boolean findedWord = false;
                    System.out.println("\ninserisci la parola da cercare\n");
                    String input = kb.nextLine();
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].equalsIgnoreCase(input)) {
                            output = "\nTrovata! La parola " + words[i] + " si trova all'indice " + i + "\n";
                            findedWord = !findedWord;
                        }
                    }
                    System.out.println((findedWord) ? output : "\nla parola ricercata non è presente\n");
                    break;
                case 8:
                    output = "\nDi quale parola vuoi modificare l'iniziale? Inserisci il numero associato\n";
                    for (int i = 0; i < words.length; i++) {
                        output += (i + 1) + ") " + words[i] + "\n";
                    }
                    System.out.println(output);
                    int index = Integer.parseInt(kb.nextLine()) - 1;
                    System.out.println(
                            "\ncon quale lettera vuoi cambiare l'iniziale della parola " + words[index] + "?\n");
                    input = kb.nextLine().trim();
                    words[index] = input + words[index].substring(1);
                    System.out.println("\nla parola è stata modificata in: " + words[index] + "\n");
                    break;
                case 9:
                    System.out.println("\nA presto!\n");
                    break;
                default:
                    System.out.println("\nERRORE! inserisci un valore valido\n");
                    break;
            }

        } while (op != 9);

    }
}
