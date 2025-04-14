package practica_7.juego2;
import java.util.Random;
import java.util.Scanner;
public class JuegoAdivinaNumero extends juego{
    private int numeroAAdivinar;
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);}
    public boolean validaNumero( int numero) {
        return numero >= 0 && numero <= 10;}
    public void juega() {
        reiniciaPartida();
        numeroAAdivinar= new Random().nextInt(11);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Adivina el número (0-10): ");
            int intento = scanner.nextInt();
            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                boolean tieneVidas = quitaVida();
                if (!tieneVidas) {
                    System.out.println("¡Se acabaron tus vidas! El número era: " + numeroAAdivinar);
                    break;
                } else if (intento < numeroAAdivinar) {
                    System.out.println("El número a adivinar es mayor.");
                } else {
                    System.out.println("El número a adivinar es menor.");
                }
            }
            
        }
    }
}
