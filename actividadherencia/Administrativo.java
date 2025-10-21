package actividadherencia;

public class Administrativo extends Persona {
    private String cargo;
    private String horario;

    public Administrativo(String nombre, String Apellido, int edad, int num_documento) {
        super(nombre, num_documento, edad);
        this.cargo = cargo;
        this.horario = horario;
    
    }

    @Override
    public void mostrarinfo() {
        super.mostrarinfo();
        System.out.println("Cargo: " + cargo);
        System.out.println("Horario: " + horario);
    }
}
