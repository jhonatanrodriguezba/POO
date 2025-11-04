package Momento3;

public class Boton {
    private boolean iluminado;
    private String tipo;
    private boolean presionado;

    public Boton(String tipo){
        this.tipo = tipo;
        this.iluminado = false;
        this.presionado = false;
    }
    public void presionar(){
        presionado = true;
        iluminar();
        System.out.println("Boton de " + tipo + " esta presionado");
    }
    public void iluminar(){
        iluminado = true;
        System.out.println("Boton de " + tipo + " esta iluminado");
    }
    public void apagarLuz(){
        iluminado = false;
    }
    public boolean estaPresionado(){
        return presionado;
    }
    public String getTipo(){
        return tipo;
    }
}
