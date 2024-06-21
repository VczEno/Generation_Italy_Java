public class ripasso_03
{
    public static void main(String[] args)
    {
        String residenza = "Brescia";
        int eta = 38;
        String professione = "Insegnante";
        boolean donatore = true;
        int biglietto = 10;

        //Se sei residente a Brescia entri gratis
        if(residenza.equalsIgnoreCase("brescia"))
            biglietto = 0;
        else
        {
            //Se viene eseguito questo BLOCCO DI CODICE significa che il valore di residenza è DIVERSO DA BRESCIA.
            //Quindi vengono controllati i valori delle altre variabili per eventuali sconti.
            //Nota bene: QUI IL VALORE DI biglietto è ancora 10
            //Se hai un'età inferiore a 12 e superiore a 70 hai uno sconto di 3€
            if(eta < 12 || eta > 70)
                biglietto -= 3;
            //Se sei insegnante o studente hai uno sconto di 1€ cumulabile
            if(professione.equalsIgnoreCase("insegnante") || professione.equalsIgnoreCase("studente"))
                biglietto -= 1;
            //Se sei donatore hai uno sconto ulteriore di 1€
            if(donatore == true)
                biglietto -= 1;
        }
        System.out.println("Biglietto: " + biglietto + " euro.");
        //Le righe 12 e 29 vengono SEMPRE ESEGUITE.
        //La riga 13 dipende dalla veridicità della riga 12.
        //La riga 14 e il blocco di codice successivo (dalla riga 15 alla 28) dipendono dal fatto che la riga 12 sia falsa.
        //Se la condizione alla riga 12 è false il programma considera anche tutto ciò che avviene prima della riga 29.
        //Se la condizione alla riga 12 è true, il programma passa direttamente alla riga 29 ignorando il resto.
    }
}