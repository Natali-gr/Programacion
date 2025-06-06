public class Caja {
    public int ancho;
    public int alto;
    public int fondo;
    private String unidad;
    public String etiqueta;

    public Caja(int ancho, int alto, int fondo, String unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
        this.etiqueta = "";
    }

    public double getVolumen() {
        if (unidad.equals("cm")) {
            return (double) (ancho * alto * fondo) / 1000000; // Convertimos de cm³ a m³
        }
        else if (unidad.equals("m")) {
            return (double) (ancho * alto * fondo);
        }
        return 0;
    }

    public void setEtiqueta(String etiqueta) {
        if (etiqueta.length() <= 30) {
            this.etiqueta = etiqueta;
        } else {
            System.out.println("La etiqueta no puede superar los 30 caracteres.");
        }
    }

    @Override
    public String toString() {
        return "Caja [Ancho: " + ancho + " " + unidad + ", Alto: " + alto + " " + unidad +
                ", Fondo: " + fondo + " " + unidad + ", Volumen: " + getVolumen() + " m³, Etiqueta: " + etiqueta + "]";
    }

    public static void main(String[] args) {
        Caja caja1 = new Caja(100, 50, 40, "cm");
        System.out.println(caja1);

        caja1.setEtiqueta("Destinatario: Juan Pérez, Dirección: Calle Ficticia 123");
        System.out.println(caja1);

        Caja caja2 = new Caja(2, 1, 1, "m");
        System.out.println(caja2);
    }
}
