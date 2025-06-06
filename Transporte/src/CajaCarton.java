public class CajaCarton extends Caja{
    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, "cm");
    }
    @Override
    public double getVolumen() {
        double volumenReal = (double) (ancho * alto * fondo) / 1000000;
        return volumenReal * 0.8;
    }
    public double getSuperficie() {
        return 2 * (ancho * alto + alto * fondo + fondo * ancho) / 10000.0;
    }
    @Override
    public String toString() {
        return "CajaCarton [Ancho: " + ancho + " cm, Alto: " + alto + " cm, Fondo: " + fondo + " cm, " +
                "Volumen: " + getVolumen() + " m³, Superficie de Cartón: " + getSuperficie() + " m², Etiqueta: " + etiqueta + "]";
    }
    public static void main(String[] args) {
        CajaCarton caja1 = new CajaCarton(100, 50, 40);
        System.out.println(caja1);

        caja1.setEtiqueta("Destinatario: Juan Pérez, Dirección: Calle Ficticia 123");
        System.out.println(caja1);
    }
}
