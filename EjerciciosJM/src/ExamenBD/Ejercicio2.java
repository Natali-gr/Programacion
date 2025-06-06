package ExamenBD;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Pide dos números al usuario y verifica si el segundo es divisor del primero.

        System.out.println("Ingrese 2 números:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a % b == 0) {
        System.out.println(b+ " es divisor de "+a);
        }else{
            System.out.println(b+" no es divisor de "+a);
        }
    }
}
