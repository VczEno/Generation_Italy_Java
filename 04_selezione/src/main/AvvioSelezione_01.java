
/*
 * PROGRAMMAZIONE CLASSICA
 * è costituita da 3 principi fondamentali.
 * Il primo l'abbiamo già visto, si tratta della SEQUENZA (I principio).
 * 
 * vediamo ora il princio di SELEZIONE (II principio)
 * 
 */

public class AvvioSelezione_01 {
   public static void main(String[] args) {

      // il primo strumento che vediamo per usare la selezione è il costrutto if:
      /*
       * SINTASSI:
       * 
       * if (condizione){
       * istruzioni...
       * ....
       * }
       */

      String nome = "Claudio";
      int eta = 18;

      /*
       * se la condizione tra le tonde() è vera allora verranno eseguite
       * le istruzioni presenti tra le graffe
       * Altrimenti se la condizione è falsa
       * il contenuto delle parentesi graffe verra ignorato
       */

      // una condizione è una espressione che può essere giudicata VERA o FALSA.

      if (eta >= 18) {
         System.out.println("Ciao " + nome + ", sei maggiorenne!");
      }

      if (eta == 18) {
         System.out.println("Bravissim*, adesso puoi prendere la patente!");
      }
      // l'operatore == viene usato all'interno delle condizioni.
      // usiamo il "doppio uguale" e non l'"uguale singolo" per distinguerli:
      // - = lo uso in fase di ASSEGNAZIONE di un valore ad una variabile
      // - == lo uso per verificare la veridicita' di una condizione

      if (eta < 18) {
         System.out.println("Peccato " + nome + ", non puoi guardare Star wars!");
      }

      // != signofica "diverso da"
      if (eta != 24) {
         System.out.println("Che peccato non essere nati nel 2000 !!!!");

      }

      // in generale associamo all'operatore ! un significato di negazione
      // infatti possiamo utilizzarlo per negare una intera condizione
      if (eta >= 21) {
         System.out.println("Finalmente puoi prendere anche la patente della moto!");

      }

      // if (eta <21){
      // System.out.println("Non puoi ancora prendere la patente della moto");
      // }
      // i due costrutti if qui sopra posseggono due condizioni opposte
      // ovvero l'una esclude l'altra (eta in questo caso mi consentira' di accedere
      // ad una sola serie di istruzioni)
      // possiamo affermare che sono l'una la negazione dell'altra
      // quindi possiamo esprimere una condizione andando a NEGARE l'altra:
      if (!(eta >= 21)) {
         System.out.println("Non puoi ancora prendere la patente della moto");
      }
      // anteponendo il ! ("diverso da") alla condizione "eta >= 21"
      // è come se dicessi "se l'eta' non è maggiore di 21" o meglio:
      // "se non si verifica la condizione l'eta' e' maggiore di 21"
      // che coincide con l'affermare "se l'eta' è minore di 21"

      // nelle condizioni possiamo usare gli operatori <,>,<=,>=,==,!=,!
      // vedremo anche il legame tra condizioni e boolean

   }
}
