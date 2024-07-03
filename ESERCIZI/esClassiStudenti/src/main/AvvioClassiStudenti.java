package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entities.Studente;

// 1 - creare un progetto con la classe modello studente.
// La classe Studente possiede i seguenti proprieta' e metodi:
// proprieta: String nome, String cognome, int eta, boolean primina, double votoIta, double votoInglese, double votoSpagnolo.
// metodi: String stampa(),double calcoloMedia(), boolean isMaggiorenne(), boolean isPromosso().
// is Promosso e' un metodo che ritorna true se la media e' maggiore di 6
// 2 - nella classe di avvio creare un vettore di studenti andando a prendere i dati da un file.
// varianti:
// A) cambiare l'organizzazione delle informazioni nel file
// B) usare arraylist invece di vettori 

public class AvvioClassiStudenti {

    public static void main(String[] args) throws FileNotFoundException {

        Studente[] listaStudenti = new Studente[2];

        Scanner file = new Scanner(new File("ESERCIZI\\esClassiStudenti\\src\\res\\elencoStudenti.txt"));

        int dimensione = 0;
        while (file.hasNextLine()) {
            file.nextLine();
            dimensione++;
        }
        file.close();
        file = new Scanner(new File("ESERCIZI\\esClassiStudenti\\src\\res\\elencoStudenti.txt"));

        listaStudenti = new Studente[dimensione / 7];
        int indice = 0;

        while (file.hasNextLine()) {

            listaStudenti[indice] = new Studente();
            listaStudenti[indice].nome = file.nextLine();
            listaStudenti[indice].cognome = file.nextLine();
            listaStudenti[indice].eta = Integer.parseInt(file.nextLine());
            listaStudenti[indice].primina = Boolean.parseBoolean(file.nextLine());
            listaStudenti[indice].votoIta = Double.parseDouble(file.nextLine());
            listaStudenti[indice].votoInglese = Double.parseDouble(file.nextLine());
            listaStudenti[indice].votoSpagnolo = Double.parseDouble(file.nextLine());
            indice++;

        }
        file.close();

        System.out.println(listaStudenti[2].stampa());
        System.out.println(listaStudenti[2].calcoloMedia());
        System.out.println(listaStudenti[2].isMaggiorenne());
        System.out.println(listaStudenti[2].isPromosso());

    }

}
