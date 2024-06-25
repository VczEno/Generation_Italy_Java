import java.util.ArrayList;
public class listDiList_01
{
       public static void main(String[] args)
       {
            ArrayList<String> frutta = new ArrayList<String>(); 
            ArrayList<ArrayList<String>> supermercato = new ArrayList<ArrayList<String>>();
            frutta.add("mele");
            frutta.add("fragole");
            supermercato.add(frutta);
            System.out.println(supermercato.get(0).get(1));
       }
}