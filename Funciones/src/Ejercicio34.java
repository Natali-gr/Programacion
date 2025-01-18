import java.util.Scanner;
public class Ejercicio34 {
    /*Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta
    de cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
    double precioConIVA(double precio)*/
    public class PrecioConIVA {

        // Función para calcular el precio con IVA
        public static double precioConIVA(double precio) {
            // Se aplica un 21% de IVA
            return precio * 1.21;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedir y mostrar los precios con IVA para 5 productos
            for (int i = 1; i <= 5; i++) {
                System.out.print("Introduce el precio del producto " + i + ": ");
                double precio = scanner.nextDouble();
                double precioConIva = precioConIVA(precio);
                System.out.println("El precio de venta del producto " + i + " con IVA es: " + precioConIva);
            }

            scanner.close();
        }
    }
}
