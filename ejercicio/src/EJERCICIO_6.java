import java.util.Scanner;

public class EJERCICIO_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿A cuánta gente no conoce Tinín en la fiesta?");

        int gente = scanner.nextInt();

        for (int i = 0; i < gente; i++) {
            String linea = scanner.nextLine();
            if (linea.startsWith("Soy ")) {
                String nombre = scanner.nextLine();
                System.out.println("Hola " + nombre);
            } else {
                System.out.println("Debe empezar por soy ");
            }
        }
        scanner.close();
    }
}
