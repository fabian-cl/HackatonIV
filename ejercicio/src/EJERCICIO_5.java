import java.util.Scanner;
public class EJERCICIO_5 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String frase="Hola mundo" ;

            System.out.println("¿Cuántas veces deseas saludar al mundo? :)");
            int num = scanner.nextInt();

            for (int i = 0; i < num; i++) {
                System.out.println(frase);
            }
            scanner.close();
    }
}
