package Oggetti_01.main;
import java.io.FileNotFoundException;
import java.util.Scanner;
import Oggetti_01.entities.Vik;

public class mainVik_01
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //Testiamo qualche metodo della classe VIK
        //I metodi della classe VIK saranno tutti static così da non necessitare di un oggetto
        //per essere richiamati e utilizzati. In questo modo saranno riutilizzabili in ogni progetto.
        double numero = 10;
        System.out.println(Vik.isCompreso(numero));
        System.out.println(Vik.isCompreso(4));
        System.out.println(Vik.isCompreso(23.4));
        System.out.println("Riga 15: " + Vik.isCompreso(-10));
        Vik.MIN = -20;
        Vik.MAX = -8;
        System.out.println("Riga 18: " + Vik.isCompreso(-10));

        System.out.println("Righe del file: " + Vik.contaRighe("Oggetti_01\\main\\elenco.txt"));

        System.out.println("Riga 24: " + Vik.componiArrayDaFile("Oggetti_01\\main\\elenco.txt").size());

        System.out.println(Vik.stampaArrayString("Oggetti_01\\main\\elenco.txt"));

        String username = "admin";
        String password = "pippo";
        String percorsoFile = "Oggetti_01\\main\\elencoCerca.txt";
        String separatore = ",";
        System.out.println("Riga 32: " + Vik.check(percorsoFile, separatore, username, password));

        String autore = "Dick";
        String titolo = "Il signore degli anelli";
        percorsoFile = "Oggetti_01\\main\\elencoCerca.txt";
        separatore = ",";

        String ris = "Il libro " + titolo + " dell'autore " + autore +  " non è presente.";
        if(Vik.check(percorsoFile, separatore, autore, titolo))
            ris = "Il libro " + titolo + " dell'autore " + autore +  " è disponibile.";
        System.out.println("Riga 42: " + ris);

        Scanner tastiera = new Scanner(System.in);
        //Se volessi verificare che il valore passato come parametro contenga almeno due caratteri
        //basterebbe sovrascrivere il valore della proprietà static MIN all'interno di Vik che poi
        //il metodo checkString() sfrutta come parametro di riferimento per il calcolo:
        Vik.MIN = 2;
        do
        {
            System.out.println("Come ti chiami");
            ris = tastiera.nextLine();
        }
        while(Vik.checkString(ris) == false);
        System.out.println(ris + " è una String accettabile.");
        tastiera.close();
    }   
}