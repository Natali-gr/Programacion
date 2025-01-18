import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Contar dígitos de un número:
        Pide al usuario que ingrese un número y cuenta cuántos dígitos tiene usando un bucle while.
        Ejemplo: Si el número es 12345, debe devolver 5.*/

        System.out.print("ingrese un número: ");
        int num=sc.nextInt();

        int digito=0;

            while(num>0){
                num=num/10;
                digito++;
            }

      System.out.print("el número introducido tiene "+digito+" digitos");
    }
}
