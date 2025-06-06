public class Triangulo extends Poligono{
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double área() {
        return 0.5 * base * altura;
    }
}
