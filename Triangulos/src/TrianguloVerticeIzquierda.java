import java.util.Scanner;

public class TrianguloVerticeIzquierda {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int i, j;

        System.out.println("ingrese el número de filas:");
        int num=sc.nextInt();

        // Parte ascendente del triángulo
        for ( i = 1; i <=num; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte descendente del triángulo
        for ( i =num-1; i >= 1; i--) {
            for ( j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
