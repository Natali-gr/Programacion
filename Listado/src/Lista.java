import java.util.Arrays;
public class Lista {
    public int[] array;
    public int size;

    public Lista() {
        array = new int[0];
        size = 0;
    }

    public int obtenerNumeroDeElementos() {
        return size;
    }

    public void insertarAlFinal(int numero) {
        // Redimensionar el array cuando sea necesario
        array = Arrays.copyOf(array, size + 1);
        array[size] = numero;
        size++;
    }

    public void insertarAlPrincipio(int numero) {
        // Redimensionar el array cuando sea necesario
        array = Arrays.copyOf(array, size + 1);
        // Desplazar los elementos hacia la derecha
        System.arraycopy(array, 0, array, 1, size);
        array[0] = numero;
        size++;
    }

    public void insertarEnIndice(int indice, int numero) {
        if (indice < 0 || indice > size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        array = Arrays.copyOf(array, size + 1);
        // Desplazar los elementos hacia la derecha a partir del índice
        System.arraycopy(array, indice, array, indice + 1, size - indice);
        array[indice] = numero;
        size++;
    }

    public void añadirLista(Lista otraLista) {
        for (int i = 0; i < otraLista.size; i++) {
            insertarAlFinal(otraLista.array[i]);
        }
    }

    public int obtenerElemento(int indice) {
        if (indice < 0 || indice >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return array[indice];
    }

    public int buscarNumero(int numero) {
        for (int i = 0; i < size; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    public void mostrarElementos() {
        if (size == 0) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.print("Elementos de la lista: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static Lista concatena(Lista l1, Lista l2) {
        // Crear una nueva lista para almacenar la concatenación
        Lista nuevaLista = new Lista();

        // Añadir los elementos de l1 a la nueva lista
        for (int i = 0; i < l1.size; i++) {
            nuevaLista.insertarAlFinal(l1.array[i]);
        }

        // Añadir los elementos de l2 a la nueva lista
        for (int i = 0; i < l2.size; i++) {
            nuevaLista.insertarAlFinal(l2.array[i]);
        }

        return nuevaLista;
    }
    // Método equals() para comparar dos listas
    @Override
    public boolean equals(Object obj) {
        // Verificar si el objeto es una instancia de Lista
        if (this == obj) {
            return true;  // Son el mismo objeto
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;  // El objeto no es de la clase Lista
        }

        Lista otraLista = (Lista) obj;

        // Verificar si las listas tienen el mismo tamaño
        if (this.size != otraLista.size) {
            return false;
        }

        // Verificar si los elementos de las listas son iguales y en el mismo orden
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != otraLista.array[i]) {
                return false;
            }
        }

        return true;
    }
}
