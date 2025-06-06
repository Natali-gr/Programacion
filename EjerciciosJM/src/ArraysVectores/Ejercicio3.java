package ArraysVectores;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Escribe un programa que almacene 6 números en un array y luego los muestre en orden inverso.

        int numeroArray[]={12,4,7,23,2,14};

        for (int i=0; i<numeroArray.length; i++){
            System.out.print(numeroArray[i]+" ");
        }

            System.out.println();

        for (int j=numeroArray.length-1; j>=0; j--) {
            System.out.print(numeroArray[j] + " ");
        }
    }
}
