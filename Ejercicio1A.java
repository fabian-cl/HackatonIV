import java.util.Scanner;

public class Ejercicio1A {

    static int pedirAnio(int anio) {
        System.out.println("Introduce el anio "+ (anio+1));
        return new Scanner(System.in).nextInt();
    }

    static void calcularDistancia(int a, int c, int referencia) {
        System.out.println();
        int resultado = 0;
        resultado = (a - referencia == 1 || a - referencia == 0 ? 1: (a-referencia));
        boolean b = (a - referencia == 0 || c - referencia == 0
        || a + referencia == 0 || c  + referencia == 0);
        System.out.println("Resultado: "+resultado);
        if((a - referencia) > (c - referencia) && !b) {
            System.out.println("A está mas cerca");
        }else if((a - referencia) < (c - referencia) && !b) {
            System.out.println("C está mas cerca");
        }else if(b) {
            System.out.println("EMPATE");
        }
    }
    public static void main(String[] args) {
        int valorInferior = -10000;
        int valorSuperior = 10000;
        int casosDePrueba;
        int [] anios;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos casos de prubas vas a presentar");
        casosDePrueba = entrada.nextInt();

        if(casosDePrueba == 0) {
            System.out.println("Cada caso de pruba son tres numeros");
        }

        System.out.println();

        anios = new int[casosDePrueba];
        for (int i = 0; i < casosDePrueba; i++) {
            int anio = pedirAnio(i);
            while (anio > valorSuperior || anio < valorInferior) {
                anio = pedirAnio(i);
            }
            anios[i] = anio;
        }

        System.out.println(anios[0]);
        System.out.println(anios[1]);
        System.out.println(anios[2]);

        calcularDistancia(anios[0], anios[2], anios[1]);



        entrada.close();
    }
}
