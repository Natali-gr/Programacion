package practicePOO;

public class MarcaPagina {
    private int paginaActual;

    public MarcaPagina() {
        this.paginaActual = 0;
    }

    public void incrementarPagina() {
        paginaActual++;
    }

    public int obtenerPaginaActual() {
        return paginaActual;
    }

    public void reiniciarLectura() {
        paginaActual = 0;
    }
}
