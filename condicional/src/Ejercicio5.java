import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        //pedir 2 números enteros
        System.out.println("ingrese 2 números enteros: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        //comparamos y mostramos de forma descendente
        if(a>b){
            System.out.println("los números de forma decreciente son: "+a+","+b);
        }else{
            if(b>a){
                System.out.println("los números de forma decreciente son: "+b+","+a);
            }else{
                System.out.println("son iguales");
            }
        }

    }

}
