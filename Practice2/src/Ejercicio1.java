import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Imprimir números del 1 al 10

        int i=0;

        while(i<10){
            i++;
            System.out.print(i);

            if(i<10){
                System.out.print(",");
            }else{
                System.out.print(".");
            }

        }
    }
}
