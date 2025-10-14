package tallerparcial;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria() {
        this.titular = "";
        this.saldo = 0.0;
    }

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo >= 0 ? saldo : 0.0;
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
            saldo -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria [Titular=" + titular + ", Saldo=" + saldo + "]";
    }
}


