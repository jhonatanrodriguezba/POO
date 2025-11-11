public class Puerta {
    private boolean abierta;

    public Puerta() {
        this.abierta = false;
    }

    public void abrir() {
        abierta = true;
        System.out.println("Puertas abiertas.");
    }

    public void cerrar() {
        abierta = false;
        System.out.println("Puertas cerradas.");
    }

    public boolean estaAbierta() {
        return abierta;
    }
}