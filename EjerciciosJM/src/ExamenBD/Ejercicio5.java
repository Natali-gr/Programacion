package ExamenBD;
import java.util.Scanner;
public class Ejercicio5 {

public static int hallar_primos(int num) {
    // Imprime todos los números del 1 al 100 que tengan exactamente tres divisores.

    int cont = 0;
    for (int i = 2; i <= num; i++) {
        if (num % i == 0) {
            cont++;
        }
    }
    return cont;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cuadrado=0;

        for (int i=1; i<=10; i++) {
           int num= hallar_primos(i);
            if (num==1) {
                cuadrado=(int)(Math.pow(i,2));
                System.out.print(cuadrado + " ");
            }
        }
    }
}
