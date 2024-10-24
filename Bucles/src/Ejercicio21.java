import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=0;
        do{
         n=n%7;
            System.out.println(n);
        }while(n<=100);
    }
}
