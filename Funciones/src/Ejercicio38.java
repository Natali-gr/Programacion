import java.util.Scanner;
public class Ejercicio38 {
    /*Genera una calculadora con distintas funciones: suma, resta, multiplicación y
    división. El usuario podrá elegir en un menú inicial la operación, e introducirá los 2
    números para efectuarla. (Las distintas operaciones se realizaran cada una con una
    función).*/
// Función para sumar dos números
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Función para restar dos números
    public static double restar(double a, double b) {
        return a - b;
    }

    // Función para multiplicar dos números
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Función para dividir dos números
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return Double.NaN;  // Retorna "Not a Number" si se intenta dividir entre 0
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        // Menú inicial
        do {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            // Si el usuario selecciona "Salir", termina el programa
            if (opcion == 5) {
                System.out.println("¡Hasta luego!");
                break;
            }

            // Pedir los dos números
            System.out.print("Introduce el primer número: ");
            num1 = sc.nextDouble();
            System.out.print("Introduce el segundo número: ");
            num2 = sc.nextDouble();

            // Realizar la operación seleccionada
            switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    if (!Double.isNaN(resultado)) {
                        System.out.println("El resultado de la división es: " + resultado);
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
                    break;
            }
        } while (opcion != 5);

        sc.close();
    }
}
