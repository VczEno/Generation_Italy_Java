package entities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class VikNumeri {

    public static final int MIN = 0;
    public static final int MAX = 100;
    public static int[] numeri = { 9, 3, 42, 65, 2, 1, 1, 743, 0 };

    public static String percorso = "ESERCIZI\\esStatic\\src\\res\\file.txt";

    public static boolean CHECKNUMBER(double input) {
        return (input > MIN && input < MAX) ? true : false;
    }

    public static boolean NUMBERINARRAY(double input) {
        boolean risp = false;
        for (int n : numeri) {
            if (n == input)
                risp = true;
        }

        return risp;
    }

    public static boolean NUMBERINFILE(double input) throws FileNotFoundException {
        boolean risp = false;
        Scanner file = new Scanner(new File(percorso));
        String[] list;
        if (file.hasNextLine()) {
            list = file.nextLine().split(",");
            for (String n : list)
                if (Double.parseDouble(n) == input)
                    risp = true;
        }

        file.close();

        return risp;
    }

}
