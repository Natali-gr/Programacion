import  java.util.Scanner;
public class Ejercicio36 {
    /*Haz un programa que pida cadenas de texto al usuario hasta que reciba el número
    0000. Para cada una de ellas, menos para el 0000, se debe llamar a una función que
    cuente el número de caracteres que tiene dicha cadena (los espacios y cualquier otro
    símbolo está incluido) y lo devuelva al programa principal, que debe decírselo al usuario
    así como su último carácter. Si la cadena está vacía debe indicarlo también y en dicho
    caso recontará el número de veces que se ha introducido la cadena vacía (sólo cuenta
    cuando es vacía) y al final del programa lo dice al usuario.*/
    // Función para contar caracteres de una cadena
    public static int contarCaracteres(String cadena) {
        return cadena.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorCadenasVacias = 0;

        while (true) {
            System.out.print("Introduce una cadena de texto (o 0000 para salir): ");
            String cadena = sc.nextLine();

            // Si la cadena es "0000", se sale del bucle
            if (cadena.equals("0000")) {
                break;
            }

            // Verificar si la cadena está vacía
            if (cadena.isEmpty()) {
                contadorCadenasVacias++;
                System.out.println("La cadena está vacía.");
            } else {
                // Llamar a la función para contar los caracteres y mostrar el último carácter
                int longitud = contarCaracteres(cadena);
                char ultimoCaracter = cadena.charAt(longitud - 1);
                System.out.println("La cadena tiene " + longitud + " caracteres. El último carácter es: " + ultimoCaracter);
            }
        }

        // Mostrar el número de cadenas vacías al final
        System.out.println("Se introdujeron " + contadorCadenasVacias + " cadenas vacías.");

        sc.close();
    }
}
