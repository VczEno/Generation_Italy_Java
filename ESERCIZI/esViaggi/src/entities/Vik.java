package entities;

import java.util.*;
import java.io.*;

public class Vik {
    // All'interno di questa classe potremo mettere un sacco di roba bella che
    // potremo evitare di riscrivere mille volte!
    public static double MIN = 0;
    public static double MAX = 100;

    /**
     * Il metodo checkString() verifica che la String passata come parametro
     * contenga almeno un carattere.
     * 
     * @param parametro
     * @return boolean
     */
    public static boolean checkString(String parametro) {
        return parametro.length() > MIN ? true : false;
    }

    /**
     * Il metodo riceve un parametro di tipo String e controlla che sia presente
     * all'interno di un testo.
     * Se il parametro è presente nel testo il metodo torna true, altrimenti false.
     * 
     * @param cerca
     * @param testo
     * @return boolean
     */
    public static boolean checkStringIndexOf(String valoreDaCercare, String testo) {
        // indexOf() può tornare solo due valori: -1 se la ricerca non ha prodotto
        // risultati.
        // Un numero maggiore o uguale a zero (corrispondente alla posizione di cerca
        // nel testo) nel caso in
        // cui invece ha trovato qualcosa. OCCHIO perché è case sensitive.
        valoreDaCercare = valoreDaCercare.toLowerCase();
        testo = testo.toLowerCase();
        // Per sicurezza, il controllo su cerca e testo viene fatto rendendo i due
        // parametri tutti in minuscolo.
        return testo.indexOf(valoreDaCercare) >= 0 ? true : false;
    }

    /**
     * Il metodo riceve un valore String e un vettore contenente String. Il metodo
     * verifica che il valore
     * corrisponda a uno di quelli presenti nel vettore. Se trova una corrispondenza
     * ritorna true, altrimenti false.
     * 
     * @param valore          String da cercare
     * @param valoriAccettati vettore nel quale compiere la ricerca
     * @return boolean
     */
    public static boolean StringIsPresente(String valore, String[] valoriAccettati) {
        boolean ris = false;
        for (String s : valoriAccettati) {
            if (s.equalsIgnoreCase(valore))
                ris = true;
        }
        return ris;
    }

    // POLIMORFISMO DEI METODI. StringIsPresente() è un metodo che:
    // SI PRESENTA PIU' VOLTE CON LO STESSO NOME
    // SI PRESENTA PIU' VOLTE ALL'INTERNO DELLA STESSA CLASSE
    // SI PRESENTA TUTTAVIA CON UNA FIRMA DIVERSA
    // Il polimorfismo è uno dei tre principi della programmazione a oggetti e
    // permette di creare elementi di "forma" diversa.
    // In questo caso specifico si tratta di polimorfismo dei metodi di tipo
    // OVERLOAD.
    // Un caso simile si è visto con i costruttori. In quella situazione si parla di
    // POLIMORFISMO DEL COSTRUTTORE
    // che permette la creazione di oggetti di una stessa classe ma secondo metodi
    // diversi.

    /**
     * Il metodo StringIsPresente() riceve un valore di tipo String e un percorso di
     * file. Attraverso componiArrayDaFile()
     * il metodo scorre il file e crea un ArrayList<String> che successivamente
     * viene ciclato per controllare che il valore
     * passato come parametro sia presente. Se viene trovato ritorna true,
     * altrimenti false.
     * 
     * @param valore
     * @param percorsoFile
     * @return boolean
     * @throws FileNotFoundException
     */
    public static boolean StringIsPresente(String valore, String percorsoFile) throws FileNotFoundException {
        boolean ris = false;
        // Prima di tutto creo una lista di valori accettati leggendo un file esterno
        // e sfruttando il metodo static componiArrayDaFile()
        ArrayList<String> valoriAccettati = componiArrayDaFile(percorsoFile);
        // Ora ciclo tutto valoriAccettati per controllare che il valore passato come
        // parametro sia presente.
        for (String s : valoriAccettati) {
            if (s.equalsIgnoreCase(valore))
                ris = true;
        }
        return ris;
    }

    /**
     * Il metodo isCompreso verifica che il primo numero passato come parametro sia
     * compreso
     * tra il valori MIN e MAX definiti nella classe. Restituisce un boolean.
     * 
     * @param double numero da verificare
     * @param double numero minimo
     * @param double numero massimo
     * @return boolean
     */
    public static boolean isCompreso(double numero) {
        return (numero >= MIN && numero <= MAX) ? true : false;
    }

