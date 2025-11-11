import java.util.Scanner;

public class SistemaControlDelAscensor {
    private Ascensor ascensor;
    private Piso[] pisos;
    private Scanner scanner;

    public SistemaControlDelAscensor(int cantidadPisos) {
        ascensor = new Ascensor();
        pisos = new Piso[cantidadPisos];
        for (int i = 0; i < cantidadPisos; i++) {
            pisos[i] = new Piso(i);
        }
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean activo = true;
        System.out.println("Control Del Ascensor - 5 pisos");

        while (activo) {
            System.out.println("\nPiso actual del ascensor: " + ascensor.getPisoActual());
            System.out.println("Seleccionar opcion:");
            System.out.println("1. Llamar el ascensor desde un piso");
            System.out.println("2. Elegir piso dentro del ascensor");
            System.out.println("3. Activar botón de emergencia");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    llamarAscensor();
                    break;
                case 2:
                    seleccionarDestino();
                    break;
                case 3:
                    ascensor.activarEmergencia();
                    break;
                case 4:
                    activo = false;
                    System.out.println("Saliendo del Ascensor");
                    break;
                default:
                    System.out.println("Opcion No valida");
            }
        }
        scanner.close();
    }

    private void llamarAscensor() {
        System.out.print("En que piso está (0-4)? ");
        int piso = scanner.nextInt();

        if (piso < 0 || piso >= pisos.length) {
            System.out.println("Piso no vaido.");
            return;
        }

        System.out.print("Desea subir (S) o bajar (B)? ");
        String dir = scanner.next().toUpperCase();

        if (dir.equals("S")) pisos[piso].getBotonSubida().presionar();
        else pisos[piso].getBotonBajada().presionar();

        ascensor.moverA(piso);
    }

    private void seleccionarDestino() {
        System.out.print("A que piso vas (0-4)? ");
        int destino = scanner.nextInt();

        if (destino < 0 || destino >= pisos.length) {
            System.out.println("Piso no valido.");
            return;
        }

        ascensor.cerrarPuerta();
        ascensor.moverA(destino);
    }
}
