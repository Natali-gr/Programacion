public class Ejercicio25 {
    /*Escribir una función calculaEdad que reciba como parámetros el año actual y el de
    nacimiento de una persona. La función debe devolver un valor entero con la edad,
    suponiendo que en el año en curso la persona ya ha cumplido años.*/
    public static int calculaEdad(int anioActual, int anioNacimiento) {
        return anioActual - anioNacimiento;
    }
    public static void main(String[] args) {
        int anioActual = 2025;
        int anioNacimiento = 1990;

        int edad = calculaEdad(anioActual, anioNacimiento);
        System.out.println("La edad es: " + edad);
    }
}
