import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Realiza un programa que diga si un número introducido por teclado es par y/o
        divisible entre 5.*/

        System.out.print("ingrese un número: ");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.print("el número es par");
        }else if(num%5==0){
            System.out.print("el número es divisible entre 5 ");
        }
    }
}
