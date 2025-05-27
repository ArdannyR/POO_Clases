package SistemaCuentasPOO_java.nivel_2;

import SistemaCuentasPOO_java.nivel_1.Cliente;
import SistemaCuentasPOO_java.nivel_1.Cuenta;

public class CuentaNomina extends Cuenta {
    public CuentaNomina(String numeroCuenta, Cliente titular) {
        super(numeroCuenta, titular);
    }

    public void aplicarBeneficioNomina() {
        setSaldo(getSaldo() + 10); // Bono por tener nómina
    }
}