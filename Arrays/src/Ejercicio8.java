public class Ejercicio8 {
    public static void main(String[] args) {
        // Definir y asignar valores al array num
        int[] num = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        // Mostrar el contenido de todos los elementos del array
        System.out.println("Contenido del array:");
        for (int i = 0; i < num.length; i++) {
            System.out.println("num[" + i + "] = " + num[i]);
        }
    }
}
