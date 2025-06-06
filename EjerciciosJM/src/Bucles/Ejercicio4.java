package Bucles;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Escribe un programa para imprimir todos los alfabetos de la A a la Z.
        System.out.println("seleccione el orden del alfabeto :");
        System.out.println("opcion 1: de la A-Z o opción 2: de la Z-A");
        int opcion=sc.nextInt();

        if(opcion==1 || opcion==2) {
            if (opcion == 1) {
                for (char i = 'a'; i <= 'z'; i++) {

                    System.out.print(i + " ");
                }
            } else {
                for (char i = 'z'; i >= 'a'; i--) {
                    System.out.print(i + " ");
                }
            }
        }else{
            System.out.print("el número ingresado no es correcto");

        }
    }
}
