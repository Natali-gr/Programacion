import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera nota: ");
        double primeraNota = sc.nextDouble();
        System.out.println("Ingrese la segunda nota: ");
        double segundaNota = sc.nextDouble();

        double media = (primeraNota + segundaNota) / 2;
        System.out.println("La media es: " + media);
    }
}
