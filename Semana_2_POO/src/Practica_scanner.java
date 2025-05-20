import java.util.Scanner;

public class Practica_scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: "); int numero_int = sc.nextInt();
        System.out.print("Ingrese un numero decimal: "); double numero_double = sc.nextDouble(); sc.nextLine();
        System.out.print("Ingrese una cadena de texto: "); String texto = sc.nextLine();

        System.out.println("Datos=> Entero:"+numero_int+"; Decimal:"+numero_double+"; Texto:"+texto);
    }
}