package main;

import java.util.Scanner;

public class Main_Eccezioni_01 {
    public static void main(String[] args) {
        // Un'eccezione è un'eventualità che si può presentare durante la stesura di un
        // programma.
        // Può essere logica e quindi prevedibile oppure non prevedibile perché
        // segue dei comportamenti illogici.
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un numero.");
        // NUMBERFORMAEXCEPTION è un tipo di eccezione che si realizza quando
        // viene richiesto un valore numerico ma ciò che si ottiene è un valore di altro
        // tipo.
        // Integer.parseInt() è un metodo di Integer che si aspetta un valore String
        // corrispondente a un numero intero. Il metodo prova a cercare una
        // corrispondenza
        // tra il valore passato come parametro e un numero intero
        // ES.: "1" -> 1
        // Se viene trovata la corrispondenza il valore String viene "trasformato" in
        // intero. In caso contrario il programma
        // crasha perché ad esempio non riesce a trasformare "uno" in 1
        // Il problema quindi si realizza alla richiesta del parseInt().
        String input = tastiera.nextLine();
        tastiera.close();
        // int input = Integer.parseInt(tastiera.nextLine());
        // Ci sono due modi per ovviare al problema:
        // 1 - FINGERE CHE NON CI SIA -> non gestire il problema, lasciare che siano
        // altri a
        // farlo oppure lasciare che il programma crashi.
        // throws -> indica che l'EXCEPTION non è stata gestita.
        // int numero = Integer.parseInt(input);
        // 2 - GESTIRE IL PROBLEMA creando quello che viene definito TRY/CATCH.
        try {
            // PROVA a trasformare il valore String input in un valore intero.
            // Se ci riesci associalo alla variabile int numero.
            int numero = Integer.parseInt(input);
            System.out.println("RIGA 35: tutto a posto: " + numero);
        } catch (NumberFormatException e) {
            // All'interno del catch è necessario DICHIARARE il tipo di eccezione che quel
            // catch dovrà gestire.
            // In questo caso l'eccezione è NumberFormatException quindi dichiariamo un
            // oggetto e di tipo NumberFormatException
            // in modo da spiegare al programma che se dovesse realizzarsi l'eccezione
            // NumberFormatException dovrà
            // CATTURARLA ed eseguire le istruzioni previste nel blocco di codice.
            System.out.println(
                    "RIGA 43: Non sono riuscito a trasformare il valore passato come parametro in intero. Ma non sono crashato.");
        }
    }
}