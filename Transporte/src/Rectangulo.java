public class Rectangulo extends Poligono {
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double área() {
        return base * altura;
    }
}
