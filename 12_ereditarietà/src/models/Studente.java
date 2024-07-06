package models;
/*
 * extends è la keyword per indicare l'EREDITARIETA tra le classi.
 * in questo caso la claSSE STUDENTE ESTENDE LA CLASSE PERSONA ovvero
 *      LA CLASSE STUDENTE è FIGLIA della classe PERSONA (la classe Persona è padre di Studente)
 * quindi la classe Studente  EREDITA tutte le proprieta di Persona
 * ATTENZIONE: se le proprieta di Persona sono private, la classe figlia Studente non puo accedervi
 *      direttamente, ma dovrà necessariamente passare dai get()/set()
 */

public class Studente extends Persona{

    // PROPRIETA':
    // la classe Studente  EREDITA tutte le proprieta di Persona.
    // INOLTRE le proprieta inserite direttamente in questa classe (STUDENTE), non appartengono alla classe padre (PERSONA)
    // infatti si può dire che uno Studente sia una Persona, ma non si può dire il contrario  
    private int classe;

    // costruttore
    // Per costruire un oggetto di tipo studente (che è figlio di Persona) dovrò prima costruire la persona
    // quindi il costruttore riceverà in questo caso 3 proprieta:
    // nome e eta verranno passate al costruttore della classe padre (Persona)
    // classe verrà gestita direttamente dal costruttore stesso (Studente)
    public Studente(String nome, int eta, int classe){
        // super() indica il costruttore della classe padre
        // siccome studente non sa gestire nome ed eta, le passa al costruttore di persona
        // che se ne occupa come meglio crede
        super(nome, eta);
        this.classe = classe;
    }

    
    // oltre alle proprieta eredito anche i metodi della classe padre,
    // infatti posso usare getters e setters di Persona
    // getters setters
    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }


    // abbiamo detto che una classe figlia eredita anche i metodi del padre.
    // tuttavia posso andare a sovrascrivere il metodo ereditato: OVERRIDE
    // OVERRIDE è un tipo di POLIMORFISMO dei metodi:
    // è necessario quando ho due metodi con la stessa firma ma in classi diverse (in rapporto di ereditarieta)
    @Override
    public String toString() {
        return "Studente ["+ super.toString() +", classe=" + classe + "]";
    }
    // super.toString() richiama il toString() della classe padre Persona

    
    



}
