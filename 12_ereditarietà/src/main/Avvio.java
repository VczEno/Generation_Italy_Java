package main;
/*
 * ripassino principi programmazione
 * PROGRAMMAZIONE CLASSICA (sequenza, selezione, iterazione)
 * PROGRAMMAZIONE AD OGGETTI (incapsulamento, polimorfismo, EREDITARIETA')
 */

import models.Persona;
import models.Studente;

public class Avvio {
    public static void main(String[] args) {
        Persona pers = new Persona("Claudio", 23);
        System.out.println("Prima stampa: " + pers.toString());
        Studente stud = new Studente("Emanuel",21,127);
        System.out.println("Seconda stampa: " + stud.toString());
        Persona polimorfismo = new Studente("Michele",19,127);
        System.out.println("Terza stampa: " + polimorfismo.toString());
        // qui di seguito invece c'è un errore
        //Studente errore = new Persona("ciccio",34);

        // l'oggetto pers è di tipo Persona
        // l'oggetto stud è di tipo studente
        // l'oggetto polimorfismo è di FORMALE Persona, ma di tipo CONCRETO Studente
        // il tipo FORMALE è quello che assegno in fase di DICHIARAZIONE (a sx dell'uguale)
        // il tipo CONCRETO è QUELLO CHE ASSEGNO IN FASE di INIZIALIZZAZIONE/CREAZIONE/ISTANZA (A DX DOPO NEW)
        //      IMPORTANTE: java considera sempre e solo il tipo FORMALE.
        // POLIMORFISMO DI OGGETTI: un oggetti può possedere due forme diverse (formale e concreta)
        // INCAPSULAMENTO: Persona incapsula Studente mostrando l'oggetto solo per il suo tipo formale.
                            // mi è utile se non voglio mostrare l'oggetto per il suo tipo concreto


    }

}
