package Arrays;
import java.util.Scanner;
public class AlmacenarArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*En este ejercicio se pide al usuario que introduzca 10 números enteros por consola.
        Los números introducidos se almacenarán en un array.
        El programa imprime en consola cuántos números negativos, positivos y valores 0 hay en el array.
         */

        int[] numeros=new int[10];
        int positivos=0;
        int negativos=0;
        int ceros=0;

        System.out.println("ingrese 10 números enteros:");
        for(int i=0; i<10; i++){
            System.out.print("número :");
            numeros[i]=sc.nextInt();
        }
        for(int num: numeros){
            if(num>0){
                positivos++;
            }else if(num<0){
                negativos++;
            }else{
                ceros++;
            }
        }
        System.out.println("cantidad de números positivos: "+positivos);
        System.out.println("cantidad de números negativos: "+negativos);
        System.out.println("cantidad de números ceros: "+ceros);
    }
}
