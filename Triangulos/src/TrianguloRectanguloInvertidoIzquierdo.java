import java.util.Scanner;

public class TrianguloRectanguloInvertidoIzquierdo {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int i,j;

        System.out.println("ingresa un número");
        int num=sc.nextInt();

        for(i=num; i>=1; i--) {
            for (j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
