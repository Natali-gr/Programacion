import java.util.Scanner;
import java.util.Random;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Generar 100 números aleatorios entre 0 y 20
        int[] numeros = new int[100];
        System.out.println("Números generados:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(21); // Genera números entre 0 y 20
            System.out.print(numeros[i] + " ");
        }

        // Pedir los valores a cambiar
        System.out.println("\n\nIntroduce el valor a reemplazar:");
        int valor1 = sc.nextInt();
        System.out.println("Introduce el nuevo valor:");
        int valor2 = sc.nextInt();

        // Cambiar las ocurrencias de valor1 por valor2
        System.out.println("\nLista con cambios:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor1) {
                System.out.print("\"" + valor2 + "\" "); // Mostrar entrecomillado
            } else {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
