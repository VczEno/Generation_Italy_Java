import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class letturaFile_Ripasso_01
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File("testiUnoSottoLAltro.txt"));
        //METODO 1
        String testo = "";
        while(file.hasNextLine())
        {
            testo += file.nextLine() + ",";
        }
        file.close();
        String[] righeTesto = testo.split(",");
        String ris = "";
        for(String s : righeTesto)
        {
            ris += s + " ";
        }
        System.out.println("METODO 1: " + ris);

        //METODO 2
        file = new Scanner(new File("testiUnoSottoLAltro.txt"));
        //Non sapendo il numero delle righe nel file devo scorrerlo la prima volta per contarle.
        //Una volta contate potrò dare una dimensione al vettore che conterrà i valori di ogni riga.
        int nRighe = 0;
        while(file.hasNextLine())
        {
            //Ad ogni ciclo incremento il valore di nRighe per contarle.
            nRighe++;
            //Se mi fermassi qui il ciclo non finirebbe mai perché leggerebbe sempre e solo la prima riga.
            //Quindi devo dirgli di leggere la riga successiva dopo aver contato.
            file.nextLine();
        }
        System.out.println("Numero righe: " + nRighe);
        //A questo punto non posso più tornare alla prima riga. Per farlo devo chiudere lo Scanner e riaprirlo.
        file.close();

        file = new Scanner(new File("testiUnoSottoLAltro.txt"));
        //Ora che sappiamo quante righe sono presenti nel file possiamo creare un vettore di quella dimensione.
        String[] righe = new String[nRighe];
        //Ora cicliamo il vettore e assegnamo ad OGNI POSIZIONE il valore corrispondente a quello presente nella riga
        //che di volta in volta verrà letta.
        for(int i = 0; i < righe.length; i++)
        {
            //Assegno alla posizione iesima del vettore righe il valore della riga del file
            righe[i] = file.nextLine();
        }
        file.close();
        //Ciclo il vettore per stampare i valori.
        ris = "METODO 2: ";
        for(String s : righe)
        {
            ris += s + " ";
        }
        System.out.println(ris);
    }
}