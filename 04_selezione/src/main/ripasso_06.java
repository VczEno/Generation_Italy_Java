import java.util.Scanner;
public class ripasso_06
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        boolean procedi;

        System.out.println("Inserire il livello di benzina");
        int livBenzina = Integer.parseInt(tastiera.nextLine());
        if(livBenzina >= 100)
            procedi = true; //VAI ALLA RIGA 16
        else
            procedi = false; //VAI ALLA RIGA 34

        if(procedi == true)
        {
            System.out.println("Inserire la pressione delle gomme");
            int presGomme = Integer.parseInt(tastiera.nextLine());
            if(presGomme < 6) //VAI ALLA RIGA 34
                procedi = false;
            else
            {
                System.out.println("Inserire la quantità di olio nel motore");
                int olio = Integer.parseInt(tastiera.nextLine());
                if(olio < 5)
                    procedi = false; //VAI ALLA RIGA 34
            }
        }

        String ris;
        if(procedi == true)
            ris = "Tutto a posto space cowboy";
        else
            ris = "Non puoi circolare con quella monnezza che chiami veicolo";

        System.out.println(ris);
        tastiera.close();
    }
}