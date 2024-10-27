import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        //pedimos que ingrese un número
        System.out.print("ingresa un número ");
        int num = sc.nextInt();

        // Generamos el triángulo
        for (int i = 1; i <= num; i++) {
            // se imprime los asteriscos en cada línea
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // da un salto de línea
            System.out.println();
        }
    }
}
