package tallerparcial.productoooo;

public class EjecutarProducto {
    public static void main(String[] args) {

        Producto p1 = new Producto("Café", 3500, 3);

        System.out.println("Antes del descuento:");
        System.out.println(p1);

        double totalConDescuento = p1.aplicarDescuento(10);
        System.out.println("\nDespués de aplicar 10% de descuento: " + totalConDescuento);

        double totalConImpuesto = p1.totalConImpuesto(10);
        System.out.println("Total con impuesto: " + totalConImpuesto);

        p1.incrementarCantidad(2);
        System.out.println("\nDespués de incrementar cantidad:");
        System.out.println(p1);
    }
}

    

