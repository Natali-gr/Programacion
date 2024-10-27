import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);


        //pedimos que ingrese un número
        System.out.println("ingrese un número");
        int num=sc.nextInt();

        int contadorPrimos=0;

        //realizar desde el 2 hasta el número introducido
        for(int i=2; i<=num; i++){
            boolean esPrimo=true;

            //comprobamos si tiene divisores q no sean 1 y el mismo
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    esPrimo=false;
                }
            }//si es primo se incrementa el contador
            if(esPrimo){
                contadorPrimos++;
            }
        }//mostramos el resultado
        System.out.println("Hay "+contadorPrimos+" números primos entre 1 y "+num);
    }
}
