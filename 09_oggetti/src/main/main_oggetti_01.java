package main;

//Come per la classe Scanner anche Persona non è
//presente ovviamente di default nei progetti Java pertanto è necessario importarla.
import entities.Persona;

public class main_oggetti_01 {
    // La classe main è una classe di AVVIO ovvero serve per avviare ed eseguire il
    // programma.
    // Un programma abbiamo già visto essere una sequenza di istruzioni
    // che permette, da un input, di ottenere un output.
    public static void main(String[] args) {
        // Dichiariamo una variabile p di tipo Persona.
        // Cosa significa?
        // Significa che stiamo dicendo a Java che p è un OGGETTO il cui tipo è definito
        // dalla classe che lo ha
        // costruito. Se la classe si fosse chiamata Pippo, p sarebbe stata di tipo
        // Pippo.
        // Le classi vengono per convenzione scritte TUTTE CON LA PRIMA LETTERA
        // MAIUSCOLA per riconoscerle dal resto
        // delle variabili. Abbiamo già visto altre tipologie di classi: String,
        // ArrayList, Scanner etc...
        Persona p;
        // Inizializzo l'oggetto p di tipo Persona attraverso il codice new Persona() ->
        // vedremo poi cosa significa.
        p = new Persona();
        // p.nome = "Nome1" si legge: alla proprietà nome dell'oggetto p di tipo Persona
        // viene assegnato il valore "Nome1"
        p.nome = "Nome1";
        // p.classe = 4 si legge: alla proprietà classe dell'oggetto p di tipo Persona
        // viene assegnato il valore 4
        p.classe = 4;
        // NOTA BENE: il tipo di variabile che viene assegnato a una proprietà
        // dell'oggetto
        // deve essere uguale al tipo della proprietà stessa. In questo caso nome è di
        // tipo String quindi "Nome1"
        // va bene. Stessa cosa per il numero 4 assegnato a classe.
        // p.toString() è un po' diverso perché si tratta di richiamare un METODO
        // dell'oggetto p di tipo Persona.
        // Un metodo è un dato/valore calcolato. Rispetto a "Nome1" che è una semplice
        // String, il processo per ottenere
        // toString() è leggermente diverso. La classe main quando deve stampare il
        // toString() di p chiede alla classe
        // persona di eseguire il calcolo che restituisce un valore. Da qui in poi è il
        // toString() a gestire il processo
        // ovvero la classe Persona stessa.
        // SEPARAZIONE DELLE COMPETENZE. toString() è un'azione che non fa parte di
        // main. Main può solo chiedere
        // alla classe Persona di "fare" il toString() ma l'intero processo viene
        // gestito, demandato ad altri.
        // Solo Persona sa cosa restituisce il toString() quindi main si deve "fidare".
        System.out.println(p.toString());
        // Se ora avviamo il programma, in console verrà stampato:
        // Nome1 4
        // Come funziona step by step:
        // RIGA 18 -> il programma legge per intero la classe Persona così da capire
        // come funziona.
        // RIGA 19 -> il programma, attraverso un metodo chiamato costruttore che
        // vedremo in seguito costruisce
        // l'oggetto p di tipo Persona. Da quel momento p è utilizzabile e può aver
        // valorizzate le proprietà
        // Per ora le proprietà di p hanno i valori di default ma ESISTONO.
        // RIGA 22 -> il programma assegna alla proprietà nome di p il valore "Nome1"
        // sovrascrivendo quello di default.
        // RIGA 24 -> il programma assegna alla proprietà classe di p il valore 4
        // sovrascrivendo quello di default.
        // RIGA 46 -> il programma stampa il risultato (return) del metodo toString()
        // dell'oggetto p di tipo Persona:
        // main non sa cosa stamperà ma solo che sarà di tipo String perché è l'unica
        // informazione che viene data
        // dalla classe Persona in merito al toString(). La modalità in cui avviene il
        // processo e tutto quanto concerne il toString()
        // dipendono dalla classe Persona. Main è solo il richiedente.
    }
}