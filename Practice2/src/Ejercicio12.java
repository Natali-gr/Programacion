import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*Serie de Fibonacci:
        Genera los primeros n números de la serie de Fibonacci, donde n es un valor que el usuario introduce.
        Ejemplo: Si n = 6, la salida es 0, 1, 1, 2, 3, 5.*/

        System.out.print("ingrese un valor: ");
        int num=sc.nextInt();

        int cont=0;
        while(cont != num){
            cont++;
            System.out.print(cont+" ,");
        }
    }
}
