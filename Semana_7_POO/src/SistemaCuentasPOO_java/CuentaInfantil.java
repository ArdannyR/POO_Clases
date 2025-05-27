package SistemaCuentasPOO_java;

public class CuentaInfantil extends Cuenta {
    public CuentaInfantil(String numeroCuenta, Cliente titular) {
        super(numeroCuenta, titular);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Solo los representantes pueden retirar dinero.");
    }
}