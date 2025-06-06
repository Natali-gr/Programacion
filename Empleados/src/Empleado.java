public class Empleado {

        protected String nombre, apellidos, dni, direccion, telefono;
        protected double salario;

        public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.dni = dni;
            this.direccion = direccion;
            this.telefono = telefono;
            this.salario = salario;
        }

        public void imprimir() {
            System.out.println("Empleado: " + nombre + " " + apellidos + " - DNI: " + dni);
            System.out.println("Direccion: " + direccion + " - Telefono: " + telefono);
            System.out.println("Salario: " + salario);
        }

        public void incrementarSalario() {
            salario *= 1.01; // Aumento del 1%

    }
}
