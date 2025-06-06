import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Genera la tabla de multiplicar del número 2 usando un bucle while

        System.out.print("que tabla deseas? -> ");
        int tabla=sc.nextInt();

        System.out.println("tabla de multiplicar: ");
        tablaMultiplicar(tabla);
        System.out.println();


        System.out.println("imprimiendo suma recuperada "+funcionSuma(5,9));

    }

    public static int funcionSuma(int a, int b){
        int suma=0;
        suma=a+b;
        return suma;
    }


    public static void tablaMultiplicar(int numeroTabla){

        int i=0;
        int multiplicacion=0;

        while(i<10) {
            i++;
            multiplicacion = i * numeroTabla;
            System.out.println(i + " * " + numeroTabla + " = " + multiplicacion);
        }

    }

}

