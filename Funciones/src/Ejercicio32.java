public class Ejercicio32 {
    /*Escribir una función que reciba como parámetro un array de enteros y modifique ese
    mismo array para darle la vuelta a todas sus posiciones. (La función no devuelve nada).*/
    public static void invertirArray(int[] array) {
        int inicio = 0;
        int fin = array.length - 1;

        // Intercambiar los elementos desde el inicio y el final hasta llegar al centro
        while (inicio < fin) {
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;
            inicio++;
            fin--;
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Array original:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Llamar a la función para invertir el array
        invertirArray(array);

        System.out.println("Array invertido:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
