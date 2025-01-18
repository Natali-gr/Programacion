import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Invertir un número:
        Solicita al usuario un número entero y utiliza un bucle while para invertirlo.
        Ejemplo: Si el número es 1234, el programa debe devolver 4321.*/

        System.out.print("ingrese un número: ");
        int num=sc.nextInt();
        int numeroInvertido=0;

        while (num>0){

            int digito=num%10;
            numeroInvertido=numeroInvertido*10+digito;
            num=num/10;
        }
        System.out.print("número invertido: "+numeroInvertido);
    }
}
