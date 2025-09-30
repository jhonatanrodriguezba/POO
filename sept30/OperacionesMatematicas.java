public class OperacionesMatematicas {

    //Atributos de la clase (Las clases no tienen metodo main)
    private int a;
    private int b;

    //Constructor: Permite inicializar la clase
    public OperacionesMatematicas(int a, int b){
        this.a = a;
        this.b = b;

    }
    //metodos:
    public int sumar (){
        return a + b;
    }
    public int restar(){
        return a - b;
    }
    public int multiplicar(){
            return a * b;
        }
    public double dividir(){
        double resultado;
        if (b == 0){
            resultado = 0.0;
        } else {
            //(double) significa hacer una conversion de entero a real (hacer eso se llama cast)
            resultado = (double) a / (double) b;
        }
        return resultado;
    }

    //método para recibir numeros enteros por teclado
    //public int leerEnteros(){
        //Scanner sc = new Scanner(System.in);
        //System.err.println("Digite el número entero...");
        //int n = sc.nextInt();
        //Para numeros enteros se utiliza el "nextInt", para reales "nextDouble", para booelanos "nexBoolean", para cadenas (String) "next()" - Cada uno va acompañado de un "sc.+{tipo de next}"
        //sc.close();
        //return n;
    //}
}