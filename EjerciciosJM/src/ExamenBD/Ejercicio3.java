package ExamenBD;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Muestra todos los números del 1 al 20 y, para un número dado por el usuario, imprime el cociente si ese número es divisible por el número del usuario.

        System.out.println("ingrese un número");
        int num= sc.nextInt();

        int i=1;
        int cociente;
        while(i <= 20) {
           if(i % num == 0){
               cociente= i/num;
               System.out.print(cociente + " ");
           }
           i++;
        }
    }
}
