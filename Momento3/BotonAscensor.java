public class BotonAscensor extends Boton {
    private int piso;

    public BotonAscensor(int piso){
        this.piso = piso;
    }
    @Override
    public String getNombre() {
        return " del ascensor para el piso " + piso;
    }
    
}
