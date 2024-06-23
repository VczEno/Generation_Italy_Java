package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class vettori_approfondimento_02 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("07_vettori\\src\\res\\elencoRegioneCittaDemo.txt"));
        int nRighe = 0;
        while (file.hasNextLine()) {
            nRighe++;
            file.nextLine();
        }
        System.out.println("Righe: " + nRighe);
        file.close();
        /*
         * Lombardia,Brescia,250000
         * Lombardia,Milano,600000
         * Veneto,Venezia,130000
         * Veneto,Padova,340000
         * Emilia Romagna,Rimini,100000
         * Emilia Romagna,Riccione,100001
         */
        String[] regioni = new String[nRighe];
        String[] citta = new String[nRighe];
        int[] demo = new int[nRighe];

        file = new Scanner(new File("07_vettori\\src\\res\\elencoRegioneCittaDemo.txt"));
        String[] rigaFile;
        int indice = 0;
        int righeErrore = 0;
        while (file.hasNextLine()) {
            righeErrore++;
            rigaFile = file.nextLine().split(",");
            // rigaFile[0] = "Lombardia"
            // rigaFile[1] = "Brescia"
            // rigaFile[2] = 250000
            if (rigaFile.length == 3) {
                regioni[indice] = rigaFile[0]; // rigaFile[0] = "Lombardia"
                citta[indice] = rigaFile[1]; // rigaFile[1] = "Brescia"
                demo[indice] = Integer.parseInt(rigaFile[2]); // rigaFile[2] = 250000
                indice++;
            } else {
                System.out.println("C'è un errore alla riga " + righeErrore);
                indice++;
            }
        }
        file.close();

        // Stampa le città della Lombardia
        String ris = "CITTA' LOMBARDE\n";
        for (int i = 0; i < regioni.length; i++) {
            // regioni[i] != null è un controllo necessario perchè se la riga non era valida
            // perché il numero di elementi
            // era diverso dai tre necessari, a quella posizione del vettore non è associato
            // alcun valore.
            // Quindi quando cerchiamo di leggere la regione restituisce "null" ovvero il
            // valore di default delle String.
            // Quindi oltre a controllare che la regione sia "lombardia" dobbiamo
            // controllare che non sia null.
            if (regioni[i] != null && regioni[i].equalsIgnoreCase("lombardia"))
                ris += i + " " + citta[i] + "\n";
        }
        System.out.println(ris);

        // Stampa le città chiedendo all'utente
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci una regione per avere la lista delle città");
        String regione = tastiera.nextLine();
        tastiera.close();
        ris = "";
        for (int i = 0; i < regioni.length; i++) {
            if (regioni[i] != null && regioni[i].equalsIgnoreCase(regione))
                ris += i + " " + citta[i] + "\n";
        }
        if (ris.equals(""))
            ris = "Non ci sono città per la regione " + regione;
        System.out.println(ris);
    }
}