import java.util.Scanner;

public class EjercicioCanicas {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Comience el juego");

        //Guardando canicas
        int jugador1 = 10;
        int jugador2 = 10;
        String seleccionComputadora = "";
        String jugadorP = "", jugadorD = "";


        // Quien juga primero


        System.out.print("Jugador 1, cuantas canicas quieres apostar? -> ");
        int apuesta = sc.nextInt();


        int nRandom = (int) (Math.random() * 2) + 1;
        if (nRandom == 1) {
            seleccionComputadora = "impar";
        } else {
            seleccionComputadora = "par";
        }
        System.out.print("Jugador 2, cree que el jugador 1 tiene el numero " + seleccionComputadora);
    }
}
