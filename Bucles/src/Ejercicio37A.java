import java.util.Scanner;

public class Ejercicio37A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
            System.out.println("el factorial de " + num + " es " + factorial);

    }
}
