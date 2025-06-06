package Ejercicios2;

import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*Escribe un programa que tome como entrada un número entero e indique que
        cantidad hay que sumarle para que el resultado sea múltiplo de 7. Un ejemplo:
        - A 2 hay que sumarle 5 para que el resultado (2 + 5 = 7) sea múltiplo de 7.
        - A 13 hay que sumarle 1 para que el resultado (13 + 1 = 14) sea múltiplo de 7.
        Si proporcionas como entrada el número 2 o el 13, la salida de la aplicación debe ser 5
        o 1, respectivamente.
                PISTA: El operador módulo puede ser muy útil para solucionar esta actividad.*/

        System.out.print("ingrese un número entero: ");
        int num=sc.nextInt();

        int mood=num%7;
        if(mood==0){
            System.out.print("ya es múltiplo de 7");
        }else {
            int faltante = 7-mood;
            System.out.print("a "+num+" le falta "+faltante+" para ser multiplo de 7");
        }
    }
}
