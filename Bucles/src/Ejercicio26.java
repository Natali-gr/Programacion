import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int calificacion=5;
        int cont=0;
        boolean suspenso=false;

        while(cont<calificacion) {
            System.out.print("ingresa la calificación del alumno: ");
            calificacion = sc.nextInt();

            if (calificacion <= 5) {
                suspenso = true;
            }
            cont++;
        }
        if (suspenso){
            System.out.println("hay al menos un suspenso");
        }else {
            System.out.println("están todos aprobados");
        }
    }
}
