import java.util.ArrayList;
abstract class Instrumento {
    enum Nota {
        DO, RE, MI, FA, SOL, LA, SI;
    }

    protected ArrayList<Nota> melodia;

    public Instrumento() {
        melodia = new ArrayList<>();
    }

    public void add(Nota nota) {
        melodia.add(nota);
    }
    public void afinar() {
        System.out.println("El instrumento está siendo afinado.");
    }
    public abstract void tocar();
}
