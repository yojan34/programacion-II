package practica_7.juego1;
public class juego {
    private int numeroDeVidas;
    private int record;

    public juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }
    public void reiniciaPartida() {
        System.out.println("Reiniciando partida...");
    }
    public void actualizaRecord() {
        record++;
        System.out.println("Nuevo record: " + record);
    }
    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Te quedan " + numeroDeVidas + " vidas.");
        return numeroDeVidas > 0;
    }
}
