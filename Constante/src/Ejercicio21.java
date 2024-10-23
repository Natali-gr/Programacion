import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ingresamos dos números
        System.out.println("Ingrese 2 números: ");
        final int a = sc.nextInt();
        final int b = sc.nextInt();

        //evaluamos la condición
        final int mayor = (a > b) ? a : b;

        //mostramos el resultado
        System.out.println("mayor es " + mayor);
    }
}
