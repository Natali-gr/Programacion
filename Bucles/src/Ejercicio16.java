import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //se declara la variable
            int num=0;
            do {
                //se pide ingresar un número
                System.out.println("Ingrese un número: ");
                num = sc.nextInt();

                //comprueba si es par
                if (num % 2 == 0) {
                    System.out.println("El número es par ");
                }else{
                    System.out.println("El número es impar ");
                }
                //comprueba si es positivo
                if (num > 0) {
                    System.out.println("El número es positivo ");
                }else{
                    System.out.println("El número es negativo ");
                }
                //realiza su cuadrado del número
                if (num !=0) {
                    num = num * num;
                    System.out.println("su cuadrado es: " + num);
                }
                //repite hasta que se introduzca 0
            }while ( num != 0) ;
    }
}
