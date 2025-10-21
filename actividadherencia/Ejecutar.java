package actividadherencia;

public class Ejecutar {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Jhonatan", "Rodriguez", 888555222, 17, "2", 4.3, 0);
        Profesor p1r = new Profesor("Jhon Haide", "Cano", "565555555", "30", "POO", 800);
        Administrativo a1 = new Administrativo("Victor", "Mosquera", 30, 55555555, "Decano", "8-9am");

        e1.mostrarinfo();
        System.out.println("--------------------------------");
        p1r.mostrarinfo();
        System.out.println("---------------------");
        a1.mostrarinfo();
    }
}
