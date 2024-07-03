package entities;

//Rispetto alla classe di AVVIO, Persona è una classe MODELLO ovvero un insieme di istruzioni che permette di
//creare/generare/istanziare n oggetti di quel tipo.
//Cosa si intende per tipo? In questo caso è il nome della classe stessa ovvero Persona.
//Quando verrà istanziato un oggetto derivante da questa classe il tipo di quell'oggetto sarà Persona.
public class Persona {
    // Queste sono le proprietà dell'oggetto ovvero delle caratteristiche
    // COMUNI A TUTTI GLI OGGETTI DI TIPO Persona
    // Le proprietà inizialmente non hanno valore o meglio, hanno il valore di
    // default del tipo a cui appartengono.
    // String -> null
    // int -> 0
    // NOTA BENE: ogni oggetto di tipo Persona possiede queste proprietà. Potrebbe
    // in futuro non averle valorizzate
    // ma tutti le possiedono. Per farvi un esempio ogni essere umano possiede la
    // proprietà capelli ma alcuni sono
    // calvi. Non significa che non hanno la proprietà ma che il valore di
    // quest'ultima è null o 0.
    public String nome;
    public int classe;

    // METODO -> rispetto alle proprietà dell'oggetto, toString() è un metodo ovvero
    // un processo che quando
    // richiamato esegue una serie di istruzioni. In questo caso restituisce una
    // String contenente la concatenazione
    // di nome + " " + classe ovvero del valore che avranno le proprietà nome e
    // classe.
    // QUALCHE TECNICISMO:
    // public String toString() -> si chiama FIRMA DEL METODO e serve per poter
    // identificare in modo univoco
    // un metodo all'interno del programma.
    // public -> livello di visibilità, per ora accontentatevi.
    // String -> TIPO DI RITORNO. Molto importante perché definisce il tipo di
    // variabile che ritorna il metodo.
    // In pratica una volta invocato il metodo toString() sappiamo che il valore che
    // restituirà sarà una String e possiamo
    // muoverci di conseguenza ad esempio concatenandolo oppure applicando funzioni
    // specifiche come split()
    // toString() -> NOME DEL METODO. Anche in questo caso è importante perché
    // permette di riconoscerlo e richiamarlo.
    // () -> le parentesi per ora sono vuote ma potrebbero contenere qualcosa.
    // All'interno delle parentesi vengono inseriti
    // dei PARAMETRI che serviranno all'esecuzione del metodo.
    public String toString() {
        // RETURN -> indica cosa viene restituito dal metodo. In questo caso la
        // concatenazione dei valori di nome + " " + classe
        // sotto forma di String.
        // Potevo scriverlo anche così:
        // String ris = nome + " " + classe;
        // return ris;
        // ANTICIPAZIONE: non tutti i metodi hanno necessariamente un RETURN ma anche in
        // questo caso ci arriveremo.
        return nome + " " + classe;
    }
}