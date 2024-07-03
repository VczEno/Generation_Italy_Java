package Oggetti_01.entities;

public class Cerchio_03
{
    public double raggio;
    public double diametro;

    //In questo caso nel costruttore valorizziamo solo this.raggio e this.diametro ovvero le uniche due proprietà
    //dell'oggetto mentre per quanto riguarda i metodi area() e circ() decidiamo di trattarli in modo separato.
    public Cerchio_03(double raggio)
    {
        this.raggio = raggio;
        this.diametro = raggio * 2;
    }

    public double area()
    {
        return this.raggio * this.raggio * 3.14;
    }

    public double circ()
    {
        return this.diametro * 3.14;
    }
    
    //Nel toString() non verranno più richiamate le proprietà circ e area ma i metodi circ() e area() ovvero il risultato
    //dei rispettivi calcoli.
    //NOTA BENE: In questo caso gli oggetti di classe CERCHIO non hanno le proprietà circ e area ma il calcolo
    //dei valori di circonferenza e area viene demandato ad appositi metodi.
    //Se prima lo stato dell'oggetto comprendeva il valore delle proprietà (in un dato momento) raggio, diametro, circ e area
    //ora si limita a raggio e diametro.
    public String toString()
    {
        return  "Raggio: "          +   raggio          +   "cm\n"  +
                "Diametro: "        +   diametro        +   "cm\n"  +
                "Circonferenza: "   +   circ()          +   "cm\n"  +
                "Area: "            +   area()          +   "cm2"   ;
    }       
}