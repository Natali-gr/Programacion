package BucleFor;
import java.util.Scanner;

public class EjercicioFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* se pide el cálculo del factorial de un número introducido por el usuario.
         El factorial de un número es igual a ese número multiplicado por todos los que le preceden.
         Por ejemplo, el factorial de 5 es igual a 5x4x3x2x1, es decir, 120.*/

        System.out.println("ingrese un número para calcular su factorial: ");
        int num=sc.nextInt();

        int factorial=1;
        String acumulador=" ";

        for(int i=num; i>0; i--) {
            factorial = factorial * i;
            if (i > 1) {
                acumulador += i + "x";
            } else {
                acumulador += i;
            }
        }
        System.out.println("el factorial de "+num+" es:"+acumulador+"="+factorial);
    }
}
