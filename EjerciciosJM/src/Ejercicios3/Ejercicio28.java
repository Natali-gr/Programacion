package Ejercicios3;
import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  Igual que el programa anterior, pero esta vez la pirámide debe aparecer invertida, con el vértice hacia abajo.

        int i, j,k;

        System.out.println("ingrese el número de filas:");
        int num=sc.nextInt();

        for (i=num; i>=1; i--) {

            for ( j=num; j>i; j--) {
                System.out.print(" "); // Imprimir espacio
            }

            for ( k=1; k<=(2*i-1); k++) {
                System.out.print("*"); // Imprime asteriscos
            }
            System.out.println(); // Mueve a la siguiente línea
        }

    }
}
