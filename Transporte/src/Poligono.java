public abstract class Poligono {
    protected double base;
    protected double altura;

    // Constructor que inicializa los atributos base y altura
    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método abstracto para calcular el área
    public abstract double área();
}
