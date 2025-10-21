package herenciaaaaa;

public class Personaaa {
    String nombres;
    String apellidos;
    int documetoid;
    int edad;

    public Personaaa (String nombres, String apellidos, int documentoid, int edad){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documetoid = documentoid;
        this.edad = edad;

    }
    public void mostrar(){
        System.out.println("Nombre: " + nombres);
        System.out.println("Apellido: " + apellidos);
        System.out.println("Documento: " + documetoid);
        System.out.println("Edad: " + edad);
    }
}
