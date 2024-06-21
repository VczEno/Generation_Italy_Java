import java.util.Scanner;
public class ripasso_07
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        String nomeVero = "";
        System.out.println("Inserisci il tuo nome di battaglia");
        String nomeBattaglia = tastiera.nextLine();
        switch(nomeBattaglia.toLowerCase())
        {
            case "wolverine":
                    nomeVero = "Logan";
            break;
            case "ironman":
                    nomeVero = "Anthony";
            break;
        }
        //A questo punto del codice il valore di nomeBattaglia può essere qualunque.
        //Il valore di nomeVero può essere SOLO:
        //- ""
        //- Logan
        //- Anthony
        String ris;
        if(nomeVero.equals(""))
            ris = "Non ti conosco";
        else
            ris = "Nome vero: " + nomeVero;
        System.out.println(ris);
        tastiera.close();
    }
}