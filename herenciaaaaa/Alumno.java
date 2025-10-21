package herenciaaaaa;

public class Alumno {
    private String codmatricula;
    private double promedio_notas;

    public Alumno(String nombres, String apellidos, int documentoid, int edad, String codMatricula, double promedio_notas){
        super(nombres, apellidos, documentoid, edad);
        
        this.codmatricula = codMatricula;
        this.promedio_notas = promedio_notas;

    }

    @Override
    public void mostrar(){
        super.mostrar()
    }

}
