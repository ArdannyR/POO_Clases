package Cocinero; //By: Ardanny Romero

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        //Esta parte es sin usar el metodo de pedir en main
        //Cocinero 1
        System.out.print("------------------------\nIntroduzca el nombre: "); String nombre_1 = sc.nextLine();
        System.out.print("Introduzca los años de experiencia: "); int experiencia_1 = sc.nextInt(); sc.nextLine();
        System.out.print("Introduzca su especialidad: "); String especialidad_1 = sc.nextLine();
        Cocinero chef_1 = new Cocinero(nombre_1, experiencia_1, especialidad_1);
        chef_1.mostrar_inofrmacion();

        //Cocinero 2
        System.out.print("------------------------\nIntroduzca el nombre: "); String nombre_2 = sc.nextLine();
        System.out.print("Introduzca los años de experiencia: "); int experiencia_2 = sc.nextInt(); sc.nextLine();
        System.out.print("Introduzca su especialidad: "); String especialidad_2 = sc.nextLine();
        Cocinero chef_2 = new Cocinero(nombre_2, experiencia_2, especialidad_2);
        chef_2.mostrar_inofrmacion();

        //Cocinero 3
        System.out.print("------------------------\nIntroduzca el nombre: "); String nombre_3 = sc.nextLine();
        System.out.print("Introduzca los años de experiencia: "); int experiencia_3 = sc.nextInt(); sc.nextLine();
        System.out.print("Introduzca su especialidad: "); String especialidad_3 = sc.nextLine();
        Cocinero chef_3 = new Cocinero(nombre_3, experiencia_3, especialidad_3);
        chef_3.mostrar_inofrmacion();
        */

        //Esta parte es usando el metodo de pedir en main
        //Cocinero 1
        Cocinero chef_1 = Cocinero.pedir_datos_cocinero(sc);
        chef_1.mostrar_inofrmacion();

        //Cocinero 2
        Cocinero chef_2 = Cocinero.pedir_datos_cocinero(sc);
        chef_2.mostrar_inofrmacion();

        //Cocinero 3
        Cocinero chef_3 = Cocinero.pedir_datos_cocinero(sc);
        chef_3.mostrar_inofrmacion();
    }
}