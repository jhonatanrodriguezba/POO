public class Piso {
    private int numero;
    private Boton botonSubida;
    private Boton botonBajada;

    public Piso(int numero) {
        this.numero = numero;
        if (numero < 4) this.botonSubida = new BotonAscensor(numero + 1);
        if (numero > 0) this.botonBajada = new BotonAscensor(numero - 1);
    }
    public int getNumero() {
        return numero;
    }
    public Boton getBotonSubida() {
        return botonSubida;
    }
    public Boton getBotonBajada() {
        return botonBajada;
    }
    
}

