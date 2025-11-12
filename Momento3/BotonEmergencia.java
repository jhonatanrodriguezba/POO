public class BotonEmergencia extends Boton {
    @Override
    public String getNombre() {
        return " de emergencia";
    }
    @Override
    public void presionar(){
        this.presionado = true;
        System.out.println("Se Presiono el Boton" + this.getNombre());
    }
}
