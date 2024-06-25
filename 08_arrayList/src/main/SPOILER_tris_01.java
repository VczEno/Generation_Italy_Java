import java.util.Scanner;
public class tris_01
{
    public static void main(String[] args)
    {
        //Inizializziamo la griglia vuota
        //Per costruirla useremo un vettore di vettori e ad ogni posizione assegneremo di default il valore "-"
        char[][] griglia = new char[3][3];
        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                griglia[i][j] = '-';
            }
        }
        String ris = "";
        //Creiamo uno scanner per leggere l'input dall'utente
        Scanner tastiera = new Scanner(System.in);
        //Inizializziamo il numero di mosse effettuate a 0
        int mosseEffettuate = 0;
        //Creiamo una variabile per stampare la griglia di partenza
        String stampaGriglia = "";
        //Inizializziamo il primo giocatore e una serie di altre variabili di controllo che ci serviranno in seguito.
        char giocatoreCorrente = 'x';
        boolean gio1rigaVinta = false;
        boolean gio1colonnaVinta = false;
        boolean gio2rigaVinta = false;
        boolean gio2colonnaVinta = false;
        boolean gio1Vittoria = false;
        boolean gio2Vittoria = false;
        //Stampiamo la griglia a ogni ciclo
        //Il ciclo si ripeterà finché entrambi i giocatori non avranno vinto e finché le mosse saranno inferiori a 9
        //ovvero il numero massimo consentito in una griglia 3X3.
        while((gio1Vittoria == false && gio2Vittoria == false) && mosseEffettuate < 9)
        {
            stampaGriglia = "";
            for(int i = 0; i < 3; i++)
            {
                //Ogni tre cicli va accapo così otteniamo una griglia 3X3
                stampaGriglia += "\n";
                for (int j = 0; j < 3; j++)
                {
                    stampaGriglia += griglia[i][j];
                }
            }
            System.out.println(stampaGriglia);
            //Parte il primo giocatore che ha come simbolo la 'x'
            if(giocatoreCorrente == 'x')
            {
                boolean gio1diagonale1Vinta;
                boolean gio1diagonale2Vinta;
                //Questo è il campo del giocatore 1 ovvero quello che ha come valore assegnato 'x'
                // Chiediamo all'utente di fare una mossa
                System.out.println("Turno del giocatore X");
                System.out.print("Inserisci la riga (da 1 a " + 3 + "): ");
                int riga = Integer.parseInt(tastiera.nextLine()) - 1;
                System.out.print("Inserisci la colonna (da 1 a " + 3 + "): ");
                int colonna = Integer.parseInt(tastiera.nextLine()) - 1;
                //Verifichiamo che la mossa sia valida
                //Se il valore di riga e quello di colonna sono inferiori a 3 e il valore della cella è "-" ovvero
                //nessun giocatore lo ha ancora selezionato, la variabile boolean diventa true. Altrimenti false.
                boolean valida = (  
                                    riga >= 0 && riga < 3
                                    &&
                                    colonna >= 0 && colonna < 3
                                    &&
                                    griglia[riga][colonna] == '-'
                                )
                                ?
                                true
                                :
                                false;
                //Se la mossa è valida aggiorniamo la griglia trasformando il contenuto di griglia nelle posizioni
                //di riga e colonna da "-" in "x" e incrementiamo il valore delle mosse effettuate.
                //Infine cambiamo il valore del giocatore corrente così da cambiare turno.
                if(valida)
                {
                    griglia[riga][colonna] = 'x';
                    mosseEffettuate++;
                    giocatoreCorrente = 'o';
                }
                else
                {
                    //In caso contrario diamo un feedback.
                    System.out.println("Mossa non valida, riprova.");
                }//Fine dell'if di controllo validità della mossa.
                //Controlliamo le righe
                //Per prima cosa cicliamo tutte le righe
                for(int i = 0; i < 3; i++)
                {
                    //Ad ogni ciclo reimpostiamo il valore di gio1rigaVinta a true
                    gio1rigaVinta = true;
                    for(int j = 0; j < 3; j++)
                    {
                        //Se all'interno della riga c'è un simbolo diverso da 'x' ovvero da quello del giocatore 1
                        //significa che il giocatore 1 non ha vinto su quella riga.
                        if(griglia[i][j] != 'x')
                        {
                            gio1rigaVinta = false;
                            break;
                        }
                    }
                    //Finito il check sulle righe verifichiamo se almeno una delle tre righe era la vincente.
                    if(gio1rigaVinta)
                    {
                        gio1Vittoria = true;
                    }
                }//Fine del for per il controllo delle righe giocatore 1
                //System.out.println("gio1rigavinta: " + gio1rigaVinta);
                //Controlliamo le colonne in modo analogo alle righe
                for(int j = 0; j < 3; j++)
                {
                    gio1colonnaVinta = true;
                    for(int i = 0; i < 3; i++)
                    {
                        if(griglia[i][j] != 'x')
                        {
                            gio1colonnaVinta = false;
                            break;
                        }
                    }
                    if(gio1colonnaVinta)
                    {
                        gio1Vittoria = true;
                    }
                }//Fine del for per il controllo delle colonne giocatore 1
                //System.out.println("gio1colonnaVinta: " + gio1colonnaVinta);
                //Controlliamo le diagonali in modo simile a righe e colonne considerando però che ci
                //sono due possibili diagonali.
                gio1diagonale1Vinta = true;
                gio1diagonale2Vinta = true;
                for(int i = 0; i < 3; i++)
                {
                    if(griglia[i][i] != 'x')
                    {
                        gio1diagonale1Vinta = false;
                    }
                    if(griglia[i][3 - 1 - i] != 'x')
                    {
                        gio1diagonale2Vinta = false;
                    }
                }
                //Se almeno una delle due booleane di controllo sulle diagonali è true allora il giocatore ha vinto
                if(gio1diagonale1Vinta || gio1diagonale2Vinta)
                {
                    gio1Vittoria = true;
                }//Fine del for per il controllo delle diagonali giocatore 1
            }//Fine di if per giocatoreCorrente = "x"
            else
            {
                boolean gio2diagonale1Vinta;
                boolean gio2diagonale2Vinta;
                //Questo è il campo del giocatore 2 ovvero quello che ha come valore assegnato 'o'
                System.out.println("Turno del giocatore O");
                System.out.print("Inserisci la riga (da 1 a " + 3 + "): ");
                int riga = Integer.parseInt(tastiera.nextLine()) - 1;
                System.out.print("Inserisci la colonna (da 1 a " + 3 + "): ");
                int colonna = Integer.parseInt(tastiera.nextLine()) - 1;
                boolean valida = (  
                                    riga >= 0 && riga < 3
                                    &&
                                    colonna >= 0 && colonna < 3
                                    &&
                                    griglia[riga][colonna] == '-'
                                )
                                ?
                                true
                                :
                                false;
                if(valida)
                {
                    griglia[riga][colonna] = 'o';
                    mosseEffettuate++;
                    giocatoreCorrente = 'x';
                }
                else
                    System.out.println("Mossa non valida, riprova.");
                // Controlliamo le righe
                //Per prima cosa cicliamo tutte le righe
                for(int i = 0; i < 3; i++)
                {
                    //Ad ogni ciclo reimpostiamo il valore di gio2rigaVinta a true
                    gio2rigaVinta = true;
                    for(int j = 0; j < 3; j++)
                    {
                        //Se all'interno della riga c'è un simbolo diverso da 'o' ovvero da quello del giocatore 2
                        //significa che il giocatore 2 non ha vinto su quella riga.
                        if (griglia[i][j] != 'o')
                        {
                            gio2rigaVinta = false;
                            break;
                        }
                    }
                    //Finito il check sulle righe verifichiamo se almeno una delle tre righe era la vincente.
                    if(gio2rigaVinta)
                    {
                        gio2Vittoria = true;
                    }
                }//Fine del for per il controllo delle righe giocatore 1
                //System.out.println("gio2rigavinta: " + gio2rigaVinta);
                // Controlliamo le colonne
                for(int j = 0; j < 3; j++)
                {
                    gio2colonnaVinta = true;
                    for(int i = 0; i < 3; i++)
                    {
                        if(griglia[i][j] != 'o')
                        {
                            gio2colonnaVinta = false;
                            break;
                        }
                    }
                    if(gio2colonnaVinta)
                    {
                        gio2Vittoria = true;
                    }
                }//Fine del for per il controllo delle colonne giocatore 2
                //System.out.println("gio2colonnaVinta: " + gio2colonnaVinta);
                // Controlliamo le diagonali
                gio2diagonale1Vinta = true;
                gio2diagonale2Vinta = true;
                for(int i = 0; i < 3; i++)
                {
                    if(griglia[i][i] != 'o')
                    {
                        gio2diagonale1Vinta = false;
                    }
                    if(griglia[i][3 - 1 - i] != 'o')
                    {
                        gio2diagonale2Vinta = false;
                    }
                }
                if(gio2diagonale1Vinta || gio2diagonale2Vinta)
                {
                    gio2Vittoria = true;
                }//Fine del for per il controllo delle diagonali giocatore 2
            }//Fine dell'else per giocatoreCorrente = 'o'
        }//Fine di while
        //STAMPIAMO LA GRIGLIA FINALE
        stampaGriglia = "";
        for(int i = 0; i < 3; i++)
        {
            //Ogni tre cicli va accapo così otteniamo una griglia 3X3
            stampaGriglia += "\n";
            for (int j = 0; j < 3; j++)
            {
                stampaGriglia += griglia[i][j];
            }
        }
        System.out.println(stampaGriglia);
        //Se siamo qui significa che:
        //Ha vinto il giocatore 1
        //Ha vinto il giocatore 2
        //La partita è finita in pareggio
        //Decretiamo il vincitore
        if(gio1Vittoria)
            ris = "Il giocatore 1 ha vinto!";
        else if(gio2Vittoria)
            ris = "Il giocatore 2 ha vinto!";
        else
            ris ="Pareggio!";
        System.out.println(ris);
        tastiera.close();
    }//Fine di main
}//Fine di tutto