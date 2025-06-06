package Bucles;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* Escriba un programa para ingresar los números que el usuario desee y al final debe mostrar
        el recuento de positivos, negativos y ceros ingresados*/

        String mensaje;

        int positivos=0;
        int negativos=0;
        int cero=0;
        int contador=0;


        do {
            System.out.print("ingrese números : ");
            int num = sc.nextInt();
            System.out.print("quiere seguir? o ingrese salir para parar: ");
            sc.nextLine();
            mensaje=sc.nextLine();


            if(num>0){
                positivos++;
            } else if (num<0) {
                negativos++;
            }else{
                cero++;
            }
            contador++;

        }while( !(mensaje.equalsIgnoreCase("salir")));

        System.out.println();
        System.out.println("positivos: "+positivos);
        System.out.println("negativos: "+negativos);
        System.out.println("ceros: "+cero);
        System.out.print("total de números: "+contador);
    }

}
