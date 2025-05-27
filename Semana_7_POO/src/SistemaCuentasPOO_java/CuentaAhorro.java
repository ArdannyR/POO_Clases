package SistemaCuentasPOO_java;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres;

    public CuentaAhorro(String numeroCuenta, Cliente titular, double tasaInteres) {
        super(numeroCuenta, titular);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarIntereses() {
        saldo += saldo * tasaInteres;
    }
}