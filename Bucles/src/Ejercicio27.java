import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int cantidadAlumnos = 6;
    int aprobados = 0;
    int suspensos = 0;
    int contador = 0;

        // pedimos las calificaciones
        while (contador < cantidadAlumnos) {
        System.out.print("ingresa la calificación del alumno: ");
        int calificacion = sc.nextInt();

        // comprobamos si el alumno está aprobado o suspenso
        if (calificacion >= 5) {
            aprobados++;
        } else {
            suspensos++;
        }
        contador++;
    }
    // mostramos el resultado
        System.out.println("Cantidad de alumnos aprobados: " + aprobados);
        System.out.println("Cantidad de alumnos suspensos: " + suspensos);
    }
}
