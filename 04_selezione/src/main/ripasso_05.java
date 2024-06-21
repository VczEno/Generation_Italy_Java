import java.util.Scanner;
public class ripasso_05
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        boolean verifica;
        String titoliDisponibili;
        String ris = "";
        String stampa   =   "Generi disponibili"        +
                            "\n1 - Fantascienza"        +
                            "\n2 - Fantasy"             +
                            "\n3 - Romanzo"             ;
        System.out.println(stampa);
        String scelta = tastiera.nextLine();
        //Chiedo all'utente un genere tra quelli proposti per restituire una lista
        //di titoli disponibili per quel genere.
        //Nel caso in cui il genere non sia tra quelli proposti facciamo in modo che
        //l'utente abbia un feedback definito dal case di DEFAULT.
        //Ogni case valorizza la booleana verifica. Solo per il case di default essa sarà FALSE.
        switch(scelta)
        {
            case "1"    :
                //Questo codice viene eseguito se l'utente ha scritto "1"
                //Siamo nel case "1 - Fantascienza"
                verifica = true;
                titoliDisponibili = "Dune, Memorie di un cuoco d'astronave, Alien, Snow Crash";
            break;
            case "2"    :
                //Questo codice viene eseguito se l'utente ha scritto "2"
                //Siamo nel case "2 - Fantasy"
                verifica = true;
                titoliDisponibili = "Il signore degli anelli, Lo Hobbit, Il Silmarillion";
            break;
            case "3"    :
                //Questo codice viene eseguito se l'utente ha scritto "3"
                //Siamo nel case "3 - Romanzo"
                verifica = true;
                titoliDisponibili = "Viaggio al centro della Terra, Jurassik Park, La stanza delle meraviglie";
            break;
            default :
                //Questo codice viene eseguito SOLO quando l'utente scrive qualcosa che non 
                //rientra nei case precedenti.
                verifica = false;
                titoliDisponibili = "Valore non valido";
            break;
        }//Fine di switch
        
        //A questo punto del codice ci sono due opzioni:
        //verifica = TRUE
        //verifica = FALSE
        //Ottenuti i titoli controllo il valore della booleana.
        //Se è true significa che ci sono titoli per il genere scelto.
        //Se è false al contrario non ci sono titoli.
        if(verifica == false)
        {
            //Questo codice viene eseguito SOLO se l'utente è finito nel case di DEFAULT
            ris = titoliDisponibili;
        }
        else
        {
            //Questo codice viene eseguito se il valore di verifica è TRUE e quindi
            //l'utente ha selezionato 1, 2 oppure 3
            ris = "Per il genere scelto sono disponibili i seguenti titoli: " + titoliDisponibili;
        }
        System.out.println(ris);
        tastiera.close();
    }//Fine di main 
}//Fine del programma