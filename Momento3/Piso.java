package Momento3;

public class Piso {
    private int num_piso;
    private Boton b_subida;
    private Boton b_bajada;

    public Piso (int num_piso){
        this.num_piso = num_piso;
        b_subida = new Boton("Subida");
        b_bajada = new Boton("Bajada");
    }
    public int getNumero(){
        return num_piso;
    }
    public Boton getb_subida(){
        return b_subida;
    }
    public Boton getb_bajada(){
        return b_bajada;
    }
}
