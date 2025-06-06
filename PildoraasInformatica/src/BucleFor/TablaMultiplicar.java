package BucleFor;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Muestra la tabla de multiplicar de un número introducido por teclado.

        System.out.println("ingrese un número:");
        int num=sc.nextInt();

        int multiplicación=0;
        for(int i=1; i<=10; i++){
            multiplicación=num*i;
            System.out.println(num+"*"+i+"="+multiplicación);
        }
    }
}
