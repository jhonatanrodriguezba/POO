package actividadherencia;

public class Estudiante extends Persona {
    private String matricula;
    private double promedio;
    private int año_escolar;

    public Estudiante(String nombre, String apellido, int num_documento, int edad, String matricula, double promedio, int año_escolar ){
        
        super(nombre, edad, num_documento);
        this.matricula = matricula;
        this.promedio = promedio;

    }
    @Override
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("Matricula: " + matricula);
        System.out.println("Promedio: " + promedio);
    }
}
