import java.util.Scanner;
public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitamos que introduzca un número
        System.out.print("ingrese un número entero positivo: ");
        int num = sc.nextInt();

        // Verificamos que el número sea positivo
        if (num <= 1) {
            System.out.println("El número debe ser mayor que 1 ");
        } else {
            // Verificar si el número es primo
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            // Mostramos el resultado
            if (esPrimo) {
                System.out.println(num + " es un número primo.");
            } else {
                System.out.println(num + " no es un número primo.");
            }
        }
    }
}