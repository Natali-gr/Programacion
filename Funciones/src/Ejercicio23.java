import java.util.Random;
public class Ejercicio23 {
    /*Escribe la función void desordenar(int[] t) que cambia de forma aleatoria los elementos contenidos en el array t.
    Si el array estuviera ordenado, dejaría de estarlo.*/
    public static void main(String[] args) {
        // Ejemplo de prueba
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println("Array antes de desordenar:");
        imprimirArray(array);

        desordenar(array);

        System.out.println("Array después de desordenar:");
        imprimirArray(array);
    }

    public static void desordenar(int[] t) {
        Random random = new Random();

        for (int i = t.length - 1; i > 0; i--) {
            // Generamos un índice aleatorio entre 0 y i
            int j = random.nextInt(i + 1);

            // Intercambiamos los elementos en las posiciones i y j
            int temp = t[i];
            t[i] = t[j];
            t[j] = temp;
        }
    }
    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
