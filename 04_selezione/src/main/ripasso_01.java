import java.util.Scanner;
public class ripasso_01
{
    public static void main(String[] args)
    {
        String a = "CIAO";
        String b = "ciao";
        String ris = "";
        //Esempio 1 - EQUALS - verifica struttura e contenuto
        ris = "Riga 10: " + a.equals(b);
        System.out.println(ris);
        //Esempio 2 - EQUALSIGNORECASE - verifica il contenuto e non la struttura
        //              N.B.: con contenuto si intende l'intero testo che deve corrispondere alla
        //              lettera (spazi compresi).
        ris = "Riga 15: " + a.equalsIgnoreCase(b);
        System.out.println(ris);
        //Esempio 3 - TOLOWERCASE() - trasforma il testo mettendolo in minuscolo
        System.out.println("Riga 18: " + a.toLowerCase());
        System.out.println("Riga 19: " + a);
        a = a.toLowerCase();
        System.out.println("Riga 21: " + a);
        //Nota bene: toLowerCase() non modifica il valore originale della String ma semplicemente
        //lo mostra in minuscolo. Per poterlo modificare è necessario riassegnare il valore
        //della variabile in questione (sovrascrivendo il precedente)
        //o comiunque assegnare quel valore a una nuova variabile.
        //Esempio 4 - TOUPPERCASE() - trasforma il testo mettendolo in maiuscolo. Valgono
        //le stesse regole di toLowerCase()
        System.out.println("Riga 28: " + a.toUpperCase());
        
        //Esempio pratico di sfruttamento toLowerCase() o toUpperCase()
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci una località per conoscere il prezzo del biglietto.");
        String localita = tastiera.nextLine();
        double ticket = 0;

        if(localita.equalsIgnoreCase("londra"))
            ticket = 100;
        System.out.println("Riga 38: " + ticket);    
        if(localita.toLowerCase().equals("londra"))
            ticket = 200;
        System.out.println("Riga 41: " + ticket);

        System.out.println("Inserisci il tuo username.");
        String user = tastiera.nextLine();
        //Per decisione aziendale tutti gli username sono inseriti nel database in maiuscolo
        //quindi la comparazione tra le stringhe deve tenerne conto.
        //Nota bene: gli impiegati di solito se ne dimenticano e non riescono ad effettuare
        //l'accesso.
        if(user.toUpperCase().equals("WOLVERINE"))
            ris = "User: " + user + "\nBenvenuto Logan";
        else if(user.toUpperCase().equals("IRONMAN"))
            ris = "User: " + user + "\nBenvenuto Mr. Stark";
        else if(user.toUpperCase().equals("HULK"))
            ris = "User: " + user + "\nBenvenuto Dott. Banner";
        else
            ris = "Accesso negato!";
        System.out.println(ris);
        tastiera.close();
    }
}