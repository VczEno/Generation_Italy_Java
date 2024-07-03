package Oggetti_01.main;
import java.util.Scanner;
import Oggetti_01.entities.Persona;

public class mainPersona_01
{
    public static void main(String[] args)
    {
        //Nel main fate in modo di ricevere i valori dall'utente o da
        //file a seconda di quanto male vi vogliate.
        //Create l'oggetto se i requisiti lo consentono
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci il nome della persona");
        String nome = tastiera.nextLine();
        int eta;
        do
        {
            System.out.println("Inserisci l'età di " + nome);
            eta = Integer.parseInt(tastiera.nextLine());
        }
        while(eta < Persona.ETAMIN);
        tastiera.close();
        //L'oggetto non esiste
        Persona p; //L'oggetto è dichiarato ma NON ESISTE
        p = new Persona(nome,eta); //Ora l'oggetto ESISTE perchè è stato COSTRUITO
        String ris;
        //Stampare il riepologo dei valori.
        ris = "Riepilogo\n" + p.toString() + "\n";
        System.out.println(ris);
    }   
}