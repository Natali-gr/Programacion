import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //se declara e inicializan las variables
        int edad=0;
        int sumarEdad=0;
        int contador=0;
        int mayorEdad=0;

        //se pide ingresar las edades
        System.out.println("Ingrese las edades de los alumnos (ingresa un número negativo para finalizar) : ");

        //se reoite el bucle si la edad es mayor o igual a cero
        while(edad >=0 ){
            System.out.println("edad: ");
            edad=sc.nextInt();

            //se suma la edad ingresada a la suma total
            if (edad >=0 ){
                sumarEdad=sumarEdad+edad;
                contador++;

                //se cuenta si es mayor de edad
                if (edad >=18 ){
                    mayorEdad++;
                }
            }
        }
        //se calcula la media
        if (contador >0){
            double mediaEdad= (double) sumarEdad/contador;

            //se muestra los resultados
            System.out.println("Resultados:");
            System.out.println("Suma de las edades: " + sumarEdad);
            System.out.println("Número de alumnos: " + contador);
            System.out.println("Media de las edades: " + mediaEdad);
            System.out.println("Alumnos mayores de edad: " + mayorEdad);
        }
    }
}
