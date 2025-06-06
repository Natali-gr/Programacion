package BucleFor;
import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("ingrese el número de términos q se quiere mostrar de fibonacci: ");
        int num=sc.nextInt();

        int a=0;
        int b=1;
        for(int i=a; i<num; i++){
            System.out.print(a+" ,");
            int suma=a+b;
            a=b;
            b=suma;
        }
    }
}
