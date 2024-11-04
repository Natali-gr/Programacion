public class Ejercicio10 {
    public static void main(String[] args) {
        // Definir y asignar valores al array símbolo
        char[] simbolo = new char[10];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        // Mostrar el contenido de todos los elementos del array
        System.out.println("Contenido del array:");
        for (int i = 0; i < simbolo.length; i++) {
            System.out.println("simbolo[" + i + "] = '" + simbolo[i] + "'");
        }
    }
}
