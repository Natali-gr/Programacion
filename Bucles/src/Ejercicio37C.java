import java.util.Scanner;

public class Ejercicio37C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        int factorial = 1;
        while (num > 0) {
            factorial = factorial * num;
            num=num-1;
        }
        System.out.println("el factorial de "+num+" es "+factorial);
    }
}
