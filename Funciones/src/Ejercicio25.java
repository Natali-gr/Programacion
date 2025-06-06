import java.util.FormatFlagsConversionMismatchException;

public class Ejercicio25 {
    /*Escribir una función calculaEdad que reciba como parámetros el año actual y el de
    nacimiento de una persona. La función debe devolver un valor entero con la edad,
    suponiendo que en el año en curso la persona ya ha cumplido años.*/

    public static void main(String[] args) {
        int anioActual = 2025;
        int anioNacimiento = 1990;

        int edad = calculaEdad(2025,1993);



        System.out.println("La edad es: " + edad);


    }


    public static int calculaEdad(int anioActual, int anioNacimiento) {
        return anioActual - anioNacimiento;
    }









}
