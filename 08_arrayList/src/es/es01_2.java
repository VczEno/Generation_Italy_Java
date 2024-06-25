package es;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class es01_2 {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> tappeViaggio = new ArrayList<>();
        Scanner file = new Scanner(new File("08_arrayList\\src\\res\\tappe.txt"));

        while (file.hasNextLine()) {
            tappeViaggio.add(file.nextLine());
        }

        file.close();

        for (int i = 0; i < tappeViaggio.size(); i++) {
            System.out.println("tappa n° " + (i + 1) + " - " + tappeViaggio.get(i));
        }
        for (String tappa : tappeViaggio) {
            System.out.println("tappa - " + tappa);
        }

    }
}
