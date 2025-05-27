package SistemaCuentasPOO_java.nivel_2;

import SistemaCuentasPOO_java.nivel_1.Cliente;
import SistemaCuentasPOO_java.nivel_1.Cuenta;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(String numeroCuenta, Cliente titular) {
        super(numeroCuenta, titular);
    }
}