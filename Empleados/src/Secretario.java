public class Secretario extends Empleado {
    private String despacho;
    private String numeroFax;

    public Secretario(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String despacho, String numeroFax) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Despacho: " + despacho + " - Fax: " + numeroFax);
    }

    @Override
    public void incrementarSalario() {
        salario *= 1.05; // Aumento del 5%
    }
}
