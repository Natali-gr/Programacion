package Ejercicios3;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Realiza un programa conversor de Mb a Kb.

        System.out.print("ingrese el numero de MB: ");
        int megabyte=sc.nextInt();

        int kilobyte=megabyte*1024;
        System.out.print("la conversión de MB A KB es: "+kilobyte);
    }
}
