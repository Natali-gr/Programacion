import java.util.Scanner;

public class Ejercicio11_1 {




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // 10
        // 1 y 10 - 5/2,3,4,5
        //                  x

        System.out.print("ingrese un número: " );
        int num=sc.nextInt();
        // 5

        //int cont=0;
        boolean validador=false;

        for(int i=2; i<=num; i++){
           if( num%i==0){
             // cont++;
               validador=true;
           }
        }

        if (validador){
            System.out.print("es primo");
        }else{
            System.out.print("no es primo");
        }


    }
}
