import java.util.Scanner;
public class switch_01
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        String nomeCanale;
        String programma;
        System.out.println("Quale canale vuoi vedere?");
        int numeroCanale = Integer.parseInt(tastiera.nextLine());
        //All'interno dello switch non è possibile fare calcoli perché ciò che viene inserito
        //nelle parentesi tonde DEVE essere un valore che sia possibile da comparare con quelli
        //dei case. In questo caso numeroCanale corrisponderà a 1, 2, 3 oppure tutti gli altri
        //numeri. Nei primi tre casi finirà nel reciproco case. In tutti gli altri sarà il default
        //a rispondere.
        //Ogni case è un programma stand alone. Se l'utente ad esempio finisce nel case 1
        //tutti gli altri, compreso il default, non vengono considerati.
        //Una volta uscito il case 1 il programma prosegue con la riga 46
        switch(numeroCanale)
        {
            case 1    : //Qui è possibile mettere le graffe ma di base ogni case è a sé stante.
                nomeCanale  = "Rai 1";
                programma = "Sanremo";
            break;
            case 2    :
                //Questo case viene considerato SOLO se l'utente ha digitato 2 alla riga 10.
                //In questo caso, case 1, case 2 e default non vengono considerati.
                //Una volta terminate le istruzioni contenute nel case 2 il programma esce dallo
                //switch e procede.
                nomeCanale  = "Rai 2";
                programma = "NCIS";
            break;
            case 3    :
                nomeCanale  = "Rai 3";
                programma = "Report";
            break;
            default   :
                //Siccome nel default inizializziamo le variabili nomeCanale e programma
                //il codice non da errore durante la stampa successiva.
                //In pratica ragiona: nomeCanale e programma dipendono dai case.
                //Se nessun case viene considerato, le due variabili prendono il valore di default.
                nomeCanale  = "Altro";
                programma = "Programma non disponibile";
            break;
        }
        System.out.println( "Nome del canale: "     +   nomeCanale  +   "\n"  +
                            "Nome del programma: "  +   programma   );
        tastiera.close();
    }
}