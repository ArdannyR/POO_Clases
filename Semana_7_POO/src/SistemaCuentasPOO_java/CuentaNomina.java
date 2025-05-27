package SistemaCuentasPOO_java;

public class CuentaNomina extends Cuenta {
    public CuentaNomina(String numeroCuenta, Cliente titular) {
        super(numeroCuenta, titular);
    }

    public void aplicarBeneficioNomina() {
        saldo += 10; // Bono por tener nómina
    }
}