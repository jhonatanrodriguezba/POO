package Momento3;

public class Puerta {
    private boolean abierta;
    private boolean obstaculo;

    public Puerta(){
        this.abierta = false;
        this.obstaculo = false;
    }
    public void abrir(){
        abierta = true;
        System.out.println("Puerta Abierta");
    }
    public void cerrar(){
        abierta = false;
        System.out.println("Puerta Cerrada");
        if (!obstaculo){
            System.out.println("Hay un Obstaculo en medio, no se puede cerrar");
        }
    }
    public void detectar_obs(boolean estado){
        obstaculo = estado;
    }
    public boolean esta_abierta(){
        return abierta;
    }
}
