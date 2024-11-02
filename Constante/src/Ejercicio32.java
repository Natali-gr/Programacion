import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("està lloviendo? ");
      boolean llueve= sc.nextBoolean();
      System.out.println("terminaste las tareas?");
      boolean tarea= sc.nextBoolean();
      System.out.println("necesitas ir a la biblioteca?");
      boolean biblioteca= sc.nextBoolean();

      boolean permiso=biblioteca||(!llueve && tarea );
      System.out.println("puede salir: "+permiso);

    }
}
