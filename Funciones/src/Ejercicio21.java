public class Ejercicio21 {
    /*Definir la función int busca(int[] t, int clave) que realice la búsqueda del elemento clave en el array t
    (no ordenado) devolviendo el índice de la posición donde se ha encontrado el valor clave.*/
    public static void main(String[] args) {
        // Ejemplo de prueba
        int[] array = {5, 8, 12, 3, 7, 1};
        int clave = 3;

        int indice = busca(array, clave);
        if (indice != -1) {
            System.out.println("El valor " + clave + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El valor " + clave + " no se encuentra en el array.");
        }
    }
    public static int busca(int[] t, int clave) {
        // Recorremos el array para buscar la clave
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                return i;
            }
        }
        return -1;
    }
}
