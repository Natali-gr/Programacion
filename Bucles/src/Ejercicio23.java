import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pedir que ingrese un número entre 1 y 10
        System.out.println("ingrese un número comprendido entre 1 y 10");
        int num=sc.nextInt();

        //comprobar si está comprendido entre 1 y 10
       if(num>=1 && num<=10){

           //ejecutar la multiplicación
           for(int i=1; i<=10;i++) {
              int multiplicacion = num * i;
               System.out.println(num + "*" + i + "=" + multiplicacion);
           }
       }else{
           //mostrar mensaje si introduce otro número fuera del rango
           System.out.println("el número no está comprendido entre 1 y 10");
       }
    }
}
