package actividadherencia;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected int num_documento;
    protected int edad;

    public Persona(String nombre, String documento, String edad2){
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_documento = num_documento;
        this.edad = edad;
    }

    public void mostrarinfo (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Numero de Documento: " + num_documento);
        System.out.println("Edad: " + edad);
    }

}
