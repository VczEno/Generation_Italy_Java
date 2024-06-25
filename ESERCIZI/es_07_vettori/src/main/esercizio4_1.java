package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class esercizio4 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner kb = new Scanner(System.in);
        Scanner file = new Scanner(new File("ESERCIZI\\es_07_vettori\\src\\res\\es4_credenziali.txt"));
        String userName = file.nextLine(); // Us3rNam3
        String passWord = file.nextLine(); // Pa$$w0rd
        file.close();
        String userNameInput;
        String passWordInput;
        double balance = 1000;
        int withdrawFee = 1;
        int depositFee = 2;
        int input;
        double value;
        String iban; // IT1234567891234567891230000 , IT1234567891234567891200000
        String[] ibanSplit;
        boolean ibanZeroCheck = false;

        System.out.println("Benvenuto sul portale di JavaBank.Per accedere inserisci le tue credenziali:\n");

        /*
         * do {
         * System.out.println("Username:\n");
         * userNameInput = kb.nextLine();
         * System.out.println("\nPassword:\n");
         * passWordInput = kb.nextLine();
         * if (!userName.equals(userNameInput) || !passWord.equals(passWordInput))
         * System.out.println("\nERRORE! Credenzieli errate, riprovare.\n");
         * } while (!userName.equals(userNameInput) || !passWord.equals(passWordInput));
         */

        System.out.println("\nScegliere l'operazione tra le seguenti:\n1)Prelievo\n2)Deposito\n3)Bonifico\n");
        input = Integer.parseInt(kb.nextLine());

        switch (input) {
            case 1:
                System.out.println("Inserire la cifra dal prelevare\n");
                value = Double.parseDouble(kb.nextLine());
                if ((value + 1) > balance)
                    System.out.println("ERRORE! Cifra superiore al saldo");
                else
                    balance -= (value + 1);

                break;
            case 2:
                System.out.println("Inserire la cifra da depositare\n");
                value = Double.parseDouble(kb.nextLine());
                if ((balance - 2 + value) > 0)
                    balance += (value - 2);
                else
                    System.out.println("ERRORE!");

                System.out.println("Saldo " + balance);

                break;
            case 3:
                System.out.println("Inserire l'iban del beneficiario\n");
                iban = kb.nextLine().trim();

                ibanSplit = iban.split("");

                if (iban.length() == 27) {
                    if (iban.substring(0, 2).equalsIgnoreCase("IT")) {
                        for (int i = 0; i < ibanSplit.length - 4; i++) {
                            if (ibanSplit[i].equals("0") && iban.substring(i, i + 5).equals("00000"))
                                ibanZeroCheck = true;
                        }

                        if (ibanZeroCheck) {
                            System.out.println("Inserire l'importo del bonifico\n");
                            value = Double.parseDouble(kb.nextLine().trim());
                            if ((value) < balance) {
                                balance -= value;
                                System.out.println("Bonifico inviato con successo!\nSaldo: " + balance);
                            }

                            else
                                System.out.println("ERRORE! Cifra superiore al saldo");

                        } else {
                            System.out.println("IBAN non valido, mancano gli zeri");
                        }

                    } else {
                        System.out.println("ERRORE! IBAN STRANIERO " + iban.substring(0, 2));
                    }

                } else {
                    System.out.println("IBAN non valido, lunghezza errata");
                }

                break;

            default:
                break;
        }
    }

}
