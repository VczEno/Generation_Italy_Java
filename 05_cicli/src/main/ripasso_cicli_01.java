public class ripasso_cicli_01
{
    public static void main(String[] args)
    {
        //Crea un vettore di 100 numeri
        double[] numeri = new double[10];
        System.out.println("Dimensione del vettore numeri -> numeri.length: " + numeri.length);
        System.out.println("Vettore -> numeri: " + numeri);
        System.out.println("Contenuto -> numeri[9]: " + numeri[9]);
        //Riempi ogni posizione con un numero compreso tra 0 e 9
        //Il valore iniziale di i è 0
        //Il valore finale di i sarà numeri.length ovvero 9
        //Il valore di i verrà incrementato di 1 ad ogni ciclo
        for(int i = 0; i < numeri.length; i++)
        {
            //numeri è il VETTORE
            //numeri[i] è la cella del vettore in posizione iesima
            //numeri[i] = i -> significa riempi la cella in posizione iesima del vettore numeri con il valore i
            //Al primo ciclo, numeri[i] = i; diventa numeri[0] = 0;
            //Al secondo ciclo, numeri[i] = i; diventa numeri[1] = 1;
            //Etc...
            numeri[i] = (i);
        }
        //Stampa ogni numero
        String ris = "ELENCO DEI NUMERI: ";
        //Tipologia: stampa non condizionata
        //Serve la posizione: no
        //Ciclo migliore: FOR EACH
        //Per ogni variabile di tipo double all'interno dell'insieme numeri
        //esegui il blocco di codice.
        for(double d : numeri)
        {
            ris += d + " ";
        }
        System.out.println(ris);

        ris = "RIGA 36: I = 0; I < NUMERI.LENGTH; I++ -> ";
        for(int i = 0; i < numeri.length; i++)
        {
            ris += numeri[i] + " ";
        }
        System.out.println(ris);

        ris = "RIGA 42: I = 1; I < NUMERI.LENGTH; I++ -> ";
        for(int i = 1; i < numeri.length; i++)
        {
            ris += numeri[i] + " ";
        }
        System.out.println(ris);

        ris = "RIGA 50: I = 8; I < NUMERI.LENGTH; I++ -> ";
        for(int i = 8; i < numeri.length; i++)
        {
            ris += numeri[i] + " ";
        }
        System.out.println(ris);

        //ris = "RIGA 57: I = 0; I <= NUMERI.LENGTH; I++ -> ";
        //for(int i = 0; i <= numeri.length; i++)
        //{
        //    System.out.println(i);
        //    ris += numeri[i] + " ";
        //}
        //System.out.println(ris);

        //Stampa la media dei numeri
        //Tipologia: media non condizionata
        //Serve la posizione: no
        //Ciclo migliore: FOR EACH
        ris = "MEDIA: ";
        double somma = 0;
        for(double d : numeri)
        {
            somma += d;
        }
        System.out.println("Somma: " + somma);
        ris += (somma / numeri.length);
        System.out.println(ris);

        //Stampa la media dei numeri pari
        //Tipologia: media condizionata - I NUMERI DEVONO ESSERE PARI
        //Serve la posizione: no - perché sono i numeri a dover essere pari, non gli indici
        //Ciclo migliore: FOR EACH
        ris = "MEDIA NUMERI PARI: ";
        somma = 0;
        int contatore = 0;
        for(double d : numeri)
        {
            if(d % 2 == 0)
            {
                System.out.println("Numero pari: " + d);
                somma += d;
                contatore++;
            }
        }
        System.out.println("Somma: " + somma + "\nContatore: " + contatore);
        ris += (somma / contatore);
        System.out.println(ris);

        //Stampa la media dei numeri in posizione pari
        //Tipologia: media condizionata - STAMPO SOLO I NUMERI IN POSIZIONE PARI
        //Serve la posizione: SI - Stampo i numeri con indice pari
        //Ciclo migliore: FOR
        ris = "MEDIA NUMERI IN POSIZIONE PARI: ";
        somma = 0;
        contatore = 0;
        for(int i = 0; i < numeri.length; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("i: " + i + " numero in posizione [" + i + "]: " + numeri[i]);
                somma += numeri[i];
                contatore++;
            }
        }
        System.out.println("Somma: " + somma + "\nContatore: " + contatore);
        ris += (somma / contatore);
        System.out.println(ris);
    }   
}