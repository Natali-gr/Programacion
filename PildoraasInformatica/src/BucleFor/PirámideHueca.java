package BucleFor;
import java.util.Scanner;
public class PirámideHueca {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.

        System.out.println("ingrese un número para la altura del triángulo:");
        int altura=sc.nextInt();
        System.out.println("ingrese un carácter para pintar la pirámide: ");
        char caracter=sc.next().charAt(0);

        //se imprime las vueltas que dará
        for( int i=1; i<=altura; i++) {
            //imprime los espacios
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }
            //imprime los caracteres
            for (int k = 1; k <= (2 * i - 1); k++) {
                //condición para imprimir huecos
                if (k == 1 || k == (2 * i - 1) || i == altura) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
