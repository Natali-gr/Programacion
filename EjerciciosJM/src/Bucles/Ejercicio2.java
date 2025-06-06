package Bucles;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Escribe un programa para imprimir todos los números naturales al revés.

        System.out.print("Ingrese un número: ");
        int num=sc.nextInt();

        /*for(int i=num; i>=1; i--){
            System.out.print(i+" ");
        }*/
       /*int i=num;
        while(i>=1){
            System.out.print(i+" ");
            i--;
        }*/
       int i=num;
        do{
            System.out.print(i+" ");
            i--;
        }while(i>=1);

    }
}
