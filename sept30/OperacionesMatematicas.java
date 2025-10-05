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
    public double potenciar(){
        return Math.pow(a, b);
    }
    public double raiza(){
        return Math.sqrt(a);
    }
    public double raizb(){
        return Math.sqrt(b);
    }
    public double senoa(){
        return Math.sin(a);
    }
    public double senob(){
        return Math.sin(b);
    }
    public double cosenoa(){
        return Math.cos(a);
    }
    public double cosenob(){
        return Math.cos(b);
    }
    public double tana(){
        return Math.tan(a);
    }
    public double tanb(){
        return Math.tan(b);
    }
    public double lognata(){
        return Math.log(a);
    }
    public double lognatb(){
        return Math.log(b);
    }
    public double expa(){
        return Math.exp(a);
    }
    public double expb(){
        return Math.exp(b);
    }
    public double logdieza(){
        return Math.log10(a);
    }
    public double logdiezb(){
        return Math.log10(b);
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