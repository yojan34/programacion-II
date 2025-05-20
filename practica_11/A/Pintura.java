package practica_11.A;

class Pintura extends Obra {
    String genero;

    public Pintura(String titulo, String material, Artista a1, Artista a2, Anuncio anuncio, String genero) {
        super(titulo, material, a1, a2, anuncio);
        this.genero = genero;
    }
     public String toString() {
        return "Título: " + titulo + ", Material: " + material + ", Género: " + genero +
               "\n  Artistas: " + a1 + " y " + a2 +
               "\n  " + (anuncio != null ? anuncio : "Sin anuncio") + "\n";
    }
}
