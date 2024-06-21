
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AvvioLetturaFile {
    public static void main(String[] args) throws FileNotFoundException {
        // per leggere il file venerdi.txt dobbiamo per prima cosa conoscere il suo
        // percorso
        // per sapere il percorso del file che voglio leggere devo fare:
        // tasto dx sul file -> "copy relative path" -> lo incollo salvandolo
        // all'interno di una stringa
        String percorso = "src\\res\\venerdi.txt";
        // relative path perchè il percorso è quello relativo (rispetto al progetto)

        // così come per leggere l'input da tastiera, allo stesso modo abbiamo bisogno
        // di una
        // variabile Scanner anche per la lettura da file:
        Scanner file = new Scanner(new File(percorso));
        // operazioni da effettuare senza farsi troppe domande:
        // 1 - impoorto la classe Scanner (già lo sapevamo)
        // 2 - importo la classe File (vedi in alto: 'import java.io.File;')
        // 3 - mi viene sottolineato in rosso tutto -> passo sopra col mouse -> quick
        // fix -> add throws declaration
        // a quel punto compariranno due cose:
        // - import java.io.FileNotFoundException; in alto
        // - throws FileNotFoundException di fianco alla scritta del main

        String riga = "";

        // per leggere il file ho bisogno di un ciclo while (per ora usiamo quello)
        // - la condizione file.hasNextLine() vuol dire letteralmente:
        // "finchè il file contiene una riga"
        // - il comando file.nextLine() va a prendersi la riga successiva (come per la
        // lettura da tastiera)
        while (file.hasNextLine()) {
            riga = file.nextLine();

            System.out.println(riga);

            // System.out.println(file.nextLine());
        }
        /*
         * osservazioni :
         * hasNextLine() valuta solamente se la riga esiste.
         * Per capire immaginiamoci di essere un cursore all'interno del file:
         * - al primo giro del while viene prima di tutto valutata la condizione
         * file.hasNextLine().
         * in questo caso dobbiamo immaginare di trovarci alla "riga 0" del file e
         * controllare l'esistenza della riga 1
         * se la riga 1 esiste allora entro nel while ma idealmente mi trovo ancora alla
         * riga 0
         * il comando effettivo con cui vado fisicamente a prendermi la riga successiva
         * è invece file.nextLine()
         * quindi quandom incontro il comando nextLine() mi sto andando a prendere la
         * riga 1
         * e sposto il cursore immaginario proprio sulla riga 1
         * - al secondo giro il cursore immaginario si trova alla riga 1
         * quindi hasNextLine() controlla l'esistenza della riga 2 ma senza spostare il
         * cursore immaginario
         * poi nextLine() va effettivamente a prendersi la riga 2 spostando il cursore
         * immaginario
         * - e così via per tutta la lunghezza del file
         * - mi trovo alla riga 25 del file con il cursore immaginario. cosa succede?
         * il booleano questa volta mi restituisce false e quindi non entro piu nel
         * while
         * 
         * RIASSUMENDO: ipotizzando di avere un file con 25 righe,
         * quante volte viene valutata la condizione file.hasNextLine()? 26 (25 volte
         * risulterà TRUE e 1 FALSE)
         * quante volte viene letta una riga tramite file.nextLine()? 25
         */
        file.close();

        // UNA VOLTA CHE HO LETTO TUTTO IL FILE lo chiudo.
        // se voglio ripescare le informazioni in esso contenute, dovrò andare a creare
        // un'altra variabile Scanner
        // file = new Scanner(new File(percorso)) -> in questo caso sovrascrivo la
        // variabile precedente
        // Scanner file2 = new Scanner(new File(percorso)) -> in questo creo
        // direttamente un'altra variabile

        String percorso2 = "src\\res\\prova.txt";
        file = new Scanner(new File(percorso2));
        String righe = "";

        // controllo se il file possiede la riga 1
        if (file.hasNextLine()) {
            righe = file.nextLine();
        }

        file.nextLine();
        // ATTENZIONE!!
        // questo comando qui sopra fa partire la lettura di una riga ma
        // siccome qull'informazione non la salvo da nesuna parte è persa.
        // salta quindi la riga 2, ovvero scacchi

        // a questo punto con il cursore immaginario mi trovoi già alla riga 2
        // quindi attraverso la condizione andrò a controllare l'esistenza della riga 3
        // questo perchè la prima riga è già stata letta nell'if precedente
        while (file.hasNextLine()) {
            riga = file.nextLine();
            righe += "\n" + riga;
        }

        file.close();

        System.out.println(righe);
        System.out.println(riga);

    }

    // ATTENZIONE il carattere backslash \ è un carattere di escape:
    // quando il compilatore lo incontra all'interno di una stringa si aspetta
    // di ricevere un comando speciale.
    // quindi possiamo inserirlo all'interno di una stringa per intendere proprio \
    // se voglio utilizzare proprio \ allora dovro' digitare il doppio backslash \\
    // oppure lo slash /

    // se non viene importata la classe automaticamente e neanche mi compare come
    // operazione tra le quick fix:
    // premere shift+alt+o -> comando che importa automaticamente tutte le classi
    // mancanti in un file
}
