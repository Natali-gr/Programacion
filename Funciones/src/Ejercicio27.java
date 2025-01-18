public class Ejercicio27 {
    /*Escribir una función que reciba como parámetros tres números enteros y devuelva
    un array de enteros ordenados de mayor a menor.*/
    public static int[] ordenarDescendente(int num1, int num2, int num3) {
        // Crear un array con los números
        int[] numeros = {num1, num2, num3};

        // Ordenar manualmente usando un algoritmo sencillo (burbuja para tres elementos)
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    // Intercambiar los elementos
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        return numeros;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int num1 = 15;
        int num2 = 30;
        int num3 = 10;

        int[] ordenados = ordenarDescendente(num1, num2, num3);

        System.out.println("Números ordenados de mayor a menor:");
        for (int numero : ordenados) {
            System.out.print(numero + " ");
        }
    }
}
