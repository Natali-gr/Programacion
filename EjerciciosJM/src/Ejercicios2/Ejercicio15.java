package Ejercicios2;
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Dado el siguiente polinomio de segundo grado:  𝑦 =𝑎𝑥2+ 𝑏𝑥+𝑐 crea un programa que pida los coeficientes a, b y c,
        // así como el valor de x, y calcula el valor correspondiente de y.

        System.out.print("ingrese tres coeficientes para a, b y c respectivamente: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.print("ingrese el valor de x: ");
        int x=sc.nextInt();

        int y= (a*x*2) + (b*x) + c;
        System.out.print("El valor de Y es : "+y);
    }
}
