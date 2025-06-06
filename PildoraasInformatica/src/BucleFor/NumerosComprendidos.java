package BucleFor;
import java.util.Scanner;
public class NumerosComprendidos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*Escribe un programa que obtenga los números enteros comprendidos entre
        dos números introducidos por teclado y validados como distintos, el programa
        debe empezar por el menor de los enteros introducidos e ir incrementando de
        7 en 7.*/

        System.out.println("ingrese dos numeros enteros: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int menor=0;
        int mayor=0;
        if(num1 != num2){
            if(num1<num2){
                menor=num1;
                mayor=num2;
            }else{
                menor=num2;
                mayor=num1;
            }
            for (int i=menor; i<=mayor; i=i+7){
                System.out.print(i+" ,");
            }
        }else{
            System.out.println("ingrese 2 números distintos");
        }
    }
}
