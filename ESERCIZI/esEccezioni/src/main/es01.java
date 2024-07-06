package main;

/* 
 * Nei seguenti esercizi gestire gli errori utilizzando il blocco try-catch.
Tra le tonde del catch, nel caso non si conosca il nome della classe dell'eccezione da gestire, inserite la generica classe Exception: catch(Exception e)
In caso di eccezione stampare in consolle:
- un messaggio di errore inerente al contesto (esempio: "il valore inserito non è un numero intero")
- la "traccia" dell'errore attraverso una chiamata all'apposito metodo (come visto a lezione in mattinata)

Esercizio 1                     

Gestire l'eccezione generata dal codice
int[] T = null;
T[0] = 7;
 */

public class es01 {
    public static void main(String[] args) {

        int[] t = null;
        try {
            t[0] = 7;
        } catch (NullPointerException e) {
            System.out.println("il vettore non è stato inizializzato, impossibile aggungere il valore");
            System.out.println(e.getMessage());
        }

    }
}
