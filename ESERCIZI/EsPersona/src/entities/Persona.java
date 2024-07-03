package entities;

public class Persona {
    public String nome;
    public int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public static final int MINETA = 0;
    public static int MAXETA = 20;
    // La classe Persona ha due proprietà dell'oggetto
    // String nome, int eta
    // Il nome non ha particolari richieste mentre l'età deve essere necessariamente
    // maggiore di zero e preferibilmente minore di 20
    // Scrivere una classe Persona con un costruttore che riceve in entrata i
    // parametri String, int
    // ma fare anche in modo che il costruttore non riceva età inferiori al minimo
    // stabilito.
    // Se il valore supera il massimo stabilito accettarlo ma segnalare all'utente
    // che è anomalo.
    // Ragionate con le proprietà static e static final sul controllo dell'età.

    // Nel main fate in modo di ricevere i valori dall'utente o da file a seconda di
    // quanto male vi vogliate.
    // Create l'oggetto se i requisiti lo consentono
    // Stampare il riepologo dei valori.
    // Se la Persona ha più di 17 anni stampare che è anche maggiorenne.

    // EXTRA
    // Se la Persona ha 14 anni stampare che la classe è la 1
    // Se la Persona ha 15 anni stampare che la classe è la 2
    // Se la Persona ha 16 anni stampare che la classe è la 3
    // Se la Persona ha 17 anni stampare che la classe è la 4
    // Se la Persona ha 18 anni stampare che la classe è la 5

}