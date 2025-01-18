public class Ejercicio30 {
    /*Realiza un programa que reciba un número entero n y devuelva un array de enteros
    con los n primeros números de la serie de Fibonacci.*/
    public static int[] generarFibonacci(int n) {
        if (n <= 0) {
            return new int[0]; // Si n es 0 o negativo, devolvemos un array vacío
        }

        int[] fibonacci = new int[n];
        fibonacci[0] = 0; // Primer número de la serie

        if (n > 1) {
            fibonacci[1] = 1; // Segundo número de la serie
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // Suma de los dos anteriores
            }
        }

        return fibonacci;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int n = 10; // Cambia este valor para generar más o menos números

        int[] serie = generarFibonacci(n);

        System.out.println("Los primeros " + n + " números de la serie de Fibonacci son:");
        for (int num : serie) {
            System.out.print(num + " ");
        }
    }
}
