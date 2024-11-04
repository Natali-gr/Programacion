import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear un array de 15 números
        int[] numeros = new int[15];

        // Leer los números por teclado y almacenarlos en el array
        System.out.println("Introduce 15 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Mostrar el contenido del array antes de la rotación
        System.out.println("\nArray antes de la rotación:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        // Rotar el array: guardar el último elemento y desplazar los demás
        int ultimo = numeros[numeros.length - 1]; // Guardar el último elemento
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1]; // Desplazar cada elemento a la derecha
        }
        numeros[0] = ultimo; // Colocar el último elemento en la primera posición

        // Mostrar el contenido del array después de la rotación
        System.out.println("\n\nArray después de la rotación:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}