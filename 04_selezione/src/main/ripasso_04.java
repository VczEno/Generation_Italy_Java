public class ripasso_04
{
    public static void main(String[] args)
    {
        String generePrefe = "pop";
        String ris = "Il mio artista preferito in ambito ";
        
        if(generePrefe.equalsIgnoreCase("rap"))
            ris += "rap è TEDUA";
        else if(generePrefe.equalsIgnoreCase("pop"))
            ris += "pop è ANNALISA";
        else if(generePrefe.equalsIgnoreCase("pianoforte"))
            ris += "pianoforte è ALLEVI";
        else
            ris = "Il mio genere preferito non rientra in quelli elencati";
        System.out.println(ris);
    }
}