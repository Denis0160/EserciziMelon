import javax.swing.*;
import java.util.Scanner;

public class Byte {
    public static void main(String[] args) {

        // Create a Scanner object for keyboard reading
        Scanner tastiera = new Scanner(System.in);

        // Declaration of variables
        String numero = "";
        boolean flagByte = true;
        int valChar = (int)'0'; // ASCII '0'
        char valInt = (char)49; //character '1'

        // Print variable values
        System.out.println(valChar); // Print 48 (valore ASCII di '0')
        System.out.println(valInt);  // Print '1'
        valChar = valInt - '0';       // Converte the character '1' in his number values 1
        System.out.println(valChar);  // print 1

        // Request for input from the user
        System.out.println("Inserisci un byte: ");
        numero = tastiera.nextLine();

        //check if the string is longer 8 character
        if (numero.length() != 8) {
            System.out.println("Non è un byte");
        } else {
            //check if evry character is 0 or 1
            for (int indice = 0; indice < numero.length(); indice++) {
                System.out.println(numero.charAt(indice));

                if (!(numero.charAt(indice) == '1' || numero.charAt(indice) == '0')) {
                    flagByte = false;
                }
            }

            //if evry characters are 0 or 1, procced
            if (flagByte) {
                System.out.println("È un byte");
                int valoreDecimale = 0;
                int baseBinaria = 1; // 2^0

                //Calculate the decimal value of the binary byte
                for (int indice = numero.length() - 1; indice >= 0; indice--) {
                    int bit = numero.charAt(indice) - '0';
                    valoreDecimale += bit * baseBinaria;
                    baseBinaria *= 2;
                }

                System.out.println("Valore decimale: " + valoreDecimale);
            } else {
                System.out.println("Non è un byte");
            }
            

        }
    }
}
