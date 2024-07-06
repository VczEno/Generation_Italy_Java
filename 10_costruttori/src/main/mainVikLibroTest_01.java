package Oggetti_01.main;
import java.io.FileNotFoundException;
import Oggetti_01.entities.Vik;

public class mainVikLibroTest_01
{
    public static void main(String[] args) throws FileNotFoundException
    {    
        String cerca = "toLkieN";
        String testo = "Il signore degli anelli è un libro di Tolkien scritto dopo Lo Hobbit";
        System.out.println(Vik.checkStringIndexOf(cerca, testo));

        String[] generi = {"Fantascienza","Fantasy","Graphic Novel"};
        String genere = "Fantascienzo";
        System.out.println(Vik.StringIsPresente(genere, generi));

        String casaEd = "Lonely planet";
        System.out.println(Vik.StringIsPresente(casaEd,"Oggetti_01\\main\\elencoEditori.txt"));
    }
}