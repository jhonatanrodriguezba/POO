import java.util.Scanner;

public class EjecutarOpeMat{
    public static void main(String[] args) {

        //Capturar datos por telcado (otra manera):
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite primer numero entero...");
        int num1 = sc.nextInt();
        System.out.println("Digite Segundo numero entero...");
        int num2 = sc.nextInt();
        
        //Crear el Objeto:
        OperacionesMatematicas objOpe = new OperacionesMatematicas(num1, num2);

        //Capturar valores por teclado:
        //num1 = objOpe.leerEnteros();
        //num2 = objOpe.leerEnteros();

        //objOpe.leerEnteros();
        //OperacionesMatematicas objOpe = new OperacionesMatematicas(5, 6);

        //Acceder al metodo sumar de la clase OperacionesMatematicas
        System.out.println("La suma de ambos numeros es: " + objOpe.sumar());
        System.err.println("La resta de ambos numeros es: " + objOpe.restar());
        System.err.println("La multiplicacion de ambos numero es: " + objOpe.multiplicar());
        System.err.println("La división de amgos numeros es: " + objOpe.dividir());
    }
}