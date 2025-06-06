package BucleFor;
import java.util.Scanner;
public class NumeroAlRevés {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /* Realiza un programa que pida un número por teclado y que luego muestre ese
        número al revés */

        System.out.println("ingrese un número: ");
        int num=sc.nextInt();

        int numReverso=0;
        int changed=num;
        while(changed !=0){
            int digito=changed %10;
            numReverso=numReverso*10+digito;
            changed=changed/10;
        }
        System.out.println("número al revés: "+numReverso);
    }
}
