import java.util.Scanner;
public class while_01
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        //Dichiaro e inizializzo una variabile numero a -1
        int numero = -1;
        //Dichiaro e inizializzo il valore di una variabile boolean.
        //Per poter gestire la condizione di iterazione del ciclo while è necessario
        //che la prima volta sia TRUE.
        //Valorizziamo la variabile ripeti attraverso un ternario 
        //in modo che sia true sulla base del valore di numero che abbiamo appena inserito.
        boolean ripeti = numero < 0 ? true : false;
        //IMPORTANTE
        //Il ciclo while cicla da 0 a infinite volte.
        //La condizione di iterazione deve essere VERA altrimenti il ciclo
        //non viene eseguito (per questo il discorso sulla booleana e il valore di numero a -1).
        //In questo caso ripeti è true quindi il ciclo viene eseguito.
        while(ripeti == true)
        {
            //Questo codice viene eseguito SOLO se il valore di ripeti è true.
            //Chiediamo all'utente un valore compreso tra 1 e 10
            System.out.println("Inserisci un numero compreso tra 1 e 10");
            numero = Integer.parseInt(tastiera.nextLine());
            //Una volta ottenuto il valore di numero gestiamo il valore di ripeti
            //sulla base di ciò che ha inserito l'utente.
            //Se numero è compreso nel range accettabile, ovvero tra 1 e 10
            //ripeti diventa FALSE e il ciclo non verrà ripetuto.
            //In caso contrario il valore di ripeti resterà TRUE.
            ripeti =    numero > 0 && numero <= 10
                        ?
                        false
                        :
                        true
                        ;
            //Alla fine del ciclo while il programma rilegge la riga 13 per verificare
            //la condizione di iterazione.
            //Se è vera, il ciclo viene ripetuto.
            //Se è falsa, il ciclo non viene eseguito e si passa oltre - riga 35
        }
        //Questo codice viene eseguito SOLO una volta terminato il ciclo while
        //ovvero SOLO quando la condizione di iterazione non è più valida.
        //Siccome il valore di numero viene inizializzato all'interno del ciclo e questo
        //potrebbe non venire mai eseguito è importante inizializzare numero prima
        //del ciclo while.
        System.out.println("Numero inserito: " + numero);
        tastiera.close();
    }   
}