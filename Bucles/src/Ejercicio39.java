import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //pedimos que ingrese un número
    System.out.println("ingrese un número");
    int num=sc.nextInt();

    //mientras el n{umero introducido sea mayor que 1 va ejecutando y mostrando los impares
    for(int i=num; i>=1; i-- ){
       if( i%2 !=0 ) {
           System.out.println(i + " ");
            }
       }
    }
}
