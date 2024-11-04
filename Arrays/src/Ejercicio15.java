import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear el array para almacenar los 10 números
        int[] numeros = new int[10];
        System.out.println("Introduce 10 números:");

        // Leer los 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar el contenido del array junto con sus índices
        System.out.println("\nContenido del array junto con los índices:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        // Crear arrays auxiliares para separar los números primos y no primos
        int[] primos = new int[10];
        int[] noPrimos = new int[10];
        int cuentaPrimos = 0;
        int cuentaNoPrimos = 0;

        // Clasificar los números en primos y no primos
        for (int num : numeros) {
            if (esPrimo(num)) {
                primos[cuentaPrimos++] = num; // Si es primo, agregar a primos
            } else {
                noPrimos[cuentaNoPrimos++] = num; // Si no es primo, agregar a noPrimos
            }
        }

        // Unir los arrays primos y no primos en el array original
        int index = 0;
        for (int i = 0; i < cuentaPrimos; i++) {
            numeros[index++] = primos[i]; // Poner los primos al principio
        }
        for (int i = 0; i < cuentaNoPrimos; i++) {
            numeros[index++] = noPrimos[i]; // Poner los no primos después
        }

        // Mostrar el array resultante
        System.out.println("\nArray con primos al principio y no primos después:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Si el número es divisible por algún otro, no es primo
            }
        }
        return true; // Si no se encontró ningún divisor, es primo
    }
}
