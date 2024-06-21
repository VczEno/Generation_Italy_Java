package main;

public class AvvioConcatenazione {
    public static void main(String[] args) {
        // +: il simbolo '+' ha due funzioni
        // può essere usato come somma matematica
        // oppure per CONCATENARE diverse stringhe

        int numero, numeroSpeciale;
        numero = 3;
        numeroSpeciale = 5;

        int somma;  // dichiarazione della variabile somma
        somma = numero + numeroSpeciale;  // inizializzazione della variabile somma

        System.out.println("Prima stampa: Il risultato della somma è: ");
        System.out.println(somma);

        System.out.println("Seconda stampa: stringa contenente la parola somma");
        System.out.println("somma");

        // operazioni speciali
        int contatore = 3;
        contatore = contatore + 4;   // contatore = 3 + 4 = 7
        System.out.println("contatore: " + contatore);

        contatore = contatore + 1;
        System.out.println("contatore: " + contatore);
        int numeroFisso = contatore;
        System.out.println("numero fisso: " + numeroFisso);

        contatore += 1; // contatore = contatore + 1;
        System.out.println("contatore: " + contatore);
        System.out.println("numero fisso: " + numeroFisso);

        contatore ++; // aumento il valore di una unita'
        System.out.println("contatore: " + contatore);
        System.out.println("numero fisso: " + numeroFisso);

        // facciamo delle prove con altri segni
        contatore *= 2 ; // contatore = contatore * 2;
        System.out.println("contatore: " + contatore);
        System.out.println("numero fisso: " + numeroFisso);

        // +, -, /, *, %
        // 5/2 = 2;  il due nel cinque ci sta due volte
        // 5%2 = 1; il resto della divisione e' 1




        // CONCATENAZIONE
        String nome = "Samuele";
        String cognome = "De Leo";
        // per concatenare nome e cognome e poi stampare il risultato ho due strade:

        // 1) concatenando direttamente nell'output
        System.out.println("il nominativo è: " + nome + " " + cognome);

        // 2) oppure posso passare attraverso una veriabile ausiliaria
        String nominativo;
        nominativo = nome + " " + cognome;   // <-- salvo la CONCATENAZIONE nella variabile ausiliaria
        System.out.println("il nominativo è: " + nominativo);
        
        
        // facciamo delle prove di stampa
        System.out.println("2+3");  // 2+3
        System.out.println(2+2);    //  4    2+2    
        System.out.println(2+"2");  // 22
        System.out.println(2+2+ "2");   //42      
        System.out.println("2" + 2+2);  //    222  ovvero   "22" + 2
        System.out.println("2+2" +2+2);   // 2+222
        System.out.println("2" + (2+2) +2+2);    // 2422  


        System.out.println("(2+2)" + 2+2);   // (2+2)22 

    }
}
