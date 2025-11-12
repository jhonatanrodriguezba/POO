public class Ascensor {
    private int pisoActual;
    private String direccion;
    private boolean enMovimiento;
    private Puerta puerta;
    private BotonEmergencia botonEmergencia;

    public Ascensor() {
        this.pisoActual = 0;
        this.direccion = "detenido";
        this.enMovimiento = false;
        this.puerta = new Puerta();
        this.botonEmergencia = new BotonEmergencia();

        
    }

    public void moverA(int pisoDestino) {
        if (pisoDestino == pisoActual) {
            System.out.println("El ascensor ya está en el piso " + pisoActual);
            return;
        }

        enMovimiento = true;
        direccion = pisoDestino > pisoActual ? "subiendo" : "bajando";
        System.out.println("Ascensor " + direccion + " hacia el piso " + pisoDestino + "...");
        if (pisoDestino == 0){
            System.out.println("Ascensot hacia el sotano (0) ");
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pisoActual = pisoDestino;
        enMovimiento = false;
        direccion = "detenido";
        System.out.println("El Ascensor ha llegado al piso " + pisoActual);
        puerta.abrir();
    }

    public void activarEmergencia() {
        botonEmergencia.presionar();
        System.out.println("El Ascensor se detuvo, debido a que presionaste el boton de emergencia.");
        puerta.abrir();
        enMovimiento = false;
        direccion = "detenido";
    }

    public void cerrarPuerta() {
        puerta.cerrar();
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public boolean enEmergencia() {
        return botonEmergencia.estaPresionado();
    }
}
