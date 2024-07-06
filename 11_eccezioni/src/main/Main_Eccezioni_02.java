package main;

import java.util.*;

public class Main_Eccezioni_02 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int numero = 0;
        boolean ripeti;
        do {
            System.out.println("Inserisci un numero");
            try {
                System.out.println("Ciao");
                numero = Integer.parseInt(tastiera.nextLine());
                ripeti = false;
            } catch (NumberFormatException e) {
                ripeti = true;
                // Il metodo printStackTrace() permette di stampare in console la causa del
                // problema
                e.printStackTrace();
                // Il metodo getMessage() permette di ottenere il messaggio di errore
                // da stampare eventualmente in console.
                System.out.println("e.getMessage(): " + e.getMessage());
            }
        } while (ripeti);
        System.out.println("Numero: " + numero);
        tastiera.close();
    }
}
