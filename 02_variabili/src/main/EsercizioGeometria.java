package main;

public class EsercizioGeometria {

        public static void main(String[] args) {
                /*
                 * ESERCIZIO:
                 * scrivere un programma che utilizzando le variabili dei lati calcoli area e
                 * perimetro di un quadrato,
                 * stessa cosa per una figura a nostra scelta
                 */

                // utilizziamo la procedura DICO

                // DICHIARAZIONE

                int lato, areaQuadrato, perimetroQuadrato;

                // INIZIALIZZAZIONE
                lato = 21;
                areaQuadrato = 0;
                perimetroQuadrato = 0;

                // CALCOLO

                areaQuadrato = lato * lato;
                perimetroQuadrato = lato * 4;

                // OUTPUT

                System.out.println("Se un quadrato ha lato: " + lato + ", avrà l'area pari a: " + areaQuadrato
                                + " e il perimetro pari a: " + perimetroQuadrato);

                // esercizio rettangolo

                // DICHIARAZIONE

                int latoA, latoB, areaRettangolo, perimetroRettangolo;

                // INIZIALIZZAZIONE
                latoA = 8;
                latoB = 3;
                areaRettangolo = 0;
                perimetroRettangolo = 0;

                // CALCOLO

                areaRettangolo = latoA * latoB;
                perimetroRettangolo = latoA * 2 + latoB * 2;

                // OUTPUT

                System.out
                                .println(
                                                "Se un rettangolo ha lati: " + latoA + " e " + latoB
                                                                + ", avrà l'area pari a: " + areaRettangolo
                                                                + " e il perimetro pari a: " + perimetroRettangolo);

        }

}
