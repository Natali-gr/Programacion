import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        //pedimos que ingrese un número
        System.out.println("ingrese un número");
        int num = sc.nextInt();
        //declaramos las variables
        int a = 1, b = 1;

        //verificamos si pide al menos un término
        if (num >= 1) {
            System.out.print(a);
        }//se imprime el segundo término si el número es menor o igual q 2
        if (num >= 2) {
            System.out.print(", " + b);
        }
        //continuamos imprimiendo términos  hasta llegar al número introducido
        for (int i = 3; i <= num; i++) {
            int suma=a+b;
            System.out.print(", "+suma);
            a=b;
            b=suma;
        }
    }
}
