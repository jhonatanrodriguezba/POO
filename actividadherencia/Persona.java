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

    public Persona(String nombre2, String apellido2, String documento, String edad2) {
        this.nombre = nombre2;
        this.apellido = apellido2;
        this.num_documento = num_documento;
        this.edad = edad;
    }

    public Persona(String nombre2, int num_documento2, int edad2) {
        this.nombre = nombre2;
        this.apellido = apellido;
        this.num_documento = num_documento2;
        this.edad = edad2;
    }

    public void mostrarinfo (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Numero de Documento: " + num_documento);
        System.out.println("Edad: " + edad);
    }

}
