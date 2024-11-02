import java.util.Scanner;
public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitamos la base y exponente
        System.out.print("ingresa la base (número real): ");
        double base = sc.nextDouble();

        System.out.print("ingresa el exponente (entero positivo): ");
        int exponente = sc.nextInt();

        // Validamos que el exponente sea positivo
        if (exponente <= 0) {
            System.out.println("El exponente debe ser un entero positivo.");
        } else {
            System.out.println("\nPotencias de " + base + " con exponentes del 1 al " + exponente + ":");

            // Calculamos las potencias desde 1 hasta el exponente indicado
            double resultado = 1;
            for (int i = 1; i <= exponente; i++) {
                // Multiplicamos por la base para cada nuevo exponente
                resultado *= base;
                System.out.println("Exponente " + i + ": " + base + "^" + i + " = " + resultado);
            }
        }
    }
}
