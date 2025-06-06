public class Main {
    public static void main(String[] args) {
        // Crear objetos de tipo Triangulo y Rectangulo
        Poligono triangulo = new Triangulo(5, 8);
        Poligono rectangulo = new Rectangulo(4, 7);

        // Mostrar el área del triángulo
        System.out.println("El área del triángulo es: " + triangulo.área() + " unidades cuadradas.");

        // Mostrar el área del rectángulo
        System.out.println("El área del rectángulo es: " + rectangulo.área() + " unidades cuadradas.");
    }
}