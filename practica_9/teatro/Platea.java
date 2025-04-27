package practica_9.teatro;

public class Platea extends Boleto {
    public Platea(int numero, int diasAnticipacion) {
        super(numero);
        if (diasAnticipacion >= 10) {
            this.precio = 50.0;
        } else {
            this.precio = 60.0;
        }
    }
}
