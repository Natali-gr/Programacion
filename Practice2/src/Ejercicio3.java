import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Genera la tabla de multiplicar del número 2 usando un bucle while

        int i=0;
        int multiplicacion=0;

        //System.out.println("que tabla deseas? ");
        int tabla=sc.nextInt();
        while(i<10){
            i++;
            multiplicacion=i*tabla;
            System.out.println(i+" * "+tabla+" = "+multiplicacion);
        }
    }
}


//tarea: tabla de multiplicar del 1-5