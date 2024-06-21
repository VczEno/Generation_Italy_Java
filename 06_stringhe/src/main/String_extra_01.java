
public class String_extra_01 {
    public static void main(String[] args) {
        String ris;
        ris = "---------- LENGTH() ----------\n";
        // Le variabili String ammettono alcune funzioni implicite.
        // .length() permette ad esempio di conteggiare i caratteri all'interno
        String parola = "parola";
        ris += "Parola: " + parola + " - Lunghezza: " + parola.length() + "\n";
        System.out.println(ris);

        // .trim() permette di eliminare eventuali spazi prima e dopo la parola
        // Nota bene: il numero di caratteri prima di .trim() è 15.
        // Successivamente torna corretto perché vengono eliminati gli spazi vuoti.
        ris = "---------- TRIM() ----------\n";
        parola = "     parola    ";
        ris += "Parola: '" + parola + "' - Lunghezza: " + parola.length() + "\n";
        parola = parola.trim();
        ris += "Parola: " + parola + " - Trim: '" + parola + "'\n";
        ris += "Parola: " + parola + " - Lunghezza: " + parola.length() + "\n";
        System.out.println(ris);

        // .indexOf(VALORE) permette di trovare un carattere o una parte di testo
        // all'interno di una String.
        // .indexOf() restituisce solo due valori:
        // -1 se il valore richiesto non è presente all'interno del testo.
        // Un valore maggiore di -1 che corrisponde all'indice (posizione) in cui si
        // trova il testo richiesto.
        // Nota bene: il testo richiesto potrebbe essere presente più volte all'interno
        // dell'insieme. .indexOf() inizialmente
        // trova il primo.
        ris = "---------- INDEXOF() ----------";
        String testo = "Possono prendersi il tuo mondo, possono prendere il tuo cuore, " +
                "liberarti da tutto ciò che sai. Ma se è il tuo destino, allora " +
                "ogni passo avanti sarà sempre un passo più vicino a casa";
        ;
        String testoDaCercare = "cuore";
        int posizione = testo.indexOf(testoDaCercare);
        if (posizione >= 0)
            ris += "\nIl testo '" + testoDaCercare + "' è presente nel testo alla posizione " + posizione;
        else
            ris += "\nIl testo '" + testoDaCercare + "' non è presente nel testo.\nIl valore di posizione è "
                    + posizione;
        System.out.println(ris);
    }
}