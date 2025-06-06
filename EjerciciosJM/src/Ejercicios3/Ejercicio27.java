package Ejercicios3;
import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Igual que el programa anterior, pero esta vez la pirámide estará hueca (se debe ver únicamente el contorno hecho con asteriscos).

        System.out.print("ingrese la altura de la pirámide: ");
        int altura = sc.nextInt();

        // Solicitamos el carácter con el que se pintará la pirámide
        System.out.print("ingresa el carácter para pintar la pirámide: ");
        char caracter = sc.next().charAt(0);

        System.out.println();

        // Pintamos la pirámide hueca
        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios antes de cada fila para centrar la pirámide
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }

            // Imprimir el borde de la pirámide
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == altura) {
                    // Pintar el borde izquierdo, el borde derecho o la base completa
                    System.out.print(caracter);
                } else {
                    // Espacio en el interior de la pirámide
                    System.out.print(" ");
                }
            }

            // Salto de línea al final de cada fila
            System.out.println();
        }
    }
}
