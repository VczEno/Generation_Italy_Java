import java.util.Scanner;
public class doWhile_01
{
    public static void main(String[] args)
    {
        //Abbiamo visto il primo esempio di ITERAZIONE, il ciclo while.
        //Il ciclo while cicla da zero a infinite volte.
        //Il suo funzionamento si sviluppa in questo modo:
        //1 - Controlla la condizione di iterazione.
        //2 - Se è vera il ciclo parte ed esegue il blocco di codice tra le {}
        //3 - Alla fine del ciclo, il programma controlla nuovamente la condizione.
        //      Se è ancora vera ripete, altrimenti si ferma.
        Scanner tastiera = new Scanner(System.in);
        String ris = "";

        //Il secondo tipo di ITERAZIONE si chiama DO WHILE.
        do
        {
            System.out.println("Vuoi ripetere il ciclo?");
            ris = tastiera.nextLine();
            System.out.println(ris);
        }
        while(!ris.equals("no"));

        System.out.println("Questa stringa viene stampata quando finisce il ciclo.");
        //Il ciclo DO WHILE cicla da 1 a infinite volte.
        //La condizione di iterazione viene controllata dopo che è stato effettuato almeno un ciclo.
        //Il funzionamento è il seguente:
        //1 - Do -> il programma esegue le istruzioni all'interno del blocco di codice
        //      definito dalla keyword DO
        //2 - While -> il programma verifica la condizione di iterazione.
        //      Se alla fine del primo ciclo è ancora vera, il ciclo si ripete.
        //      Se è falsa, il ciclo non si ripete MA ALMENO UNA VOLTA E' STATO ESEGUITO.

        //Il ciclo while viene utilizzato quando SAPPIAMO BENE O MALE IL NUMERO DI VOLTE
        //IN CUI DOVRA' ESSERE RIPETUTO UN BLOCCO DI CODICE.
        //Il ciclo do while viene utilizzato quando NON SAPPIAMO IL NUMERO DI VOLTE IN CUI
        //UN CODICE DOVRA' ESSERE RIPETUTO e quindi il primo giro lo diamo gratis.
        int max = 0;
        int n;
        do
        {
            System.out.println("Vuoi una carta?");
            ris = tastiera.nextLine();
            if(!ris.equals("no"))
            {
                    System.out.println("Il mazziere estrae una carta a caso...");
                    n = Integer.parseInt(tastiera.nextLine());
                    max += n;
            }
            System.out.println("Max: " + max);
        }
        while(max < 21 && !ris.equals("no"));
        //Cicla finché max è minore di 21 e il valore di ris è diverso da no
        System.out.println("Hai totalizzato: " + max);
        tastiera.close();
    }    
}