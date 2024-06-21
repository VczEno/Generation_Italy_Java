package avvio;
// nella prima riga del file java si trova l'indirizzo del file contenuto nel progetto

// A PARTIRE DALLA CARTELLA src

// per ora non vogliamo sapere che cos'è una classe.
// ci basti sapere che il nome del file è qui di seguito(public class PrimoFile {})
public class PrimoFile {

    // questo e' un commento monoriga

    /*
     * questo invece e' un bellissimo commento multiriga
     * 
     * nei commenti posso scrivere quello che voglio senza che venga
     * letto in fase di avvio
     * 
     */

    /*
     * questo e' un altro commento multiriga per Francesca
     */

    // il seguente comando(public static void main(String[] args){}) mi consente
    // di rendere questa classe ESEGUIBILE
    // ovvero una classe di Avvio
    public static void main(String[] args) {

        // il comando System.out.println(); stampa in console quello che è contenuto tra
        // le parentesi tonde
        // siccome voglio stampare un testo lo dovrò inserire tra i doppi apici "".
        System.out.println("Qui dentro scrivo il teso da stampare");
        // i comandi vanno SEMPRE CONCLUSI CON IL PUNTO E VIRGOLA;
    }

}
// ricordiamoci di chiudere tutte le graffe che apriamo