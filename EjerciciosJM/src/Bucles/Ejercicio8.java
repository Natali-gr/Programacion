package Bucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Escriba un programa para imprimir los valores ASCII.
        System.out.println("Seleccionar alguna de las siguientes opciones:  ");
        System.out.println(" 1: si quiere que se imprima caracteres ");
        System.out.println(" 2: si quiere se se imprima abecedario en minuscula  ");
        System.out.println(" 3: si quiere que se imprima abecedario en mayúsculas ");
        System.out.println(" 4: si quiere que se imprima vocales ");
        System.out.println(" 5: si quiere que se imprima números ");
        System.out.print("Opcion: ");
        int opcion = sc.nextInt();

        String caja = " ";
        char num = ' ';

        if(opcion>0 && opcion<=5){
            if (opcion == 1) {
                for (num = 33; num <= 47; num++) {
                    caja = caja + num + " ";
                }
            } else if (opcion == 2) {
                for (num = 97; num <= 122; num++) {
                    caja = caja + num + " ";
                }
            } else if (opcion == 3) {
                for (num = 65; num <= 90; num++) {
                    caja = caja + num + " ";
                }
            } else if (opcion == 4) {
                caja = " a e i o u ";
            }else {
                for (num = 48; num <= 57; num++) {
                    caja = caja + num + " ";
                }
            }
            System.out.print(caja);
        }else{
            System.out.print("opcion inválida ");
        }
    }
}
