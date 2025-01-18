public class Ejercicio35 {
    /*Realiza un programa que tenga 4 funciones, cada una de ellas sacará un mensaje que
    diga el nombre de la función y el orden de llamada ya que recibirá un contador desde el
    programa principal que se utilizará. En el programa principal se hará uso de esas 4
    funciones al menos 2 veces de cada una y da igual el orden en que se lancen.*/
    // Función 1
    public static void funcion1(int contador) {
        System.out.println("Llamada a la función 1, contador: " + contador);
    }

    // Función 2
    public static void funcion2(int contador) {
        System.out.println("Llamada a la función 2, contador: " + contador);
    }

    // Función 3
    public static void funcion3(int contador) {
        System.out.println("Llamada a la función 3, contador: " + contador);
    }

    // Función 4
    public static void funcion4(int contador) {
        System.out.println("Llamada a la función 4, contador: " + contador);
    }

    public static void main(String[] args) {
        // Llamadas a las funciones con el contador
        for (int i = 1; i <= 2; i++) {
            funcion1(i);
            funcion2(i);
            funcion3(i);
            funcion4(i);
        }

        // Llamadas adicionales para asegurarnos de que cada función se llame al menos dos veces
        funcion1(3);
        funcion2(3);
        funcion3(3);
        funcion4(3);
    }
}
