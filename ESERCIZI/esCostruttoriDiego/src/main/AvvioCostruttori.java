package main;
/*
    1 - creare una classe modello Libro che abbia le seguenti proprietà:
    titolo, autore, numeroPagine, genere, dataPubblicazione, numeroVendite,
    copertinaRigida(boolean), prezzo, stelle(cioè valore delle recensioni come int da 1 a 5)

   2 - PARTE NUOVA
creare uno o più costruttori

   3 - inserire anche i seguenti metodi:
            -isBestSeller() che ritorna un boolean. Un libro è un best seller se il
                suo numero di vendite e maggiore di 10000
            -getAnnoPubblicazione() -> ritorna l'anno di pubblicazione
            -prezzoBase() che ritorna un double.
                Se la copertina è rigida aumentare il prezzo del 5%
                se è un best seller diminuire il prezzo del 3%
                se sono passati 5 anni dalla pubblicazione diminuire il prezzo del 5%
                se ha più di 250 pagine aumentare il prezzo del 2%
            -prezzo(double sconto, String dataScadenzaSconto) che ritorna un double
                e prende due parametrin in input. Il primo parametro conterrà il valore
                dello sconto da applicare al prezzoBase mentre il secondo
                servirà per verificare che
                sia ancora valido in modo che il prezzo scontato venga calcolato solo se la
                data attuale è antecedente alla data di scadenza dello sconto.
                In caso contrario il prezzo torna quello di base.
                Inoltre se la valutazione delle recensioni è minore o uguale a 2 diminuire
                il prezzo calcolato con lo sconto del 2%
            -toString()

   4 - LEGGERE UN FILE E SALVARE I DATI IN UN ARRAYLIST

   5 -  parte bonus
   permettere ad un utente di visualizzare:
    elenco dei libri
    elenco dei libri di un determinato autore(che sceglie l'utente). Prima controllare
            che esista quel determinato autore nella vostra lista

   6 - parte super bonus
    rifattorizzare l'esercizio con i vettori (e/o cambiando impostazione dati nel file)
*/

import java.io.File;
import java.util.Scanner;

public class AvvioCostruttori {

}
