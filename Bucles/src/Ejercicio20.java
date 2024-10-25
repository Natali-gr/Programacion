import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //se pide ingresr un número
        System.out.println("Ingrese un número: ");
        int num=sc.nextInt();

        //cuenta los números del 1 al número introducido
        for(int i=1;i<=num;i++){
            System.out.print(i+ " ");
        }
    }
}
