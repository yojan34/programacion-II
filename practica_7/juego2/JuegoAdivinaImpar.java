package practica_7.juego2;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10 && numero % 2 != 0) {
            return true;
        } else {
            System.out.println("Error: Solo se aceptan números impares entre 0 y 10.");
            return false;
        }
    }
}

