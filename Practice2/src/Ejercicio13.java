import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Ordenar dígitos de un número:
        Pide al usuario que introduzca un número, separa sus dígitos y ordénalos de menor a mayor.
        Ejemplo: Si el número es 531, debe devolver 135.*/

        System.out.print("ingrese un número: ");
        int num=sc.nextInt();

        boolean esNegativo = num< 0;
        if (esNegativo) {
            num = -num;
        }

        int numeroOrdenado = 0;

        for (int digito = 0; digito <= 9; digito++) {
            int temporal = num;
            while (temporal > 0) {
                int ultimoDigito = temporal % 10;
                if (ultimoDigito == digito) {
                    numeroOrdenado = numeroOrdenado * 10 + digito;
                }
                temporal /= 10;
            }
        }

        if (esNegativo) {
            numeroOrdenado = -numeroOrdenado;
        }

        System.out.println("Número ordenado: " + numeroOrdenado);
    }
}
