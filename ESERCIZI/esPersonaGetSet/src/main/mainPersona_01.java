package main;

import java.util.Scanner;

import entities.Persona;

public class mainPersona_01 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci il nome della persona");
        String nome = tastiera.nextLine();
        int eta;
        do {
            System.out.println("Inserisci l'età di " + nome);
            eta = Integer.parseInt(tastiera.nextLine());
        } while (eta < 0);
        tastiera.close();

        Persona p;
        p = new Persona(nome, eta);
        String ris;
        // Stampare il riepologo dei valori.
        ris = "Riepilogo\n" + p.toString() + "\n";
        System.out.println(ris);

        // Se la proprietà nome dell'oggeto p di tipo Persona è visibile a livello
        // public è possibile richiamarla
        // al di fuori della classe Persona per assegnare un valore oppure leggerlo.
        // p.nome = "Pippo";
        // System.out.println("p.nome: " + p.nome);
        // Cosa succederebbe se la proprietà non fosse public ma fosse invece private?
        // Una proprietà private non è visibile al di fuori della classe in cui viene
        // dichiarata.
        // Se nome fosse private, nel main non sarebbe possibile richiamarla e di
        // conseguenza non sarebbe possibile:
        // LEGGERNE IL VALORE
        // SCRIVERE IL VALORE -> assegnare un valore.
        // Perché allora qualcuno dovrebbe mettere private come livello di visibilità a
        // nome?
        // Una proprietà private è inaccessibile direttamente. Questo evita che qualcuno
        // possa comprometterla.
        // Una volta che la proprietà è private per poter accedere al suo valore devo
        // ricorrere al metodo get()
        // get() è un metodo che tendenzialmente significa LEGGI e lo abbiamo già
        // incontrato sugli AL.
        // .GET(I) -> che restituiva l'elemento in posizione iesima.
        // Scrivere p.getNome() significa chiedere all'oggetto p di tipo Persona il
        // valore restituito dal metodo
        // stavolta visibile perché public getNome().
        // Ho la sicurezza che il valore della proprietà dell'oggetto nome e il return
        // di getNome() siano gli stessi?
        // NO!
        // La differenza sta nel fatto che mentre la proprietà è un valore assegnato, il
        // metodo get() restituisce un
        // valore calcolato ovvero può presentare logiche, modifiche e tutto quello che
        // è consono al metodo.
        // La parte importante è che getNome() fa da intermediario tra chi richiede il
        // valore della proprietà e la proprietà stessa
        // che resta inaccessibile al di fuori della classe.
        System.out.println("RIGA 50 p.getNome(): " + p.getNome());
        // Per riassegnare un valore a nome dopo che l'oggetto è stato creato dal
        // costruttore
        // devo ricorrere al metodo setNome() in quanto la proprietà nome è ormai
        // private.
        p.setNome("Wolverine");
        // Se ora richiedo nuovamente il valore della proprietà nome da qualunque output
        // otterrò il nuovo valore:
        System.out.println("RIGA 56: p.getNome(): " + p.getNome());
        System.out.println("RIGA 57: p.toString(): " + p.toString());
        p.setClasse(14);
        System.out.println("RIGA 57bis: p.toString(): " + p.toString());
    }
}