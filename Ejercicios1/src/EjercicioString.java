import java.util.Scanner;

public class EjercicioString {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

            // Códigos ANSI para colores
             final String RESET = "\u001B[0m";
            final String ROJO = "\u001B[31m";
            final String VERDE = "\u001B[32m";
            final String AMARILLO = "\u001B[33m";
            final String AZUL = "\u001B[34m";
            final String MAGENTA = "\u001B[35m";
            final String CYAN = "\u001B[36m";


                System.out.println("=======================================");
                System.out.println("    \u001B[1mHorario de Clases\u001B[0m");
                System.out.println("=======================================");
                System.out.println("Hora\tLunes\t\tMartes\t\tMiércoles\tJueves\t\tViernes");
                System.out.println("=======================================");
                System.out.println("8:00\t" + ROJO + "Matemáticas" + RESET + "\t" + AMARILLO + "Historia" + RESET +
                        "\t" + VERDE + "Química" + RESET + "\t\t" + AZUL + "Física" + RESET + "\t\t" + CYAN + "Inglés" + RESET);
                System.out.println("9:00\t" + MAGENTA + "Lengua" + RESET + "\t\t" + ROJO + "Matemáticas" + RESET +
                        "\t" + AMARILLO + "Historia" + RESET + "\t" + VERDE + "Química" + RESET + "\t\t" + AZUL + "Física" + RESET);
                System.out.println("10:00\t" + CYAN + "Inglés" + RESET + "\t\t" + MAGENTA + "Lengua" + RESET +
                        "\t" + ROJO + "Matemáticas" + RESET + "\t" + AMARILLO + "Historia" + RESET + "\t" + VERDE + "Química" + RESET);
                System.out.println("11:00\t" + "\u001B[1mRecreo\u001B[0m");
                System.out.println("11:30\t" + AZUL + "Física" + RESET + "\t\t" + CYAN + "Inglés" + RESET +
                        "\t" + MAGENTA + "Lengua" + RESET + "\t\t" + ROJO + "Matemáticas" + RESET + "\t" + AMARILLO + "Historia" + RESET);
                System.out.println("12:30\t" + VERDE + "Química" + RESET + "\t\t" + AZUL + "Física" + RESET +
                        "\t" + CYAN + "Inglés" + RESET + "\t\t" + MAGENTA + "Lengua" + RESET + "\t\t" + ROJO + "Matemáticas" + RESET);
                System.out.println("=======================================");

    }
}
