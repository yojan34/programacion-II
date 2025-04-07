package practica_7.juego2;
public class Aplicacion {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

        System.out.println("\n--- Juego 1: Adivina cualquier número ---");
        juego1.juega();

        System.out.println("\n--- Juego 2: Adivina un número PAR ---");
        juego2.juega();

        System.out.println("\n--- Juego 3: Adivina un número IMPAR ---");
        juego3.juega();
    }
}