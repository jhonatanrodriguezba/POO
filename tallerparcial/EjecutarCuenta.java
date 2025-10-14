package tallerparcial;

public class EjecutarCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Ana", 500);
        CuentaBancaria cuenta2 = new CuentaBancaria("Luis", -100);

        cuenta1.depositar(200);
        cuenta1.retirar(150);

        cuenta2.depositar(300);
        cuenta2.retirar(50);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}


