import java.util.Scanner;
public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitamos que ingrese un número entero positivo
        System.out.print("ingrese un número entero positivo: ");
        int num= sc.nextInt();

        // Verificamos que el número sea positivo
        if (num <= 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            // Calcular la suma de los 100 números siguientes
            int suma = 0;
            for (int i = 1; i <= 100; i++) {
                suma += num + i;
            }

            // Mostrar el resultado
            System.out.println("La suma de los 100 números siguientes es: " + suma);
        }
    }
}
