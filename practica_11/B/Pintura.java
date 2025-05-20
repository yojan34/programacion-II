package practica_11.B;

class Pintura extends Obra {
    String genero;

    public Pintura(String titulo, String material, Artista a1, Artista a2, Anuncio anuncio, String genero) {
        super(titulo, material, a1, a2, anuncio);
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pintura: " + titulo + ", Material: " + material + ", Género: " + genero + "\n" +
               "  Artistas: " + a1 + ", " + a2 + "\n" +
               "  " + anuncio + "\n";
    }
}