import java.util.Random;
public class Ejercicio19 {
    /*Escribir la función int[] rellenapares(int longitud, int fin) que crea y devuelve un array ordenado de la longitud especificada,
    que se encuentra relleno con números pares aleatorios comprendidos en el rango desde 2 hasta fin (inclusive).*/
    public static int[] rellenapares(int longitud, int fin) {
        Random random = new Random();
        int[] arrayPares = new int[longitud];

        // Generar números pares aleatorios dentro del rango [2, fin]
        for (int i = 0; i < longitud; i++) {
            // Asegurarse de que el número sea par
            int numero = 2 * (random.nextInt((fin / 2) + 1) + 1); // Genera un par entre 2 y fin
            arrayPares[i] = numero;
        }

        return arrayPares;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int longitud = 5; // Longitud del array
        int fin = 20;     // Límite superior para los números aleatorios

        int[] pares = rellenapares(longitud, fin);

        // Imprimir el array generado
        System.out.println("Array con números pares aleatorios:");
        for (int num : pares) {
            System.out.print(num + " ");
        }
    }
}
