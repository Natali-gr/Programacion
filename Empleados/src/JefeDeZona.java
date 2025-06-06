public class JefeDeZona extends Empleado{
    private String despacho, matriculaCoche;
    private Secretario secretario;
    private Vendedor[] vendedores;

    public JefeDeZona(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String despacho, String matriculaCoche, Secretario secretario, Vendedor[] vendedores) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.matriculaCoche = matriculaCoche;
        this.secretario = secretario;
        this.vendedores = vendedores;
    }

    public void cambiarSecretario(Secretario nuevoSecretario) {
        this.secretario = nuevoSecretario;
    }

    public void cambiarCoche(String nuevaMatricula) {
        this.matriculaCoche = nuevaMatricula;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Despacho: " + despacho + " - Coche: " + matriculaCoche);
        System.out.println("Secretario a cargo:");
        secretario.imprimir();
        System.out.println("Vendedores a cargo:");
        for (Vendedor v : vendedores) {
            v.imprimir();
        }
    }

    @Override
    public void incrementarSalario() {
        salario *= 1.20; // Aumento del 20%
    }
}

