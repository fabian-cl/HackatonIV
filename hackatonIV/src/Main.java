import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arrayNum = new int[5];
        int[] arrayValores = {0, 1, 2, 3, 4, 5};

        Random aleatorio = new Random();
        int suma = 0;

        // Generar números aleatorios
        for (int i = 0; i < arrayNum.length; i++) {
            int posNumAleatorio = aleatorio.nextInt(arrayValores.length);
            arrayNum[i] = arrayValores[posNumAleatorio];
            suma += arrayNum[i]; // acumula la suma
        }

        // Mostrar números generados
        System.out.print("Números aleatorios: ");
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + " ");
        }

        // Mostrar suma total
        System.out.println("\nLa suma de los números aleatorios es: " + suma);
    }
}
