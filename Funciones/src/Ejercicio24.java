import java.util.Random;
public class Ejercicio24 {
    /*Modifica el ejercicio anterior para que la función no modifique el array que se pasa como parámetro y,
    en su lugar, cree y devuelva una copia del array donde se han desordenado los valores de los elementos.*/
    public static int[] desordenar(int[] t) {
        // Crear una nueva copia del array t
        int[] tDesordenado = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            tDesordenado[i] = t[i];
        }

        Random random = new Random();

        // Recorrer el array desordenado de atrás hacia adelante
        for (int i = tDesordenado.length - 1; i > 0; i--) {
            // Elegir un índice aleatorio entre 0 y i (inclusive)
            int j = random.nextInt(i + 1);

            // Intercambiar los elementos tDesordenado[i] y tDesordenado[j]
            int temp = tDesordenado[i];
            tDesordenado[i] = tDesordenado[j];
            tDesordenado[j] = temp;
        }

        return tDesordenado;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] t = {1, 2, 3, 4, 5, 6};

        System.out.println("Array original:");
        for (int num : t) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Llamar a la función desordenar, que devuelve una copia desordenada
        int[] tDesordenado = desordenar(t);

        System.out.println("Array original después de desordenar (sin cambios):");
        for (int num : t) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Array desordenado (copia):");
        for (int num : tDesordenado) {
            System.out.print(num + " ");
        }
    }
}
