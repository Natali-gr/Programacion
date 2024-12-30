import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* Calcula la nota de un trimestre de la asignatura Programación. El programa
        pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
        Si la media de los dos controles da un número mayor o igual a 5, el alumno
        está aprobado y se mostrará la media. En caso de que la media sea un número
        menor que 5, el alumno habrá tenido que hacer el examen de recuperación
        que se califica como apto o no apto, por tanto se debe preguntar al usuario
        ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
        resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
        mantiene la nota media anterior.*/

        System.out.print("Ingrese las notas del primer examen: ");
        double nota1=sc.nextDouble();
        System.out.print("Ingrese las notas del segundo examen: ");
        double nota2=sc.nextDouble();

        double media=(nota1+nota2)/2;

        if(media >=5){
            System.out.print("estás aprobado con: "+media);
        } else if (media<5) {
            System.out.print("¿cual ha sido el resultado de la recuperación? apto/no apto: ");
            sc.nextLine();
            String recuperacion=sc.nextLine();

            if(recuperacion.equals("apto")){
                media=5.0;
                System.out.print("tu nota de programación es: "+media);
            }else if(recuperacion.equals("no apto")){
                System.out.print("no apto en recuperación,tu nota de programación es: "+media);
            }
        }

    }
}
