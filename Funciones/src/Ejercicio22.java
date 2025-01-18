import java.util.ArrayList;
public class Ejercicio22 {
    /*Realiza la función int[] buscaTodos(int[] t, int clave)
    que crea y devuelve un array con todos los índices de los elementos donde se encuentra la clave de búsqueda.
    En el caso de que clave no se encuentre en el array t, la función devolverá un array vacio.*/
    public static int[] buscaTodos(int[] t, int clave) {
        // Primero, contar cuántas veces aparece la clave para determinar el tamaño del array resultante
        int contador = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                contador++;
            }
        }

        // Si no se encontró la clave, devolver un array vacío
        if (contador == 0) {
            return new int[0];
        }

        // Crear un array para almacenar los índices de las ocurrencias
        int[] indices = new int[contador];
        int index = 0;

        // Recorrer el array t y almacenar los índices donde aparece la clave
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                indices[index] = i;
                index++;
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] t = {4, 7, 2, 9, 7, 5, 7};
        int clave = 7;

        int[] indices = buscaTodos(t, clave);

        if (indices.length > 0) {
            System.out.print("La clave " + clave + " se encuentra en los índices: ");
            for (int indice : indices) {
                System.out.print(indice + " ");
            }
        } else {
            System.out.println("La clave " + clave + " no se encuentra en el array.");
        }
    }
}

