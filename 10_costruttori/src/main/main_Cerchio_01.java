package Oggetti_01.main;

import Oggetti_01.entities.Cerchio;

public class main_Cerchio_01 {
    public static void main(String[] args) {
        Cerchio c; // DICHIARATO
        // In questo punto l'oggetto c di tipo Cerchio NON ESISTA ANCORA. Viene solo
        // dichiarato.
        // Quindi non è possibile richiamare proprietà o metodi.
        // Non esistendo c perché non è ancora stato COSTRUITO non è possibile accedere
        // alle proprietà e ai metodi.
        // c.raggio = 10; // errore
        // System.out.println(c.toString()); // errore
        // Questo perché raggio e toString() essendo proprietà e metodi dell'OGGETTO
        // NECESSITANO DI UN OGGETTO
        // PER ESSERE RICHIAMATI E UTILIZZATI
        c = new Cerchio(); // INIZIALIZZAZIONE O ISTANZA
        // NOTA BENE.
        // Una volta creato un oggetto si parla di STATO DELL'OGGETTO ovvero
        // dell'insieme dei valori delle proprietà
        // dell'oggetto in questione in un dato momento.
        // In questo punto del programma lo stato dell'oggetto c corrisponde a:
        // c.raggio = 0.0
        // c.diametro = 0.0

        // Il metodo toString() è un metodo dell'oggetto di tipo Cerchio quindi è logico
        // affermare che per poter usare il toString() sia necessario avere un'oggetto
        // di tipo Cerchio.
        // c è un oggetto di tipo Cerchio quindi possiamo stampare il return (output)
        // del metodo attraverso c.toString()
        System.out.println("Riga 27: " + c.toString());
        // Allo stesso modo possiamo associare alla proprietà raggio dell'oggetto c di
        // tipo Cerchio un valore
        // a patto che sia dello stesso tipo della proprietà ovvero double.
        c.raggio = 20.3;
        // A questo punto del programma lo STATO DELL'OGGETTO c corrisponde a:
        // c.raggio = 20.3
        // c.diametro = 0.0
        // Ovviamente se ci fossero altre proprietà dell'oggetto verrebbero richiamate
        // di conseguenza nello stato.
        System.out.println("Riga 35: " + c.toString());
        c.raggio = 10; // 10.0
        System.out.println("Riga 37: " + c.toString());
        // c.raggio = true; //NON è dello stesso tipo della proprietà e quindi da errore
        // c.raggio = "10.2"; //Non è dello stesso tipo della proprietà e quindi da
        // errore

        // Per creare un nuovo oggetto di tipo Cerchio è necessario richiamare in causa
        // il costruttore.
        Cerchio c1;
        c1 = new Cerchio();
        // Ora il mio programma dispone di DUE OGGETTI DI TIPO CERCHIO: c e c1.

        // Se ora volessi maggior controllo sull'oggetto che vado a costruire dovrei
        // ragionare sul COSTRUTTORE.
        // Infatti, il costruttore vuoto di default non ha regole specifiche per la
        // creazione dell'oggetto.
        // Viene creato l'oggetto e poi successivamente viene dato un valore alla
        // proprietà raggio in questo caso.
        // Se noi invece ricorressimo al costruttore parametrizzato al quale viene
        // passato il parametro double raggio
        // sarà lo stesso costruttore ad assegnare il valore del parametro alla
        // proprietà in un modo al main sconosciuto.
        Cerchio c2;
        double r = 10.5;
        c2 = new Cerchio(r);
        // Al costruttore non interessa da dove arrivi il parametro che viene passato.
        // Quello è un problema di chi
        // richiama il costruttore (in questo caso il main). Quindi:
        // 1 - main dichiara un oggetto c2 di tipo Cerchio e chiede alla classe modello
        // Cerchio di COSTRUIRLO
        // mediante il costruttore che prende in ingresso un parametro double.
        // Il parametro double viene dal main.
        // 2 - Cerchio (classe modello) riceve l'ordine dal main, riceve il parametro
        // double e con esso verifica che
        // sia possibile costruire l'oggetto richiesto. Se esiste nella classe modello
        // un costruttore che permette
        // di creare un oggetto Cerchio con queste dinamiche allora la classe modello si
        // occupa della costruzione di tale oggetto
        // rimandandolo poi al main.
        // A questo punto lo STATO DELL'OGGETTO c2 sarebbe:
        // c.raggio = 10.5
        // c.diametro = 21
        // Non è stato necessario da parte del main o di altre classi associare r alla
        // proprietà dell'oggetto c2 di tipo Cerchio.
        // Il main non è responsabile della creazione dell'oggetto né dell'associazione
        // di variabili/parametri alle proprietà.
        // Fa tutto il costruttore della classe modello.
        System.out.println("Riga 66: " + c2.toString());
    }
}