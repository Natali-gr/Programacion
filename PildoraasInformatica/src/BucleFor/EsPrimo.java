package BucleFor;
import java.util.Scanner;
public class EsPrimo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*Escribe un programa que diga si un número introducido por teclado es o no
        primo. Un número primo es aquel que sólo es divisible entre él mismo y la
        unidad.*/

        System.out.print("ingrese un número: ");
        int num=sc.nextInt();
        boolean esPrimo=true;

        if(num<=1){
            esPrimo=false;
        }else{
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    esPrimo=false;
                    break;
                }
            }
        }
            if (esPrimo) {
                System.out.println(num + " es un número primo.");
            } else {
                System.out.println(num + " no es un número primo.");
        }

    }
}
