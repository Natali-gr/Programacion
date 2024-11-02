import java.util.Scanner;

public class TrianguloRectanguloIzquierdo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num=sc.nextInt();

        int i,j;
        for(i=1; i<=num;i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
