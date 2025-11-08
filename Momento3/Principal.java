public class Principal {
    public static void main(String[] args) {
        ControlAscensor sistema = new ControlAscensor(5);

        sistema.mostrarEstado();
        sistema.solicitarAscensor(3, "subida");
        sistema.seleccionarPisoDesdeAscensor(1);
        sistema.mostrarEstado();
    }
}

