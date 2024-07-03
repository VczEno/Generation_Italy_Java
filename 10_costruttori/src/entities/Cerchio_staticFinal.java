package Oggetti_01.entities;

public class Cerchio
{
    public double raggio;
    public double diametro;
    public double circ;
    public double area;

    //STATIC è una keyword che indica DI CLASSE.
    //Le proprietà all'interno di una classe modello possono essere di due tipi:
    //1 - Dell'oggetto, ovvero quelle viste finora che necessitano dell'oggetto per poter esistere ed essere richiamate.
    //2 - DI CLASSE, ovvero quelle che sono specifiche di una classe e quindi esistono a PRESCINDERE dall'esistenza o meno dell'oggetto.
    //Ragioniamo:
    //Come capisco se una proprietà è della classe oppure dell'oggetto?
    //Se io vi chiedessi, un raggio necessita di un cerchio oppure basta che esista la classe Cerchio?
    //  Serve l'oggetto perché la misura del raggio DIPENDE dal fatto che esista un cerchio quindi un oggetto di classe Cerchio.
    //Se vi chiedessi, il PGRECO dipende dal fatto che esista un cerchio oppure basta la Classe?
    //  Basta la classe perché il PGRECO è una proprietà indipendente dall'oggetto.
    //Un cerchio, ovvero un oggetto di tipo Cerchio, indipendentemente da raggio, diametro etc...
    //avrà implicitamente il PGRECO e quel valore sarà impostato a 3.14
    //NOTA BENE: per convenzione le proprietà di classe vengono scritte sempre con le lettere maiuscole.
    public static final double PGRECO = 3.14;
    //Per evitare che il valore di PGRECO venga sovrascritto da un metodo, dal main, da qualunque parte del programma
    //è necessario renderlo una proprietà di classe costante. Per farlo, oltre a static va aggiunto FINAL
    //Ora il valore di PGRECO potrà essere modificato solo alla riga 23 della classe Cerchio.
    //Se infatti ora controlliamo la riga 17 di main_Cerchio_01 notiamo che il programma da un errore relativo
    //al fatto che stiamo provando a dare un nuovo valore a una proprietà di classe final.
    //STATIC indica una proprietà di classe il cui valore può essere modificato.
    //STATIC FINAL indica una proprietà di classe il cui valore NON può essere modificato.
    //Un esempio di proprietà static e non final potrebbe essere il valore minimo del raggio
    //che diventa funzionale nel main: vedi riga 23 e successive.
    public static double RAGGIOMIN = 0;

    public Cerchio(double raggio)
    {
        this.raggio = raggio;
        this.diametro = raggio * 2;
        this.circ = this.diametro * PGRECO;
        this.area = this.raggio * this.raggio * PGRECO;
    }
    
    public String toString()
    {
        return  "Raggio: "          +   raggio      +   "cm\n"  +
                "Diametro: "        +   diametro    +   "cm\n"  +
                "Circonferenza: "   +   circ        +   "cm\n"  +
                "Area: "            +   area        +   "cm2"   ;
    }
}