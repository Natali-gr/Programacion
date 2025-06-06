package Ejercicios3;
import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*Realizar un programa que pida como entrada un número decimal y lo muestre redondeado al entero más próximo.
    (Cuidado: si hacemos cast para pasar un double a int, no redondeamos, truncamos la parte decimal).*/

        System.out.print("Ingrese un número decimal: ");
        double num=sc.nextDouble();

        double redondeado=Math.round(num);
        System.out.print(redondeado);
    }
}
