import java.util.Arrays;
public class Pila extends Lista{
    // Constructor que hereda de Lista y utiliza el constructor de la clase base
    public Pila() {
        super();
    }

    // Apilar un número (añadir al final de la lista, que es la cima de la pila)
    public void apilar(int numero) {
        insertarAlFinal(numero);
    }

    // Desapilar un número (retirar el último elemento de la lista, que es la cima de la pila)
    public int desapilar() {
        if (obtenerNumeroDeElementos() == 0) {
            throw new IllegalStateException("La pila está vacía, no se puede desapilar.");
        }
        int elemento = obtenerElemento(obtenerNumeroDeElementos() - 1);
        // Eliminar el último elemento de la lista
        eliminarElemento(obtenerNumeroDeElementos() - 1);
        return elemento;
    }

    // Obtener el elemento en la cima de la pila (último elemento insertado)
    public int cima() {
        if (obtenerNumeroDeElementos() == 0) {
            throw new IllegalStateException("La pila está vacía.");
        }
        return obtenerElemento(obtenerNumeroDeElementos() - 1);
    }

    // Método para eliminar un elemento de la lista en una posición específica
    private void eliminarElemento(int indice) {
        if (indice < 0 || indice >= obtenerNumeroDeElementos()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        // Desplazar los elementos hacia la izquierda desde el índice
        System.arraycopy(array, indice + 1, array, indice, size - (indice + 1));
        size--;
        array = Arrays.copyOf(array, size);  // Reducir el tamaño del array
    }

    // Mostrar la pila
    public void mostrarPila() {
        if (obtenerNumeroDeElementos() == 0) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.print("Pila: ");
            for (int i = 0; i < obtenerNumeroDeElementos(); i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
