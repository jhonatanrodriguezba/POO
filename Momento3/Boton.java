public abstract class Boton {
    protected boolean presionado;
    
    public Boton(){
        this.presionado = false;

    }
    public void presionar(){
        this.presionado = true;
        System.out.println("El botón se presiono" + this.getNombre());

    }
    public void reset() {
        this.presionado = false;

    }
    public boolean estaPresionado(){
        return presionado;
    }
    public abstract String getNombre();
}