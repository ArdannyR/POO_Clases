package SistemaCuentasPOO_java.nivel_2;

import SistemaCuentasPOO_java.nivel_1.Cliente;
import SistemaCuentasPOO_java.nivel_1.Cuenta;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres;

    public CuentaAhorro(String numeroCuenta, Cliente titular, double tasaInteres) {
        super(numeroCuenta, titular);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarIntereses() {
        setSaldo(getSaldo() + (getSaldo() * tasaInteres));
    }
}