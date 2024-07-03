package Oggetti_01.main;
import java.util.Scanner;
import Oggetti_01.entities.Libro;

public class mainLibro_01
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci il titolo");
        String titolo = tastiera.nextLine();
        System.out.println("Inserisci il prezzo base");
        double prezzoBase = Double.parseDouble(tastiera.nextLine());
        int iva;
        do
        {
            System.out.println("Inserisci l'IVA da applicare al libro sapendo che varia tra 4 e 22");
            iva = Integer.parseInt(tastiera.nextLine());
        }
        while(iva < Libro.IVAMIN || iva > Libro.IVAMAX);
        System.out.println("Inserisci la casa editrice");
        String casaEd = tastiera.nextLine();
        tastiera.close();
        //Qui io sono sicuro che i valori ricevuti dall'utente sono corretti rispetto alle richieste
        //della classe modello. L'IVA deve essere compresa tra IVAMIN e IVAMAX
        Libro l = new Libro(titolo, prezzoBase);
        System.out.println("Riga 25: Libro costruito con il costruttore alla riga 24 della classe Libro\n" + l.toString());
        System.out.println("--------------------------------------------\n");

        Libro l1 = new Libro(titolo, prezzoBase, iva, casaEd);
        System.out.println("Riga 29: Libro costruito con il costruttore alla riga 30 della classe Libro\n" + l1.toString());
        System.out.println("--------------------------------------------\n");
    }    
}