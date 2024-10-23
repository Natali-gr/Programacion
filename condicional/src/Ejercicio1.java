import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        //solicitamos que ingrese un número
        System.out.println("ingrese un número");
        int num=sc.nextInt();

        //comprobamos si es par o impar
        if (num%2==0) {
            System.out.println("es número par");
        }else{
            System.out.println("es número impar");
        }

    }
}
