import java.util.Scanner;

public class TrianguloVerticeDerecha {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int i, j,k;

        System.out.println("ingrese el número de filas:");
        int num=sc.nextInt();

        for (i=1; i<=num; i++) {

            for ( j=num; j>i; j--) {
                System.out.print(" "); // Imprime espacio
            }
            // Imprimimos asteriscos
            for ( k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println(); // se mueve a la siguiente línea
        }

        for (i=num-1; i>=1; i--) {

            for ( j=num; j>i; j--) {
                System.out.print(" "); // Imprime espacio
            }

            for ( k=1; k<=i; k++) {
                System.out.print("*"); // Imprime asteriscos
            }
            System.out.println(); // Mueve a la siguiente línea
        }
    }
}
