import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Calcula el MCD (Máximo Común Divisor):
        Solicita dos números al usuario y usa un bucle while para calcular su MCD utilizando el algoritmo de Euclides.
        Ejemplo: Para 56 y 98, el MCD es 14.*/

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        while (num2 != 0) {
            int resto = num1 % num2;
            num1 = num2;
            num2 = resto;
        }

        System.out.println("El MCD es: " + num1);
    }
}
