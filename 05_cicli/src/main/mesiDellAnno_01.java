import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class mesiDellAnno_01
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //1 - Leggere il file mesi dell'anno.txt
        Scanner file = new Scanner(new File("Mesi dell'anno_blockNotes.txt"));
        //Devo leggere la prima riga del file. Non mi interessa il numero di righe.
        //So che nella prima riga ci sono dei valori separati dal ;
        //Non so quanti sono ma so che ci sono.
        //2 - Voglio creare un vettore contenente i mesi dell'anno
        //Leggi la riga del file
        String rigaFile = file.nextLine();
        //Controlli se esiste qualcosa nella riga del file
        //rigaFile.length() > 0) -> se la lunghezza della riga del file è maggiore di 1
        //ovvero se c'è qualcosa, almeno un carattere, nella riga che stiamo leggendo.
        if(rigaFile.length() > 0 && !rigaFile.equals("ï»¿"))
        {
            String ris = "";
            String[] riga = rigaFile.split(";");
            file.close();
            //Gennaio;Febbraio;Marzo;Aprile;Maggio;Giugno;Luglio;Agosto;Settembre;Ottobre;Novembre;Dicembre
            //riga[0] = "ï»¿Gennaio";
            //riga[1] = "Febbraio";
            //riga[2] = "Marzo";
            //....
            //Notiamo che il valore del mese a riga[0] è "ï»¿Gennaio" mentre dovrebbe essere "Gennaio".
            //Dobbiamo sanificare il dato modificando il valore a riga[0].
            //Creo una variabile d'appoggio che corrisponde ai tre caratteri che noto essere extra rispetto al valore
            //che mi interessa: ï»¿
            String problemi = riga[0].substring(0,3);
            //Se all'interno della String riga[0] trovi il valore di problemi "ï»¿"
            //Sanifica la String
            System.out.println("RIGA 36 - Riga[0]: " + riga[0]);
            if(riga[0].indexOf(problemi) >= 0)
                riga[0] = riga[0].substring(3);
            System.out.println("RIGA 39 - Riga[0]: " + riga[0]);
            
            //3 - Voglio stampare i mesi dell'anno con le posizioni
            //Tipologia: stampa non condizionata
            //Ho bisogno dell'indice? SI
            //Ciclo migliore: FOR
            ris += "STAMPA DEI MESI CON LE POSIZIONI:\n";
            for(int i = 0; i < riga.length; i++)
            {
                ris += i + " - " + riga[i] + "\n";
            }
            System.out.println(ris);

            //4 - Voglio stampare i mesi dell'anno
            //Tipologia: stampa non condizionata
            //Ho bisogno dell'indice? NO
            //Ciclo migliore: FOR EACH
            ris = "MESI DELL'ANNO SENZA POSIZIONI\n";
            for(String s : riga)
            {
                ris += s + "\n";
            }
            System.out.println(ris);

            //5 - Voglio stampare i primi 6 mesi dell'anno
            //Tipologia: stampa condizionata
            //Ho bisogno dell'indice? SI
            //Ciclo migliore: FOR
            ris = "PRIMI SEI MESI DELL'ANNO METODO 1\n";
            for(int i = 0; i < riga.length; i++)
            {
                if(i >= 0 && i <= 5)
                    ris += riga[i] + "\n";
            }
            System.out.println(ris);
            //DIFFERENZE TRA METODO 1 E METODO 2
            //METODO 1: Cicla l'intero vettore e considera solo le prime 6 posizioni.
            //METODO 2: Non cicla il vettore ma estrae dal vettore SOLO i valori in cui i è compreso tra 0 e 5
            ris = "PRIMI SEI MESI DELL'ANNO: METODO 2\n";
            for(int i = 0; i < 6; i++)
            {
                ris += riga[i] + "\n";
            }
            System.out.println(ris);

            //6 - Voglio stampare Giugno, Luglio e Agosto
            //Tipologia: stampa condizionata
            //Ho bisogno dell'indice? NO
            //Ciclo migliore: FOR EACH
            ris = "STAMPA DEI MESI DI GIUGNO, LUGLIO E AGOSTO\n";
            for(String s : riga)
            {
                if( s.equalsIgnoreCase("giugno") ||
                    s.equalsIgnoreCase("luglio") || 
                    s.equalsIgnoreCase("agosto"))
                    {
                        ris += s + "\n";
                    }
            }
            System.out.println(ris);

            //7 - Voglio stampare il primo e l'ultimo mese dell'elenco
            //Tipologia: stampa non condizionata
            //Ho bisogno dell'indice? SI
            //Ciclo migliore: NESSUNO
            ris = "STAMPA DEL PRIMO E DELL'ULTIMO MESE DELL'ELENCO: METODO 1\n";
            ris += "Primo mese: " + riga[0] + "\nUltimo mese: " + riga[riga.length - 1];
            System.out.println(ris);

            //Tipologia: stampa condizionata
            //Ho bisogno dell'indice? SI
            //Ciclo migliore: FOR
            ris = "STAMPA DEL PRIMO E DELL'ULTIMO MESE DELL'ELENCO: METODO 2\n";
            for(int i = 0; i < riga.length; i++)
            {
                //Se il valore di i è uguale a zero, significa che è il primo elemento dell'elenco
                //e lo concateno a ris.
                if(i == 0)
                    ris += "Primo mese: " + riga[i] + "\n";
                //Se il valore di i è uguale alla dimensione del vettore - 1 significa che è l'ultimo elemento
                //e lo concateno a ris.
                if(i == (riga.length - 1))
                    ris += "Ultimo mese: " + riga[i] + "\n";
            }
            System.out.println(ris);
        } 
        else
            System.out.println("Il file è vuoto.");
    }   
}