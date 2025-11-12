public class BotonPiso extends Boton {
    private String direccion;
    private int piso;

    public BotonPiso(String direccion, int piso){
        this.direccion = direccion;
        this.piso = piso;
    }
    @Override
    public String getNombre() {
        return " del piso " + piso + " para " + direccion;
    }
}
