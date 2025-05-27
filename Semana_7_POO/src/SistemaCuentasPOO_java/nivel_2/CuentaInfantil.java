package SistemaCuentasPOO_java.nivel_2;

import SistemaCuentasPOO_java.nivel_1.Cliente;
import SistemaCuentasPOO_java.nivel_1.Cuenta;

public class CuentaInfantil extends Cuenta {
    public CuentaInfantil(String numeroCuenta, Cliente titular) {
        super(numeroCuenta, titular);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Solo los representantes pueden retirar dinero.");
    }
}