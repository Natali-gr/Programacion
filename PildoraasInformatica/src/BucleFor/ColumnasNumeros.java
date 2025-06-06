package BucleFor;

import java.util.Scanner;

public class ColumnasNumeros {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
        los 5 primeros números enteros a partir de uno que se introduce por teclado.*/

        System.out.println("ingrese un número: ");
        int num=sc.nextInt();
        System.out.println("número \t cuadrado \tcubo:");

            for (int i =num; i<num+5 ; i++) {
               int cuadrado = i * i;
               int cubo = i * i * i;
                System.out.println(i+"         "+cuadrado+"          "+cubo);
            }
    }
}
