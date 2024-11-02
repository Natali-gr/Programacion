import java.util.Scanner;

public class TrianguloNormal {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int i, j,k;

        System.out.println("ingrese el número de filas:");
        int num=sc.nextInt();

        for (i=1; i<=num; i++) {
            // Espacios de impresión
            for ( j=num; j>i; j--) {
                System.out.print(" "); // Imprime espacio
            }
            // Imprime asteriscos
            for ( k=1; k<=(2 * i-1); k++) {
                System.out.print("*");
            }
            System.out.println(); // se mueve a la siguiente línea
        }
    }
}
