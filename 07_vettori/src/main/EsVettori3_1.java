package main;

//Livello 1
//Creare un vettore di String che contenga (nell'ordine in cui sono riportate)
//le seguenti parole:
//"In ", "un villaggio di campagna c'Ã¨ una tana a forma di ",
//"bocca ","dalla quale usciva una volta ",
//"al ","giorno un grigio ","lupo!"
//Es: parole[0] = "In"
//Scrivere un programma che stampi solo le parole in posizione pari

//Livello 2:
//Una volta visto il ciclo for rifattorizzare l'esercizio con il ciclo for.

public class EsVettori3_1 {
    public static void main(String[] args) {

        String[] favola = new String[7];

        favola[0] = "In ";
        favola[1] = "un villaggio di campagna c'Ã¨ una tana a forma di ";
        favola[2] = "bocca ";
        favola[3] = "dalla quale usciva una volta ";
        favola[4] = "al ";
        favola[5] = "giorno un grigio ";
        favola[6] = "lupo!";

        int indice = 0;

        while (indice < favola.length) {
            if (indice % 2 == 0)
                System.out.println(favola[indice]);

            indice++;
        }

        for (int i = 0; i < favola.length; i++) {
            if (i % 2 == 0)
                System.out.println(favola[i]);

        }
    }

}
