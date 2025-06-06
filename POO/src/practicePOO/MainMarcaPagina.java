package practicePOO;

public class MainMarcaPagina {
    public static void main(String[] args) {
        // Crear una nueva marca página
        MarcaPagina libro = new MarcaPagina();

        // Incrementar páginas y mostrar progreso
        libro.incrementarPagina();
        libro.incrementarPagina();
        System.out.println("Página actual: " + libro.obtenerPaginaActual());

        // Reiniciar la lectura
        libro.reiniciarLectura();
        System.out.println("Reiniciando lectura...");
        System.out.println("Página actual: " + libro.obtenerPaginaActual());
    }
}
