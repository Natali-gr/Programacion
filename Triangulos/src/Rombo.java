import java.util.Scanner;

public class Rombo {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingresa el número de filas para el rombo:  ");
        int filas = sc.nextInt();

        // Parte superior del rombo
        for (int i = 1; i <= filas; i++) {
            // Imprimir espacios para centrar los asteriscos
            for (int j =filas; j>i ; j--) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte inferior del rombo
        for (int i =filas-1; i >= 1; i--) {
            // Imprimir espacios para centrar los asteriscos
            for (int j =filas ; j>i ; j--) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
