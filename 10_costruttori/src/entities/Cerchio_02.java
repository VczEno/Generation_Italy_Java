package Oggetti_01.entities;

public class Cerchio_02
{
    public double raggio;
    public double diametro;
    public double circ;
    public double area;
    
   public Cerchio_02(double raggio)
    {
        this.raggio = raggio;
        this.diametro = raggio * 2;
        //All'interno del costruttore utilizzo i metodi area() e circ() per valorizzare le proprietà dell'oggetto
        //rispettivamente area e circ
        //Cosa succede in soldoni:
        //Dopo aver valorizzato this.raggio e this.diametro il costruttore si trova a dover valorizzare
        //anche circ e area. Rispetto a prima però queste due proprietà vengono valorizzate richiamando dei metodi.
        //Quindi quando il costruttore deve dare un valore a this.circ invece di calcolare direttamente il valore
        //interpella il metodo circ() affinché i calcoli vengano gestiti da lui.
        //Questa modalità ha due grandi pregi:
        //1 - Il costruttore non è più impegnato nel calcolo ma richiede che esso venga fatto da altri.
        //2 - Se c'è un problema con circ() basterà modificare circ() e non intervenire sul più delicato costruttore.
        this.circ = circ();
        this.area = area();
    }

    //Invece di valorizzare le proprietà dell'oggetto circ e area direttamente nel costruttore, decidiamo di
    //creare dei metodi ad hoc.
    public double area()
    {
        return this.raggio * this.raggio * 3.14;
    }

    public double circ()
    {
        return this.diametro * 3.14;
    }
    
    public String toString()
    {
        return  "Raggio: "          +   raggio      +   "cm\n"  +
                "Diametro: "        +   diametro    +   "cm\n"  +
                "Circonferenza: "   +   circ        +   "cm\n"  +
                "Area: "            +   area        +   "cm2"   ;
    }   
}