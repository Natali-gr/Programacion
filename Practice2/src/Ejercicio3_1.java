public class Ejercicio3_1 {
    public static void main(String[] args) {

        // Generar las tablas de multiplicar del 1 al 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
