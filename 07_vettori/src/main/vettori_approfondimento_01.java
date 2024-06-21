import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class vettori_approfondimento_01
{
       public static void main(String[] args) throws FileNotFoundException
       {
            String ris = "";
            String[] vParole = new String[2];
            vParole[0] = "parola1";
            vParole[1] = "parola2";
            ris = vParole[0] + " " + vParole[1];
            System.out.println("RIGA 10: " + ris);

            String[] vettore = {"parola1","parola2"};
            ris = vettore[0] + " " + vettore[1];
            System.out.println("RIGA 14: " + ris);

            String riga = "parola1,parola2";
            String[] vRiga = riga.split(",");
            ris = vRiga[0] + " " + vRiga[1];
            System.out.println("RIGA 19: " + ris);

           Scanner file = new Scanner(new File("parole.txt"));
           String testo = "";
           String[] vTesto;
           while(file.hasNextLine())
           {
                //Al primo giro leggo tutto il contenuto del file per metterlo nella variabile testo
                testo += file.nextLine();
           }
           file.close();
           System.out.println("Testo: " + testo);
           vTesto = testo.split(",");
           testo = "";
           for(int i = 0; i < vTesto.length; i++)
           {
                testo += i + " - " + vTesto[i] + "\n";
           }
           System.out.println(testo);
       }
}