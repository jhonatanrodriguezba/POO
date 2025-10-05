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
        System.out.println("La potenciacion de ambos numeros es: " + objOpe.potenciar());
        System.out.println("La Raiz cuadrada de " + num1 + " es: "+ objOpe.raiza() + " Y la Raiz Cuadrada de " + num2 + " es: " + objOpe.raizb());
        System.out.println("El seno de " + num1 + " es: " + objOpe.senoa());
        System.out.println("El seno de " + num2 + " es: " + objOpe.senob());
        System.out.println("El Coseno de " + num1 + " es: " + objOpe.cosenoa());
        System.out.println("El coseno de " + num2 + " es: " + objOpe.cosenob());
        System.out.println("La Tangente de " + num1 + " es: " + objOpe.tana());
        System.out.println("La tangente de " + num2 + " es: " + objOpe.tanb());
        System.out.println("El Logaritmo Natural (ln) de " + num1 + " es: " + objOpe.lognata());
        System.out.println("Elo Logatirmo Natural (ln) de " + num2 + " es: " + objOpe.lognatb());
        System.out.println("El Logaritmo Común (Base 10) de " + num1 + " es: " + objOpe.logdieza());
        System.out.println("El Logatirmo Común (Base 10) de " + num2 + " es: " + objOpe.logdiezb());

        sc.close();

    }
}