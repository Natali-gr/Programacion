import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //solicitamos el precio original y el precio de venta
        System.out.println("Ingrese el precio original del artículo: ");
        final double precio = sc.nextDouble();
        System.out.println("ingrese el precio de venta real");
        final double venta = sc.nextDouble();

        //calculamos el porcentaje de descuento
        final double descuento= (precio-venta)/precio*100;
        //mostramos el resultado
        System.out.println("el porcentaje de descuento realizado es: "+descuento+"%");
    }
}
