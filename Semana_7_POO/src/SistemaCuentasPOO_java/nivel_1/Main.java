package SistemaCuentasPOO_java.nivel_1;

import SistemaCuentasPOO_java.nivel_2.EvaluadorDeCuentas;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan", 17, false);
        Cliente cliente2 = new Cliente("Ana", 25, true);
        Cliente cliente3 = new Cliente("Pedro", 40, false);

        Cuenta cuenta1 = EvaluadorDeCuentas.crearCuentaApropiada("001", cliente1);
        Cuenta cuenta2 = EvaluadorDeCuentas.crearCuentaApropiada("002", cliente2);
        Cuenta cuenta3 = EvaluadorDeCuentas.crearCuentaApropiada("003", cliente3);

        cuenta1.depositar(100);
        cuenta2.depositar(200);
        cuenta3.depositar(300);

        System.out.println("Saldo de Juan: " + cuenta1.getSaldo());
        System.out.println("Saldo de Ana: " + cuenta2.getSaldo());
        System.out.println("Saldo de Pedro: " + cuenta3.getSaldo());
    }
}