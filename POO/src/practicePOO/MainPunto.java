package practicePOO;
import  java.util.Scanner;
public class MainPunto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar información para el primer punto
        System.out.println("Introduce las coordenadas del primer punto (x y):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Crear el primer punto
        Punto punto1 = new Punto(x1, y1);

        // Solicitar información para el segundo punto
        System.out.println("Introduce las coordenadas del segundo punto (x y):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Crear el segundo punto
        Punto punto2 = new Punto(x2, y2);

        // Calcular la distancia entre los puntos
        double distancia = punto1.distanciaEuclidea(punto2);
        System.out.println("La distancia euclídea entre los puntos es: " + distancia);

        sc.close();
    }
}
