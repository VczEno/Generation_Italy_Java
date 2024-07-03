package Oggetti_01.entities;

public class Cerchio
{
    //Cerchio è la classe MODELLO per la creazione di oggetti di tipo Cerchio.
    //Cerchio ha una sola proprietà dell'oggetto ovvero: RAGGIO
    public double raggio;
    //Aggiungiamo una nuova proprietà dell'OGGETTO
    public double diametro;
    //Il valore di diametro corrisponde al doppio del valore del raggio.

    //In questo momento ho UN SOLO COSTRUTTORE che viene messo a disposizione da Java di default per ogni nuova
    //classe modello. Questo perché a livello logico ogni classe modello è utile alla CREAZIONE di un oggetto.
    //Gli oggetti possono essere creati SOLO tramite costruttori.
    public Cerchio()
    {
        //Costruttore vuoto.
    }

    //Il costruttore è un METODO come qualsiasi altro metodo MA ha delle caratteristiche particolari:
    //1 - Si chiama come la classe
    //2 - Non ha esplicitato un tipo di return perché si occupa della creazione (istanza) dell'oggetto del tipo della
    //      classe in cui si trova.
    //3 - Serve a creare oggetti del tipo della classe in cui si trova. Cerchio costruirà oggetti di tipo Cerchio.
    public Cerchio(double raggio)
    {
        //Questo costruttore riceve UN SOLO parametro.
        //this.raggio = raggio significa che il costruttore assegna alla proprietà dell'oggetto raggio (this.raggio)
        //il valore del parametro in entrata di tipo double
        this.raggio = raggio;
        //Per valorizzare la proprità dell'oggetto diametro il costruttore utilizza ancora una volta
        //il parametro raggio di tipo double.
        //In questo modo con un solo parametro double vengono valorizzate due proprietà dell'oggetto.
        //Quindi richiamando il costruttore Cerchio(double raggio) verrà creato un oggetto con uno STATO definito
        //mentre negli altri casi il valore di diametro dovrà essere assegnato in modo diverso.
        this.diametro = raggio * 2;
        //Nota bene: this.diametro o diametro in questo caso indicano entrambi la proprietà dell'oggetto.
        //Non ricevendo un parametro chiamato diametro non c'è il rischio di omonimia che invece troviamo per raggio.
    }
    
    public String toString()
    {
        return  "Raggio: "      +   raggio      +   "cm\n"  +
                "Diametro: "    +   diametro    +   "cm\n"  ;
    }
}