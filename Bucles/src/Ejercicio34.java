import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        //pedimos que ingrese un número
        System.out.print("ingresa el númerode filas del triángulo ");
        int fila = sc.nextInt();

        // Generamos el triángulo
        for (int i = 1; i <= fila; i++) {
            //calculamos el número inicial de la fila
            int num=2*i-1;

            // se imprime los núumeros en orden descendente
            for (int j = 0; j < i; j++) {
                System.out.print(num-2*j+" ");
            }
            // da un salto de línea
            System.out.println();
        }
    }
}
