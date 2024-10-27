import java.util.Scanner;

public class Ejercicio37B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        int factorial=1;
        do {
            factorial = factorial * num;
            num = num - 1;
        }while (num > 0);
        System.out.println("el factorial de "+num+" es: "+factorial);

    }
}
