import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // Elige un número de cuatro dígitos
        if (num > 9999 || num < 0) {
            System.out.println("Numero no valido");
            return;
        }

        int ascendente, descendente, resultado, iteraciones;
        iteraciones = 0;
        ascendente = 0;
        descendente = 0;

        while (num != 6174) {
            // 1. Comprobar que el numero no se repite
            String numStr = String.format("%04d", num);
            char primerDigito = numStr.charAt(0);
            boolean es_valido = false;
            for (int i = 1; i < numStr.length(); i++) {
                if (numStr.charAt(i) != primerDigito) {
                    es_valido = true;
                }
            }

            if (!es_valido) {
                return;
            }

            // Coloca sus dígitos en orden ascendente y en orden descendente
            char[] caracteres = numStr.toCharArray();
            Arrays.sort(caracteres);

            for (int i = 0; i < caracteres.length; i++) {
                descendente += (caracteres[caracteres.length - i] - '0') * 10;
                ascendente += (caracteres[i] - '0') * 10;
            }


            // Resta el menor al mayor
            //resultado = ascendente - descendente;
            //iteraciones++;
        }
    }
}