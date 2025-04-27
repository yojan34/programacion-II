package practica_9.teatro;

public class Galeria extends Platea {
    public Galeria(int numero, int diasAnticipacion) {
        super(numero, diasAnticipacion);
        if (diasAnticipacion >= 10) {
            this.precio = 25.0;
        } else {
            this.precio = 30.0;
        }
    }
}