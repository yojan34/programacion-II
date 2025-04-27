package practica_9.teatro;

public abstract class Boleto {
    protected int numero;
    protected double precio;

    public Boleto(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Número: " + numero + ", Precio: " + precio;
    }
}
