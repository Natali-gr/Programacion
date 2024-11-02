import  java.util.Scanner;
public class Ejercicio57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ingresar un número
        System.out.print("Introduce un número: ");
        int limite = scanner.nextInt();

        int contador = 0;
        int suma = 0;

        System.out.println("Múltiplos de 3 entre 1 y " + limite + ":");
        for (int i = 1; i <= limite; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                contador++;
                suma += i;
            }
        }

        System.out.println("\nCantidad de múltiplos de 3: " + contador);
        System.out.println("Suma de múltiplos de 3: " + suma);
    }
}
