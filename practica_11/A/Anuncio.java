package practica_11.A;
class Anuncio {
    int numero;
    double precio;

    public Anuncio(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String toString() {
        return "Anuncio #" + numero + ", Precio: " + precio;
    }
}