package practicePOO;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desplazaX(double dx) {
        this.x += dx;
    }

    public void desplazaY(double dy) {
        this.y += dy;
    }

    public void desplaza(double dx, double dy) {
        desplazaX(dx);
        desplazaY(dy);
    }

    public double distanciaEuclidea(Punto otro) {
        return Math.sqrt(Math.pow(otro.x - this.x, 2) + Math.pow(otro.y - this.y, 2));
    }

    public void muestra() {
        System.out.println("Punto: (" + x + ", " + y + ")");
    }
}
