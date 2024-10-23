import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        //solicitamos que ingrese un número decimal
        System.out.println("ingrese un número decimal");
        double num=sc.nextDouble();

        //comprobamos si es número es casi cero
        if (Math.abs(num)>0 && Math.abs(num)<1) {
            System.out.println("el número es casi cero");
        }else{
            System.out.println("el número no es casi cero");
        }
    }
}