    /**
     * Il metodo isCompreso verifica che il primo numero sia compreso tra il secondo
     * e il terzo.
     * Restituisce un boolean
     * 
     * @param numero
     * @param min
     * @param max
     * @return boolean
     */
    public static boolean isCompreso(double numero, double min, double max) {
        return (numero >= MIN && numero <= MAX) ? true : false;
    }

    /**
     * contaRighe() è un metodo che dato il percorso di un file lo scorre e
     * restituisce il numero
     * di righe presente al suo interno. Ritorna un intero. Se non ci sono righe,
     * ritorna 0.
     * 
     * @param percorsoFile
     * @return int
     * @throws FileNotFoundException
     */
    public static int contaRighe(String percorsoFile) throws FileNotFoundException {
        int ris = 0;
        Scanner file = new Scanner(new File(percorsoFile));
        while (file.hasNextLine()) {
            ris++;
            file.nextLine();
        }
        file.close();
        return ris;
    }

    /**
     * componiArrayDaFile() è un metodo che legge un file contenente String e
     * inserisce ogni riga
     * all'interno di un ArrayList di String che poi viene restituito. Se il file
     * contiene righe, l'AL
     * conterrà le String del file. Altrimenti sarà vuoto.
     * 
     * @param percorsoFile
     * @return ArrayList<String>
     * @throws FileNotFoundException
     */
    public static ArrayList<String> componiArrayDaFile(String percorsoFile) throws FileNotFoundException {
        ArrayList<String> ris = new ArrayList<String>();
        Scanner file = new Scanner(new File(percorsoFile));
        while (file.hasNextLine()) {
            ris.add(file.nextLine());
        }
        file.close();
        return ris;
    }

    /**
     * Il metodo stampaArrayString() riceve un percorso di file.
     * Passa il percorso al metodo componiArrayDaFile() per ricevere un
     * ArrayList<String> che poi viene
     * ciclato e il contenuto viene ritornato sotto forma di String
     * 
     * @param percorsoFile
     * @return String
     * @throws FileNotFoundException
     */
    public static String stampaArrayString(String percorsoFile) throws FileNotFoundException {
        String ris = "";
        ArrayList<String> elenco = componiArrayDaFile(percorsoFile);
        for (String s : elenco)
            ris += s + "\n";
        return ris;
    }

    /**
     * Il metodo check() verifica che il valore1 passato come parametro sia presente
     * all'interno di un file.
     * Se viene trovato il metodo verifica che il valore2 passato come parametro sia
     * presente e associato
     * al valore1. Se entrambi sono presenti e associati tra loro il metodo ritorna
     * true, altrimenti false.
     * Utilizzo: controllo di username e password. Controllo su autore e titolo.
     * Controllo su nome e cognome etc...
     * 
     * @param percorsoFile
     * @param separatore
     * @param valore1
     * @param valore2
     * @return boolean
     * @throws FileNotFoundException
     */
    public static boolean check(String percorsoFile, String separatore, String valore1, String valore2)
            throws FileNotFoundException {
        boolean ris = false;
        // La dimensione dei vettori è pari al numero delle righe del file che leggerò
        int dimensioneListe = contaRighe(percorsoFile);
        // Creo due vettori
        String[] lista1 = new String[dimensioneListe];
        String[] lista2 = new String[dimensioneListe];
        Scanner file = new Scanner(new File(percorsoFile));
        String[] riga;
        for (int i = 0; i < dimensioneListe; i++) {
            riga = file.nextLine().split(separatore);
            lista1[i] = riga[0];
            lista2[i] = riga[1];
        }
        file.close();
        for (int i = 0; i < lista1.length; i++) {
            if (valore1.equals(lista1[i])) {
                if (valore2.equals(lista2[i]))
                    ris = true;
            }
        }
        return ris;
    }

    public static boolean STRINGFILECHECK(String input, String percorso) throws FileNotFoundException {

        boolean ris = false;

        Scanner file = new Scanner(new File(percorso));
        String riga = "";
        while (file.hasNextLine()) {
            if (input.equalsIgnoreCase(file.nextLine()))
                ris = true;
        }
        file.close();
        return ris;
    }
}