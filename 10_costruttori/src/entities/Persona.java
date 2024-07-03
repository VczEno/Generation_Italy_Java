package Oggetti_01.entities;

public class Persona
{
    //CRITERI o LIVELLI di visibilità
    //Il concetto di visibilità in JAVA indica la possibilità o meno di raggiungere un elemento.
    //Sfruttare e gestire tali livelli permette la costruzione di architettura più organizzate
    //perché ad esempio limita l'accesso a determinate informazioni in contesti in cui non sono necessarie
    //migliorando da un lato la sicurezza del programma ma anche del programmatore che non rischia di
    //utilizzare elementi al di fuori di ciò su cui sta lavorando.
    //Quanti sono i livelli di visibilità? 4
    //Quali sono i livelli di visibilità?
    //1 - PUBLIC -> indica che quell'elemento è visibile ovunque all'interno del progetto.
    //      public String nome; all'interno di Persona è visibile anche in mainPersona_01 che sta in un altro
    //      package oltre ad essere visibile ovunque all'interno del progetto.
    //2 - PRIVATE -> indica che quell'elemento è visibile solo all'interno della classe in cui si trova.
    //      private String nome; all'interno di Persona è visibile SOLO all'interno della classe modello Persona.
    //3 - PACKAGE -> indica che quell'elemento è visibile solo all'interno del package in cui si trova.
    //      String nome; è visibile da qualunque classe purché sia all'interno del package entities.
    //      Di default ogni elemento è package...pensate al main in cui scrivete le variabili senza definire
    //      il livello di visibilità.
    //4 - PROTECTED -> VEDREMO IN SEGUITO ma indica che l'elemento è visibile all'interno del package
    //                  e a qualunque altra classe sia imparentata a quella in cui l'elemento è
    //                  presente ovunque essa si trovi.
    private String nome;
    private int eta;

    //Il metodo getNome() restituisce di default il valore della proprietà nome che resta private.
    //Potrebbe anche contenere della logica per la quale il valore di return cambia.
    public String getNome()
    {
        String ris = nome;
        if(nome.equalsIgnoreCase("Luca"))
            ris = "Benvenuto " + nome;
        return ris;
    }

    //setNome() è un metodo che riceve un parametro per assegnarlo alla proprietà this.nome ovvero
    //alla proprietà nome dell'oggetto di classe Persona.
    //setNome() è utile perché la proprietà nome è private e quindi tranne per quanto riguarda
    //il costruttore non è possibile assegnare valori ad essa.
    //La tipologia VOID del metodo indica che la sua funzione è di MODIFICARE LO STATO DELL'OGGETTO
    //andando ad agire direttamente sul valore della proprietà che verrà riassegnato.
    //Ovviamente anche in questo caso il parametro che viene passato e il modo in cui viene assegnato
    //dipendono dalla logica del metodo.
    public void setNome(String nome)
    {
        //Se la lunghezza del nome passato come parametro è maggiore di 0 ovvero ha almeno una lettera
        //assegnala alla proprietà nome. In caso contrario, quindi se il valore è ""
        //assegna alla proprietà nome il valore "ERRORE".
        if(nome.length() > 0)
            this.nome = nome;
        else
            this.nome = "ERRORE";
    }

    public int getEta()
    {
        return eta;
    }

    public void setEta(int eta)
    {
        //All'interno del metodo setEta() lavoro sul dato in ingresso.
        //Se il valore è compreso tra 0 (ETAMIN) e 120 allora viene assegnato direttamente.
        //Se il valore è minore o uguale a 0 (ETAMIN) viene assegnato il valore zero (ETAMIN).
        //In tutti gli altri casi, ovvero se è maggiore di 120 viene assegnato il valore massimo ovvero 120.
        if(eta > ETAMIN && eta < 120)   
            this.eta = eta;
        else if(eta <= ETAMIN)
            this.eta = ETAMIN;
        else
            this.eta = 120;
    }

    public static final int ETAMIN = 0;
    public static int ETAMAX = 20;

    public Persona(String nome, int e)
    {
        this.nome = nome;
        eta = e;
    }

    public boolean isMaggiorenne()
    {
        return eta >= 18 ? true : false;
    }

    //Creare la proprietà dell'oggetto classe.
    //Aggiornare il costruttore e il programma in funzione della nuova proprietà.
    //Nota bene: le classi non sono infinite...le possibilità sono solo 5 + 0 che è quella che deve comparire
    //nel caso in cui il valore di eta sia minore di 14 oppure maggiore di 18.
    //Creare i metodi getClasse() e setClasse().
    //Fare in modo che il valore di classe venga impostato tramite il valore di eta dell'oggetto
    //in modo da sostituire il metodo classe() qui sotto.
    public int classe()
    {
        int ris;
        switch(eta)
        {
            case 14 :
                ris = 1;
            break;
            case 15 :
                ris = 2;
            break;
            case 16 :
                ris = 3;
            break;
            case 17 :
                ris = 4;
            break;
            case 18 :
                ris = 5;
            break;
            default :
                ris = 0;
            break;
        }
        return ris;
    }

    public String toString()
    {
        String ris = nome + " " + eta + "\n";
        if(eta > ETAMAX)
            ris += "L'età inserita è anomala\n";
        if(classe() == 0)
            ris += "Non è possibile assegnare la classe alla persona.\n";
        else
            ris += "La classe è " + classe() + "\n";
        //Se la Persona ha più di 17 anni stampare che è anche maggiorenne.
        if(isMaggiorenne())
            ris += "Maggiorenne";
        return ris;
    }
}