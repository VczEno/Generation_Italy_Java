package main;
/* 
 * 1) vi lascio un esercizio sull'ereditarieta.
//   creare un legame di ereditarietà tra le seguenti classi
//- alimenti: String nome, double prezzo;
//- cibi: double peso, boolean isPiccante;
//- piattiCaldi: int TemperaturaCottura;
//- piattiFreddi boolean isDolce;
//- bevande: double volume, boolean cannuccia;

//- creare i costruttori in maniera appropriata, getters/setters e anche i metodi toString()
//- infine inventare almeno un metodo nella classe alimenti che verrrà ereditato quindi
// dalle classi figlie.

//   nel main creare più oggetti utilizzando anche il polimorfismo di oggetti e
//  stampare un pò di cose per far vedere che avete capito....

2) continuate poi l'esempio della scuola aggiungendo anche le classi Docente (String materiaInsegnata, boolean cattedra) e Vicepreside (boolean anziana)

3) se volete esercitarvi ulteriormente provate a inventare voi qualche relazione tra classi modello, comunque vi suggeriamo di 
ripassare/fare esercizi su tutto ciò che viene prima dell'ereditarietà.
*/

import entities.*;

public class AvvioAlimenti {

    public static void main(String[] args) {

        Bevande limonata = new Bevande("lemonsoda", 1.50, 0.33, false);
        PiattiFreddi gelato = new PiattiFreddi("magnum", 1.80, 90, false, true);
        PiattiCaldi pizza = new PiattiCaldi("margherita", 5.0, 400, false, 400);
        Alimenti mela = new Cibi("mela golden", 0.40, 120, false);
        System.out.println(mela.toString());

        System.out.println(limonata.toString());

        System.out.println(pizza.toString());
        System.out.println(gelato.toString());
        System.out.println(pizza.PrezzoScontato(50));

    }
}
