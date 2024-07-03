package Oggetti_01.main;
import Oggetti_01.entities.*;

public class main_Cerchio_01
{
    public static void main(String[] args)
    {
        Cerchio c2;
        double r = 10.5;
        c2 = new Cerchio(r);
        System.out.println("Riga 11:\n" + c2.toString());
        System.out.println("-----------------------------------------------------");
        Cerchio_02 c3;
        double r2 = 10.5;
        c3 = new Cerchio_02(r2);
        System.out.println("Riga 16:\n" + c3.toString());
        System.out.println("-----------------------------------------------------");
        Cerchio_03 c4;
        double r3 = 10.5;
        c4 = new Cerchio_03(r3);
        System.out.println("Riga 21:\n" + c4.toString());
    }
}