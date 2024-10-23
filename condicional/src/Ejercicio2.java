import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        //pedir que ingrese 2 números
        System.out.println("ingrese 2 números");
        int a=sc.nextInt();
        int b=sc.nextInt();

        //comprobamos si son iguales o no
        if(a==b) {
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }
    }
}
