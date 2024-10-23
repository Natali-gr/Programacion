import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        // Solicitamos que ingrese un número decimal
        System.out.print("Introduce un número decimal: ");
        double numeroDecimal = sc.nextDouble();

        // Redondeamos el número al entero más próximo
        int numeroRedondeado = (int) Math.round(numeroDecimal);

        // Mostramos el resultado
        System.out.printf("El número redondeado es: "+numeroRedondeado);

    }
}
