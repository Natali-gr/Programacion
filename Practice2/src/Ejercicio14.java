import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Potencias de 2:
        Genera las primeras n potencias de 2, donde n es un número introducido por el usuario.
        Ejemplo: Si n = 4, el programa imprime 1, 2, 4, 8.*/

        System.out.print("ingresa un número: ");
        int num=sc.nextInt();

        int potencia = 1;
        int i = 0;

        System.out.print("Las primeras " + num + " potencias de 2 son: ");
        while (i < num) {
            System.out.print(potencia);
            if (i<num-1){
                System.out.print(",");
            }
            potencia *= 2;
            i++;
        }
    }
}
