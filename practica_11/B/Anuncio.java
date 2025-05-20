package practica_11.B;
class Anuncio {
    int numero;
    double precio;

    public Anuncio(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }

    public void incrementarPrecio(double monto) {
        this.precio += monto;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Anuncio #" + numero + ", Precio: " + precio;
    }
}