public class EjecutarOpeMat{
    public static void main(String[] args) {

        //Crear el Objeto:
        OperacionesMatematicas objOpe = new OperacionesMatematicas(5, 6);

        //Acceder al metodo sumar de la clase OperacionesMatematicas
        System.out.println("La suma de ambos numeros es: " + objOpe.sumar());
        System.err.println("La resta de ambos numeros es: " + objOpe.restar());
        System.err.println("La multiplicacion de ambos numero es: " + objOpe.multiplicar());
        System.err.println("La división de amgos numeros es: " + objOpe.dividir());
    }
}