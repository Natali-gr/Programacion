public class Ejercicio33 {
    /*Escribe una función que muestre por pantalla un triángulo como el del ejemplo.
    Deberá recibir dos parámetros: el carácter que se desea imprimir y el número de líneas
    del triángulo.*/
    public static void imprimirTriangulo(char c, int numLineas) {
        // Recorrer cada línea del triángulo
        for (int i = 0; i < numLineas; i++) {
            // Imprimir espacios antes del carácter
            for (int j = 0; j < numLineas - i - 1; j++) {
                System.out.print(" ");
            }
            // Imprimir el carácter en cantidad 2*i + 1
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(c);
            }
            // Salto de línea al final de cada fila
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Ejemplo de uso
        char caracter = 'a';
        int lineas = 4;

        imprimirTriangulo(caracter, lineas);
    }
}
