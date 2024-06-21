public class String_extra_02
{
    public static void main(String[] args)
    {
        //.replace()
        //Come si evince dal nome, rimpiazza, sostituisce una stringa con un'altra.
        String parola = "CIAO";
        System.out.println(parola);
        parola = parola.replace("A", "U");
        System.out.println(parola);

        //Vuoi la prima lettera maiuscola
        //Non sai quale parola ti arriva...
        parola = " mario   "; //-> "Mario"
        System.out.println("Parola che mi arriva: _" + parola + "_");
        //Elimino gli spazi vuoti prima e dopo la parola
        parola = parola.trim();
        System.out.println("Parola dopo .trim(): _" + parola + "_");
        //A questo punto devo ottenere la prima lettera della parola.
        String[] vParola = parola.split("");
        //vParola[0] = "m";
        //vParola[1] = "a";
        //vParola[2] = "r";
        //vParola[3] = "i";
        //vParola[4] = "o";
        String ris = "";
        for(int i = 0; i < vParola.length; i++)
        {
            if(i == 0)
                ris += vParola[i].toUpperCase();
            else
                ris += vParola[i];
        }
        System.out.println("Parola con la prima maiuscola: " + ris);
        //Una volta ottenuta la parola con la prima lettera maiuscola e inserita all'interno di ris
        //applico la funzione delle String .replace() alla quale dico di sostituire l'intero valore della variabile
        //parola con il valore di ris.
        //parola = parola alla quale è stato sostituito il valore iniziale con ris
        System.out.println("Parola prima del replace: " + parola);
        parola = parola.replace(parola,ris);
        System.out.println("Parola dopo il replace: " + parola);
    }   
}