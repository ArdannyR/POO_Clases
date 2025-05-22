package herencias.nivel_1;

import herencias.nivel_2.Docente;
import herencias.nivel_2.Estudiante;
import herencias.nivel_3.Docente_Linea;
import herencias.nivel_3.Estudiante_Presencial;
import herencias.nivel_3.Estudiante_Virtual;

public class Main {
    public static void main(String[] args) {
        //Con abstract no se pueden crear instancias
        //No todas las clases pueden ser heredadas (Las finales/selladas y las privadas) Las que si se pueden heredar son publicas o proteguidas

        Estudiante estudiante_1 = new Estudiante("1004350276","Ardanny","Quito","arda@mail.com","099560555024","Desarollo de software","3ro");
        System.out.println("\n*-----------Estudiante base-----------*");
        estudiante_1.mostrar_info();

        Estudiante_Presencial estudiante_presencial = new Estudiante_Presencial("173859305","Alex","Conocoto","alex@mail.com","0996354205","Electromecanica","2do","Matutino",7);
        System.out.println("\n*---------Estudiante presencial---------*");
        estudiante_presencial.mostrar_info();
        estudiante_presencial.calculo_de_edad(2003);

        Estudiante_Virtual estudiante_virtual = new Estudiante_Virtual("1004350723","Charley","Quito","charley@mail.com","0996465663","Quimica","5to","teams","Jhonny");
        System.out.println("\n*---------Estudiante virtual---------*");
        estudiante_virtual.mostrar_info();
        estudiante_virtual.mostrar_edad(2005);

        Docente docente_1 = new Docente("1726934206","Esau","Otavalo","esau@mail.com","0995492612","Sistemas",6);
        System.out.println("\n*---------------Docente ---------------*");
        docente_1.mostrar_info();

        Docente_Linea docente_2 = new Docente_Linea("1750428771","Ana","Quitumbe","ana@mail.com","Medicina",4,"fijo");
        System.out.println("\n*-------------Docente Linea-------------*");
        docente_2.mostrar_info();
    }
}