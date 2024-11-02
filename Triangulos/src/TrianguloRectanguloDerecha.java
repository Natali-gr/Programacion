import java.util.Scanner;

public class TrianguloRectanguloDerecha {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int i, j,k;

        System.out.println("ingresa un número");
        int num = sc.nextInt();

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

    }
}
