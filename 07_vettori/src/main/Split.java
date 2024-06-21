package main;

public class Split {
    public static void main(String[] args) {
        //  VEDIAMO TUTTI I MODI IN CUI POSSIAMO INIZIALIZZARE UN VETTORE

        // 1) inizializzo una cella alla volta
        String[] vettore = new String[3];
        vettore[0] = "Ciao, ";
        vettore[1] = "come ";
        vettore[2] = "stai?";


        // 2) usando un ciclo (utile con iserimento da tastiera, lettura file..)
        for(int i=0; i<vettore.length; i++){
            vettore[i] = "Inserisci qui il valore della cella " + i;
        }


        // 3) posso anche inizializzarlo su una riga sola (senza ciclo)
        String[] giorniSettimana = {"lun","mar","mer","gio","ven","sab","dom"};
        // in questo caso non devo specificare new String[dimesione]
        // perchè la dimensione viene settata in automatico
        


        // 4) attraverso il comando SPLIT
        // ho bisogno di UNA stringa madre che contenga i valori da assegnare alle celle del vettore
        // la stringa madre deve contenere anche un SEPARATORE che si ripete ogni volta
        // che voglio spezzare la stringa madre

        String giorniStringa = "lun;mar;mer;gio;ven;sab;dom";

        // SPLIT mi consente di TRASFORMARE una stringa in un vettore di n elementi
        String[] giorniVettore = giorniStringa.split(";");
        // devo specificare tra le parentesi tonde qual è il separatore che sto utilizzando
        // anche in questo caso non devo specificare new String[dimesione]
        // perchè la dimensione viene settata in automatico




        // proviamo a stampare per vericare se gli inserimenti sono corretti
        //1 e 2
        String vettoreStringato ="";
        for(int i=0; i<vettore.length; i++){
            vettoreStringato += vettore[i] +"\n";
        }
        System.out.println(vettoreStringato);

        //3
        System.out.println("dimensione vettore con metodo 3: " +giorniSettimana.length
                            +"\nultimo giorno: " + giorniSettimana[6]);

        // 4
        vettoreStringato ="";
        for(int i=0; i<giorniVettore.length; i++){
            vettoreStringato += giorniVettore[i];
            vettoreStringato += (    (i<(giorniVettore.length-1)) ? ";" : ""       );
        }
        // in questo modo posso tornare alla stringa a partire dal vettore
        System.out.println("ecco la stringa originale prima dello split");
        System.out.println(vettoreStringato);






        //       vediamo come gestire le variabili NUMERICHE usando split
        // non posso fare così:
        String num = "1,2,3";
        //int[] numeri = num.split(",");
        // perche' split mi restituisce sempre un vettore di stringhe
        // quindi dovrò salvare le informazioni in un vettore di stringhe
        String[] numeriStringhe = num.split(",");
        // e poi dovro parsare una ad una le stringhe per inserirle nel vettore di interi:
        int[] numeriInt = new int[numeriStringhe.length];
        int somma=0;
        for(int i = 0; i<numeriStringhe.length; i++){
            numeriInt[i]= Integer.parseInt(numeriStringhe[i]);
            somma += numeriInt[i];
        }
        System.out.println("ecco la somma dell'ultimo ciclo for: " + somma);
    }
    
}
