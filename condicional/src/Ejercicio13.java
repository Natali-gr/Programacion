import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        if (numero % 5 == 0) {
            System.out.println("El número es divisible entre 5.");
        } else {
            System.out.println("El número no es divisible entre 5.");
        }

        sc.close();
    }
}
