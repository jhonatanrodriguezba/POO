public class Piso {
    private int numero;
    private BotonAscensor botonSubida;
    private BotonAscensor botonBajada;

    public Piso(int numero) {
        this.numero = numero;
        if (numero < 4) this.botonSubida = new BotonAscensor(numero + 1);
        if (numero > 0) this.botonBajada = new BotonAscensor(numero - 1);
    }

    
}

