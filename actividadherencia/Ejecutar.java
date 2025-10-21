package actividadherencia;

public class Ejecutar {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("", "Rodriguez", 000011111, 17, "582825241445", 4.3, 0);
        Profesor p1r = new Profesor("Jhon Haide", "Cano", "565555555", "30", "POO", 800);
        Administrativo a1 = new Administrativo("Victor", "Mosquera", 30, 52265425);

        e1.mostrarinfo();
        System.out.println("--------------------------------");
        p1r.mostrarinfo();
        System.out.println("---------------------");
        a1.mostrarinfo();
    }
}
