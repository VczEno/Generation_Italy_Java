import java.util.Scanner;
public class ripasso_02
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        String ris = "";
        System.out.println("Inserisci la tua età");
        int eta = Integer.parseInt(tastiera.nextLine());

        if(eta >= 18)
        {
            //Un'istruzione è una singola riga di codice inserita
            //in questo caso come conseguenza alla veridicità della condizione dell'if.
            ris += "Maggiorenne";      
            ris += "\nSei grande";
            //Un BLOCCO DI CODICE invece è un insieme di istruzioni inserite all'interno di parentesi GRAFFE.
            //Se la condizione dell'if alla riga 11 si verifica, ovvero se il valore di eta è maggiore o uguale a 18
            //il programma prende in considerazione TUTTO il blocco di codice inserito tra le {}.
            //Il blocco di codice è delimitato dalle {} quindi inizia alla riga 12 e termina alla 21
        }
        
        if(eta >= 0 && eta < 18)
            ris += "Minorenne";
            //La riga 24 è un esempio di ISTRUZIONE SINGOLA legata all'if alla riga 23.

        //Domanda: scrivete la risposta in chat quando ve lo dico io:
        //Cosa verrà stampato alla fine del programma se l'utente digita 11?
        //a - Maggiorenne, Sei grande e Minorenne
        //b - Minorenne
        //c - Minorenne, Sei grande
        //d - Sei grande, minorenne

        System.out.println(ris);
        tastiera.close();
    }
}