import java.util.Scanner;

public class TrianguloRectanguloInvertidoDerecha {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int i, j,k;

        System.out.println("ingresa un número");
        int num = sc.nextInt();

        for (i=num; i>=1; i--) {

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
