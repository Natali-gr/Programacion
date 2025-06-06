public class Vendedor extends Empleado{
    private String matriculaCoche, telefonoMovil, areaVenta;

    public Vendedor(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String matriculaCoche, String telefonoMovil, String areaVenta) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.matriculaCoche = matriculaCoche;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
    }

    public void cambiarCoche(String nuevaMatricula) {
        this.matriculaCoche = nuevaMatricula;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Coche: " + matriculaCoche + " - Movil: " + telefonoMovil + " - Area: " + areaVenta);
    }

    @Override
    public void incrementarSalario() {
        salario *= 1.10; // Aumento del 10%
    }
}
