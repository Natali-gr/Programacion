package ExamenBD;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pide un número al usuario y muestra todos sus divisores (números por los que se puede dividir exactamente).

        System.out.print("ingrese un número: ");
        int num =sc.nextInt();

        int divisor=1;
        String divisores1=" ";
        String divisores2=" ";

        while (num >= divisor) {
            if(num % divisor == 0){
               divisores1= divisores1 + divisor +" ";
            }else {
                divisores2= divisores2 + divisor + " ";
            }
         divisor++;

        }
        System.out.print("son divisores:" +divisores1 );
        System.out.println();
        System.out.print("No son divisores:" +divisores2 );
    }
}
