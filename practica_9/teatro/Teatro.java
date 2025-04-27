package practica_9.teatro;
import java.util.Scanner;
public class Teatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese tipo de boleto (1=Palco, 2=Platea, 3=Galería): ");
        int tipo = sc.nextInt();

        System.out.print("Ingrese número de boleto: ");
        int numero = sc.nextInt();

        Boleto boleto = null;

        if (tipo == 1) {
            boleto = new Palco(numero);
        } else if (tipo == 2) {
            System.out.print("Ingrese días de anticipación: ");
            int dias = sc.nextInt();
            boleto = new Platea(numero, dias);
        } else if (tipo == 3) {
            System.out.print("Ingrese días de anticipación: ");
            int dias = sc.nextInt();
            boleto = new Galeria(numero, dias);
        } else {
            System.out.println("Tipo de boleto inválido.");
            System.exit(0);
        }

        System.out.println(boleto);

        sc.close();
    }
}