package tallerparcial;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private final double sobregiroLimite = -50.0;

    public CuentaBancaria() {
        this.titular = "";
        this.saldo = 0.0;
    }

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo >= sobregiroLimite ? saldo : sobregiroLimite;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            double nuevoSaldo = saldo - cantidad;
            if (nuevoSaldo >= sobregiroLimite) {
                saldo = nuevoSaldo;
            } else {
                System.out.println("Error, sobrepasas el limite de sobregiro, no se puede retirar en la cuenta de " + titular);
            }
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria [Titular=" + titular + ", Saldo=" + saldo + "]";
    }
}


