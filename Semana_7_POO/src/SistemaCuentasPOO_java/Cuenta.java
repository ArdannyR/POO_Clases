package SistemaCuentasPOO_java;

public class Cuenta {
    protected String numeroCuenta;
    protected double saldo;
    protected Cliente titular;

    public Cuenta(String numeroCuenta, Cliente titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (saldo >= monto) saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}