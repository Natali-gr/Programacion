public class Empresa {
    public static void main(String[] args) {
        Secretario sec = new Secretario("Juan", "Perez", "12345678X", "Calle A", "987654321", 2000, "Despacho 101", "987654");
        Vendedor ven1 = new Vendedor("Luis", "Gomez", "87654321Y", "Calle B", "123456789", 2500, "ABC-123", "654987321", "Zona Norte");
        Vendedor ven2 = new Vendedor("Carlos", "Lopez", "12349876Z", "Calle C", "987321654", 2600, "DEF-456", "321654987", "Zona Sur");
        Vendedor[] vendedores = { ven1, ven2 };
        JefeDeZona jefe = new JefeDeZona("Maria", "Fernandez", "11223344A", "Calle D", "123123123", 5000, "Despacho Principal", "XYZ-789", sec, vendedores);

        System.out.println(" Antes de incrementar salarios: ");
        sec.imprimir();
        ven1.imprimir();
        ven2.imprimir();
        jefe.imprimir();

        // Incrementar salarios
        sec.incrementarSalario();
        ven1.incrementarSalario();
        ven2.incrementarSalario();
        jefe.incrementarSalario();

        System.out.println("\n Después de incrementar salarios : ");
        sec.imprimir();
        ven1.imprimir();
        ven2.imprimir();
        jefe.imprimir();
    }
}
