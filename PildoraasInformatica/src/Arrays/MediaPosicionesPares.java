package Arrays;
import java.util.Scanner;
public class MediaPosicionesPares {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola.
        Los números se almacenarán en un array y el programa calculará la media de los números introducidos en las posiciones pares del array.
        (Debes utilizar el operador módulo “%”).
         */

        int numeros[]=new int[10];
        int suma=0;
        int cuentaPares=0;

        System.out.println("ingrese 10 números enteros:");
        for(int i=0; i<10; i++){
            System.out.print("número: ");
            numeros[i]=sc.nextInt();
        }
        for (int i=0; i<10; i++){
            if(i%2==0){
                suma=suma+numeros[i];
                cuentaPares++;
            }
        }
        double media=(double) suma/cuentaPares;
        System.out.print("la media de los números pares del array es: "+media);
    }
}
