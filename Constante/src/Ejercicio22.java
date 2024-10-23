import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //solicitamos que ingrese dos números
        System.out.println("Ingrese el primer numero: ");
        final int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        final int num2 = sc.nextInt();

        //determinamos cual es mayor y menor
        final int menor= (num1 < num2) ? num1 : num2;
        final int mayor= (num1 < num2) ? num2 : num1;

        // Mostramos los números en orden ascendente
        System.out.println( menor + "-" + mayor);
    }
}
