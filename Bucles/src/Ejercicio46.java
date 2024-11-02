import java.util.Scanner;
public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos que introduzca un número
        System.out.print("ingresa un número entero: ");
        int num = sc.nextInt();

        // Mostramos el encabezado de la tabla
        System.out.println("\nNúmero\tCuadrado\tCubo");

        // se calcula y muestra número, cuadrado y cubo para los 5 primeros números consecutivos
        for (int i = num; i < num + 5; i++) {
            int cuadrado = i * i;
            int cubo = i * i * i;

            // Imprimir en columnas
            System.out.printf("%d\t\t%d\t\t\t%d\n", i, cuadrado, cubo);
        }
    }
}
