public class Boton {
    private String tipo; 
    private boolean presionado;

    public Boton(String tipo) {
        this.tipo = tipo;
        this.presionado = false;
    }

    public void presionar() {
        presionado = true;
        System.out.println("Se presionó el botón de " + tipo);
    }

    public void reset() {
        presionado = false;
    }

    public boolean estaPresionado() {
        return presionado;
    }

    public String getTipo() {
        return tipo;
    }
}