import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String getSimbolo(int index) {
        switch (index) {
            case 1:
                return "T";
            case 2:
                return "G";
            case 3:
                return "C";
            case 4:
                return "F";
            case 5:
                return "D";
            case 6:
                return "R";
            case 7:
                return "H";
            default:
                return "?";
        }
    }
    public static String NumeroJeroglificos(int num, int index) {
        if (num < 10) {
            return getSimbolo(index).repeat(num);
        }

        int value = num % 10;
        String cadena = getSimbolo(index).repeat(value);
        return NumeroJeroglificos(num / 10, index + 1) + cadena;
    }

    public static void Test() {
        System.out.printf("Output %s, expected output %s\n", NumeroJeroglificos(11, 1), "GT");
        System.out.printf("Output %s, expected output %s\n", NumeroJeroglificos(200, 1), "CC");
        System.out.printf("Output %s, expected output %s\n", NumeroJeroglificos(1922, 1), "FCCCCCCCCCGGTT");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Test();

        try {
            int num = sc.nextInt();

            String res = NumeroJeroglificos(num, 1);

            System.out.println(res);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}