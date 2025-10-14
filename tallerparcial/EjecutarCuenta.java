package tallerparcial;

public class EjecutarCuenta {
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria("Ana", 0);
        CuentaBancaria cuenta2 = new CuentaBancaria("Luis", 0);

        cuenta1.depositar(200);
        cuenta1.retirar(500);

        cuenta2.depositar(100);
        cuenta2.retirar(120);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}


