package main;

import java.util.ArrayList;

public class AvvioListe {
    public static void main(String[] args) {
        // Arraylist
        // Usando i vettori ci siamo accorti che uno dei loro limiti e' la dimensione:
        // non puo' essere cambiata e questo spesso e' fastidioso.
        // .... quindi introduciamo adesso una versione un po piu' complessa dei vettori
        // ma di piu facile utilizzo(sono piu' versatili)

        // sintassi:
        // ArrayList<String> nomeLista = new ArrayList<>();
        // all'interno delle <> specifico il tipo di variabile che conterra' la mia
        // lista
        // le <> a destra dell'uguale posso essere lasciate vuote
        // ATTENZIONE: le liste NON posso contenere TIPI PRIMITIVI
        // (int,double,char,boolean,long,...)

        // CONFRONTO CON I VETTORI:
        // - entrambi accettano SOLO UN TIPO
        // - entrambi sono ORDINATI
        // - i vettori sono FINITI, le liste NO:
        // per gli arraylist non devo specificare una dimensione
        // perche' cambia ogni volta in base a quanti elementi contiene

        // vediamone un esempio...
        ArrayList<String> listaNomi = new ArrayList<>(); // non specifichiamo la dimnensione

        // vediamo alcune delle funzioni principali degli arraylist

        // .add() -->> per aggiungere un elemento alla lista
        listaNomi.add("Vincenzo");
        // anche in fase di inserimento di un elemento, non devo specificare alcuna
        // dimensione.
        // l'elemento si andra' a posizionare nella prima cella libera che trova.
        // per cui in questo caso Vincenzo si posiziona nella cella 0.

        // se ne aggiungiamo un'altra string
        listaNomi.add("Lucrezia");
        // avro' una lista di due stringhe:
        // 0 ---> Vincenzo
        // 1 ---> Lucrezia

        // ma se lo desideriamo possiamo specificare la posizione in cui andare a
        // inserire l'elemento nuovo.
        listaNomi.add(2, "Michele");
        // andro' a posizionare Michele nella posizione 2
        // 0 ---> Vincenzo
        // 1 ---> Lucrezia
        // 2 ---> Michele
        // notiamo che .add() e' una funzione, un metodo che accetta un numero di
        // parametri tra le ()
        // che e' variabile. Puo accettarne uno solo oppure due insieme (lo vedremo piu
        // avanti...)

        // se l'indice specificato tra le () e' una posizione gia occpuata:
        // il nuovo elemento viene inserito e tutti gli altri scalano. ad esempio
        listaNomi.add(1, "Riccardo");
        // 0 ---> Vincenzo
        // 1 ---> Riccardo
        // 2 ---> Lucrezia
        // 3 ---> Michele

        // .set() ma se io volessi sovrascrivere proprio un determinato elemento...
        listaNomi.set(1, "Emanuele");
        // 0 ---> Vincenzo
        // 1 ---> Emanuele
        // 2 ---> Lucrezia
        // 3 ---> Michele

        // .addAll() per aggiungere piu elementi contemporaneamente
        ArrayList<String> altraLista = new ArrayList<String>();
        altraLista.add("Emanuel");
        altraLista.add("Salvatore");
        listaNomi.addAll(1, altraLista); // posso inserire uno o due parametri come per .add()
        // a partire dalla posizione 1 di listaNomi vengono inseriti tutti gli
        // appartenenti della lista altralista.
        // intanto gli altri scorrono..
        // 0 ---> Vincenzo
        // 1 ---> Emanuel
        // 2 ---> Salvatore
        // 3 ---> Emanuele
        // 4 ---> Lucrezia
        // 5 ---> Michele

        // .get() mi restituisce l'elemento presente nella posizione specificata
        System.out.println("l'elemento in posione 3 e': " + listaNomi.get(3));
        // mi restituisce Emanuele --> e' l'analogo di vettore[3] per i vettori.

        // .isEmpty() mi dice se la lista e' vuota, restituisce un boolean
        System.out.println("listaNomi e' vuota: " + listaNomi.isEmpty());

        // .clear() svuota la lista
        altraLista.clear();
        // controlliamo di averla svuotata correttamentew con isempty()
        System.out.println("altraLista e' vuota: " + altraLista.isEmpty());

        // .size() mi restituisce la dimensione della lista (analogo di .length per i
        // vettori)
        listaNomi.size();
        System.out.println("numero di elemento di listaNomi prima del remove: " + listaNomi.size());

        // .remove() rimuove un elemento dalla posizione specificata
        listaNomi.remove(3); // oppure remove accetta in ingresso anche direttamente l'elemento da eliminare
        // ATTENZIONE gli elemnti successivi scalano verso l'alto per non lasciare
        // "buchi"
        // 0 ---> Vincenzo
        // 1 ---> Emanuel
        // 2 ---> Salvatore
        // 3 ---> Lucrezia
        // 4 ---> Michele
        // andiamo a controllare l'avvenuta rimozione
        System.out.println("numero di elemento di listaNomi dopo il remove: " + listaNomi.size());

    }
}
