package actividadherencia;

public class Profesor extends Persona {
    private String asignatura;
    private double salario;

    public Profesor(String nombre, String apellido, String documento, String edad, String asignatura, double salario) {
        super(nombre, apellido, documento, edad);
        this.asignatura = asignatura;
        this.salario = salario;
    }

    @Override
    public void mostrarinfo() {
        super.mostrarinfo();
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Salario: $" + salario);
    }
}
