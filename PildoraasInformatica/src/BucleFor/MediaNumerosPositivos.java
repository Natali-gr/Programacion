package BucleFor;

import java.util.Scanner;

public class MediaNumerosPositivos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*Escribe un programa que calcule la media de un conjunto de números positivos
        introducidos por teclado. A priori, el programa no sabe cuántos números se
        introducirán. El usuario indicará que ha terminado de introducir los datos
        cuando meta un número negativo.*/

        int suma=0;
        int cont=0;

            System.out.println("ingresa un número positivo y para finalizar un negativo: ");
            System.out.println("numero: ");
            int num = sc.nextInt();

            while(num >= 0) {
                suma = suma + num;
                cont++;

                System.out.println("numero: ");
                num = sc.nextInt();
            }
            if (cont>0) {
                double media=(double) suma/cont;
                System.out.println("la media es: "+media);
        }
    }
}
