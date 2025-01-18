import java.util.Scanner;

public class Ejercicio11_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("ingresa primer numero ");
        int num1=sc.nextInt();
        System.out.print("ingresa segundo numero ");
        int num2=sc.nextInt();
        // 1 y 10 - 5/2,3,4,5
        int cont=0;

        int i;
        // 1 al 3

        for(i=num1; i<=num2; i++){
            int columna=1;

            while(columna<=i){

                if(i%columna==0){
                    cont++;
                }
                columna++;
            }

            if(cont==2){
                System.out.print(i+", ");

            }
            cont=0;
        }


    }
}
