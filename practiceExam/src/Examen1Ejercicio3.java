import java.util.InputMismatchException;
import java.util.Scanner;
public class Examen1Ejercicio3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("\nMenú de opciones:");
                System.out.println("1. Imprimir múltiplos de 5");
                System.out.println("2. Cuenta atrás");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");

                while (!sc.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número válido.");
                    sc.next();
                }
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        imprimirMultiplosDe5(sc);
                        break;
                    case 2:
                        cuentaAtras(sc);
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                }
            } while (opcion != 3);

            sc.close();
        }

        private static void imprimirMultiplosDe5(Scanner scanner) {
            int numero;
            System.out.print("Ingrese un número mayor o igual a 5: ");

            while (true) {
                try {
                    numero = scanner.nextInt();
                    if (numero >= 5) {
                        break;
                    } else {
                        System.out.print("El número debe ser mayor o igual a 5. Intente de nuevo: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.print("Error: Debe ingresar un número válido. Intente de nuevo: ");
                    scanner.next();
                }
            }

            System.out.println("Múltiplos de 5 hasta " + numero + ":");
            for (int i = 5; i <= numero; i += 5) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        private static void cuentaAtras(Scanner scanner) {
            int num1, num2;

            System.out.print("Ingrese el primer número: ");
            num1 = validarEntrada(scanner);

            System.out.print("Ingrese el segundo número: ");
            num2 = validarEntrada(scanner);

            if (num1 == num2) {
                System.out.println("Los números son iguales, no hay cuenta atrás.");
            } else {
                int mayor = Math.max(num1, num2);
                int menor = Math.min(num1, num2);

                System.out.println("Cuenta atrás desde " + mayor + " hasta " + menor + ":");
                for (int i = mayor; i >= menor; i--) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }

        private static int validarEntrada(Scanner scanner) {
            while (!scanner.hasNextInt()) {
                System.out.print("Error: Debe ingresar un número válido. Intente de nuevo: ");
                scanner.next();
            }
            return scanner.nextInt();
        }
}
