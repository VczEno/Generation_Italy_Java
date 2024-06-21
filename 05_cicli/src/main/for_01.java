public class for_01
{
    public static void main(String[] args)
    {
        int[] numeri = new int[5];
        numeri[0] = 1;
        numeri[1] = 2;
        numeri[2] = 3;
        numeri[3] = 4;
        numeri[4] = 5;

        String ris = "ELENCO DEI NUMERI COL CICLO WHILE: ";
        //Se volessi stampare tutti i numeri del vettore con il ciclo while
        //dovrei impostare il codice in questo modo.
        //Avrei bisogno di un indice che (in questo caso) parte da zero
        int indice = 0;
        //Dovrei impostare la condizione del while dicendo di ripetere l'operazione
        //finché il valore indice è minore della dimensione del vettore.
        //La dimensione del vettore si ottiene tramite .length
        while(indice < numeri.length)
        {
            //Concateno al valore di ris il valore associato al vettore in posizione
            //indice. Indice al primo ciclo vale zero quindi
            //numeri[indice] al primo giro vale 1.
            //numeri[indice] al secondo giro vale 2.
            //E via dicendo.
            ris += numeri[indice] + " ";
            //Prima di uscire dal ciclo while incremento il valore dell'indice
            //evitando così il loop infinito.
            indice++;
        }
        System.out.println(ris);

        //Proviamo a fare la stessa cosa con il ciclo for.
        //Un ciclo for è composto da tre elementi:
        //INDICE -> i che normalmente viene inizializzato col valore 0
        //CONDIZIONE DI RIPETIZIONE -> i < numeri.length
        //                              che corrisponde a indice < numeri.length
        //                              nell'esempio del while
        //INCREMENTO -> i++ che corrisponde a indice++
        //Quali sono i vantaggi evidenti?
        //L'indice è associato al singolo ciclo for quindi non devo istanziare
        //una variabile e preoccuparmi di reinizzializzarla a zero ogni volta.
        //L'incremento è inserito nella fase di dichiaraizone del ciclo for
        //quindi è anch'esso associato al ciclo e pertanto personalizzabile.
        //In sintesi il ciclo for è una logica conseguenza del ciclo while che
        //ne ottimizza alcuni aspetti.
        //Quando si usa il ciclo FOR?
        //Quando ho bisogno di conoscere o fare delle operazioni sulle posizioni
        //e sugli indici degli elementi all'interno del vettore.
        //Se ad esempio volessi stampare solo i numeri in posizione pari.
        //Se ad esempio volessi stampare solo una parte del contenuto
        //  come le posizioni dalla 2 alla 4.
        //Insomma ogni volta in cui devo recuperare specifici valori associati
        //alle posizioni.
        //In questo caso stampo tutto quindi potrei anche non ricorrere al for.
        //Ma la usiamo comunque per comparare for al while e notare che sono
        //bene o male simili come elementi costituenti.
        ris = "ELENCO DEI NUMERI COL CICLO FOR: ";
        for(int i = 0; i < numeri.length; i++)
        {
            //Alla variabile ris viene concatenato il valore di numeri[i]
            //ovvero il valore associato alla posizione "i" (iesima) del vettore.
            //E' la trasposizione del for della dicitura che abbiamo visto prima:
            //ris += numeri[indice] + " ";
            ris += numeri[i] + " ";
            //Non serve incrementare il valore di i perché viene fatto in automatico.
        }
        System.out.println(ris);

        //Vediamo un esempio concreto dell'utilizzo del ciclo for che con il while
        //risulterebbe più macchinoso. Stampiamo solo i valori assegnati a
        //un indice pari ovvero solo numeri[0], numeri[2] e numeri[4]
        ris = "ELENCO DEI NUMERI IN POSIZIONE PARI: ";
        for(int i = 0; i < numeri.length; i++)
        {
            //Se il valore dell'indice diviso 2 da resto zero
            //concateniamo il valore assegnato a quell'indice a ris.
            if(i % 2 == 0)
                ris += numeri[i] + "";
        }
        System.out.println(ris);
        //Nota bene: il valore dell'indice è diverso dal valore associato all'indice.
        //Nell'ultimo esempio controlliamo che il valore dell'indice ovvero la posizione
        //sia pari. Infatti se badate stampiamo solo numeri dispari perché alla posizione
        //0, 2 e 4 ci sono rispettivamente 1,3 e 5.
    }   
}