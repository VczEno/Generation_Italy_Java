package es;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Creare un ArrayList di String chiamato nomi
//Creare un ArrayList di int chiamato classi
//Leggere da un file i seguenti dati
//Nome1,4
//Nome2,4
//Nome3,2
//Nome4,1
//Nome5,1
//Nome6,2
//Fare in modo che nell'ArrayList nomi finiscano solo Nome1,Nome2,Nome3,Nome4,Nome5,Nome6
//Fare in modo che nell'ArrayList classi finiscano solo 4,4,2,1,1,2
//Stampare:
//Numero totale dei nomi
//Elenco dei nomi con a fianco il valore della classe: esempio Nome1 - 4
//Elenco dei nomi della classe 2
//Elenco dei nomi che hanno come valore di classe un numero dispari
//Elenco dei nomi in posizione pari
//Il conteggio dei nomi che ai quali corrisponde il valore massimo della classe

public class es02 {

    public static void main(String[] args) throws FileNotFoundException {

        // definizione degli arraylist
        ArrayList<String> nomi = new ArrayList<>();

        ArrayList<Integer> classi = new ArrayList<>();

        // variabile scanner per leggere il file
        Scanner file = new Scanner(new File("08_arrayList\\src\\res\\nomi.txt"));

        // array di appoggio dove splitto il contenuto della singola riga del file
        String[] rowElement;

        // ciclo il file fino all'ultima riga
        while (file.hasNextLine()) {
            // splitto la riga nell'array di appoggio
            rowElement = file.nextLine().split(",");
            // aggiungo la stringa all'array nomi
            nomi.add(rowElement[0]);
            // aggiungo la stranga parsata ad int all'array classi
            classi.add(Integer.parseInt(rowElement[1]));
        }
        file.close();

        // definisco le variabili necessarie
        int totStudents = nomi.size();
        String nameAndClass = "Elenco dei nomi e rispettive classi: \n";
        String class2Students = "Studenti della classe 2: \n";
        String oddClassStudents = "Studenti delle classi dispare: \n";
        String evenNames = "Studenti in posizione pari: \n";
        int highestClassStudentsNumber = 0;
        int highestClass = 0;

        // ciclo l'array classi per trovare il valore più grande
        for (int i = 0; i < classi.size(); i++)
            highestClass = classi.get(i) > highestClass ? classi.get(i) : highestClass;

        // ciclo l'array nomi (la lungezza di nomi e classi è uguale, posso sfruttare lo
        // stesso indice)
        for (int i = 0; i < nomi.size(); i++) {
            // concateno nome e classe alla lista di tutti gli studenti
            nameAndClass += nomi.get(i) + " - " + classi.get(i) + "\n";
            // concateno i nomi degli studenti se appartengono alla classe 2
            if (classi.get(i) == 2)
                class2Students += nomi.get(i) + "\n";
            // concateno i nomi degli studenti se appartengono a classi dispare
            if (classi.get(i) % 2 != 0)
                oddClassStudents += nomi.get(i) + "\n";
            // concateno i nomi degli studenti che hanno indice pari nell'array
            if (i % 2 == 0)
                evenNames += nomi.get(i) + "\n";
            // incremento il contatore se gli studenti appartengono alla classe più "alta"
            // trovata in precendenza
            if (classi.get(i) == highestClass)
                highestClassStudentsNumber++;

        }

        System.out.println("Il numero totale degli studenti è pari a: " + totStudents + "\n" + nameAndClass
                + class2Students + oddClassStudents + evenNames
                + "Il numeri di studenti della classe " + highestClass + " è pari a: " + highestClassStudentsNumber);

    }

}
