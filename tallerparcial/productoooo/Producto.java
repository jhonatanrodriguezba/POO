package tallerparcial.productoooo;

public class Producto {
    
    private String nombre;
    private double precioUnitario;
    private int cantidad;
    private final double impuesto = 0.08;

    public Producto() {
        this.nombre = "";
        this.precioUnitario = 0.0;
        this.cantidad = 0;
    }

    public Producto(String nombre, double precioUnitario, int cantidad) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario > 0 ? precioUnitario : 0.0;
        this.cantidad = cantidad > 0 ? cantidad : 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario >= 0) {
            this.precioUnitario = precioUnitario;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }
    }

    public double calcularSubtotal() {
        return precioUnitario * cantidad;
    }

    public double aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            double descuento = calcularSubtotal() * (porcentaje / 100);
            return calcularSubtotal() - descuento;
        }
        return calcularSubtotal();
    }
    public double totalConImpuesto(double porcentajeConDescuento) {
        double totalDescuento = aplicarDescuento(porcentajeConDescuento);
        return totalDescuento + (totalDescuento * impuesto);

    }

    public void incrementarCantidad(int extra) {
        if (extra > 0) {
            cantidad += extra;
        }
    }

    @Override
    public String toString() {
        return "Producto [Nombre=" + nombre + ", Precio Unitario=" + precioUnitario +
               ", Cantidad=" + cantidad + ", Subtotal=" + calcularSubtotal() + "]";
    }
}


