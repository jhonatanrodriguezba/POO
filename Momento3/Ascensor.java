import java.util.ArrayList;

public class Ascensor {
    private int pisoActual;
    private String direccion;
    private boolean enMovimiento;
    private Puerta puerta;
    private ArrayList<Boton> botonesInteriores;

    public Ascensor (int cantidadDePisos){
        this.pisoActual = 0;
        this.enMovimiento = false;
        this.direccion = "detenido";
        this.puerta = new Puerta();
        this.botonesInteriores = new ArrayList<>();

        for (int i = 0; i < cantidadDePisos; i++){
            botonesInteriores.add(new Boton(direccion));
        }
    }
    public void seleccioPiso(int pisoDestino){
        System.out.println("Piso " + pisoDestino + "Seleccionado");
        mover(pisoDestino);
    }
    public void mover(int pisoDestino){
        if (pisoDestino == pisoActual){
            System.out.println("Estas en este piso");
            return;
        }
    
        enMovimiento = true;
        direccion = pisoDestino > pisoActual ? "Subiendo" : "Bajando";
        System.out.println("Ascensor " + direccion + "Hacia piso " + pisoDestino);

        pisoActual = pisoDestino;
        enMovimiento = false;
        direccion = "detenido";
        System.err.println("El Ascensor ha llegado a: " + pisoActual);
        puerta.abrir();
        }
        public void abrirPuerta(){
            puerta.abrir();
        }
        public void cerrarPuerta(){
            puerta.cerrar();
        }
        public int getPisoActual(){
            return pisoActual;
        }
    }

