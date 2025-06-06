package BucleFor;

import java.util.Scanner;

public class CuentaDigitos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.

        System.out.println("ingrese un número: ");
        int num=sc.nextInt();

        String numero=Integer.toString(num);
        int contador=0;
        for(int i = 0; i< numero.length(); i++){
            contador++;
        }
        System.out.println("el número tiene "+contador+" digitos");
    }
}
