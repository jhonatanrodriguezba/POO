public class ControlAscensor {
    private Ascensor ascensor;
    private Piso[] pisos;

    public ControlAscensor(int cantidadPisos) {
        pisos = new Piso[cantidadPisos];
        for (int i = 0; i < cantidadPisos; i++) {
            pisos[i] = new Piso(i);
        }
        ascensor = new Ascensor(cantidadPisos);
    }

    public void solicitarAscensor(int piso, String direccion) {
        System.out.println("Solicitud desde el piso " + piso + " (" + direccion + ").");
        ascensor.mover(piso);
    }

    public void seleccionarPisoDesdeAscensor(int pisoDestino) {
        ascensor.seleccioPiso(pisoDestino);
    }

    public void mostrarEstado() {
        System.out.println("Ascensor en piso: " + ascensor.getPisoActual());
    }
}
