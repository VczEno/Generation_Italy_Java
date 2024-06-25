package es;

import java.util.ArrayList;

public class es01 {
    // creare una lista delle tappe del vostro prossimo viaggio utilizzando i
    // comandi
    // add, addall, remove, set, is empty
    // e poi stampare le tappe utilizzando un ciclo

    public static void main(String[] args) {

        ArrayList<String> tappeViaggio = new ArrayList<>();
        System.out.println("La lista è vuota? " + tappeViaggio.isEmpty());
        tappeViaggio.add("Nasciaro");

        ArrayList<String> tappeIsola = new ArrayList<>();
        tappeIsola.add("Rabat");
        tappeIsola.add("Caccia");
        tappeIsola.add("Nadur");

        tappeViaggio.addAll(tappeIsola);

        tappeViaggio.add("Musta");

        tappeViaggio.add(4, "Mugiarro");

        tappeViaggio.set(2, "Sannat");

        if (tappeViaggio.isEmpty()) {
            System.out.println("Il viaggio è ancora in fase embrionale...");
        } else {
            System.out.println("Il numero di tappe del viaggio è: " + tappeViaggio.size());
            System.out.println("Il viaggio inizia da: " + tappeViaggio.get(0));
            System.out.println("L'ultima tappa: " + tappeViaggio.get(tappeViaggio.size() - 1));
        }

    }
}
