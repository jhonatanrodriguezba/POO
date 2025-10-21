package actividadherencia;

public class Administrativo extends Persona {
    private String cargo;
    private String horario;

    public Administrativo(String nombre, String apellido, int edad, int num_documento, String cargo, String horario) {
        super(nombre, num_documento, edad);
        this.cargo = cargo;
        this.horario = horario;
        this.apellido = apellido;
    
    }

    @Override
    public void mostrarinfo() {
        super.mostrarinfo();
        System.out.println("Cargo: " + cargo);
        System.out.println("Horario: " + horario);
        
    }
}
