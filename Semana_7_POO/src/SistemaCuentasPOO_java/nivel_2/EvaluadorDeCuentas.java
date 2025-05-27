package SistemaCuentasPOO_java.nivel_2;

import SistemaCuentasPOO_java.nivel_1.Cliente;
import SistemaCuentasPOO_java.nivel_1.Cuenta;

public class EvaluadorDeCuentas {
    public static Cuenta crearCuentaApropiada(String numeroCuenta, Cliente cliente) {
        if (cliente.getEdad() < 18) {
            return new CuentaInfantil(numeroCuenta, cliente);
        } else if (cliente.getEdad() >= 18 && cliente.getEdad() <= 31) {
            return new CuentaCorriente(numeroCuenta, cliente);
        } else if (cliente.tieneNomina()) {
            return new CuentaNomina(numeroCuenta, cliente);
        } else {
            return new CuentaAhorro(numeroCuenta, cliente, 0.02);
        }
    }
}