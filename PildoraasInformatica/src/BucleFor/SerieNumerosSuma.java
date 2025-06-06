package BucleFor;
import java.util.Scanner;
public class SerieNumerosSuma {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*Escribe un programa que permita ir introduciendo una serie indeterminada
        de números mientras su suma no supere el valor 10000. Cuando esto último
        ocurra, se debe mostrar el total acumulado, el contador de los números
        introducidos y la media.*/

        int suma=0;
        int cont=0;
        int media=0;
        do{
            System.out.println("ingrese un número a sumar: ");
            int num=sc.nextInt();
            suma=suma+num;
            cont++;
        }while (suma<=100);

        media=suma/cont;
        System.out.println("el total acumulado es: "+suma);
        System.out.println("el número total de números introducidos han sido: "+cont);
        System.out.println("la media de los números es: "+media);
    }
}
