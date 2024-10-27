import java.util.Scanner;

public class Ejercicio41B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i=0;
        do{
           if( i%5==0){
               System.out.print(i+" ,");
           }
            i++;
        }while(i<=100);

    }
}
