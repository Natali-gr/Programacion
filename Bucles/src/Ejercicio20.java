import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            System.out.print(i+ " ");
        }
    }
}
