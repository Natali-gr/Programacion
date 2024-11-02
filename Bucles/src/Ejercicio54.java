import java.util.Scanner;
public class Ejercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de filas de la pirámide
        System.out.print("Introduce el número de filas para la pirámide: ");
        int num = scanner.nextInt();

        // Imprime la pirámide
        for (int i = 1; i <= num; i++) {
            // Imprime espacios en blanco para centrar la pirámide
            for (int j = i; j < num; j++) {
                System.out.print("  ");
            }

            // Imprime la parte ascendente de la pirámide
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Imprime la parte descendente de la pirámide
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}
