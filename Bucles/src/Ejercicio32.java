import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        //declaramos las variables
        int a=1;
        int b=1;

        //pedimos que ingrese un número
        System.out.println("ingrese un número: ");
        int num=sc.nextInt();

        //imprime los primeros dos números
        System.out.print(a);
        //continua mientras el siguiente número sea menor que el número introducido
        while(b<num){
            System.out.print(", "+b);
            int suma=a+b;
            a=b;
            b=suma;
        }

    }
}
