import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Imprimir números del 1 al 10

        int i=1;
        String resultado="";
        // String resultado="1,2,3,4,5,6,7,8,9";

        while(i<10){

            resultado=resultado +i+ ",";
            i++;

        }

        System.out.println(resultado+i+".");


    }
}
