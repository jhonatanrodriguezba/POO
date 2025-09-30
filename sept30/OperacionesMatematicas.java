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
}