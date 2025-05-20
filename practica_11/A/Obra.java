package practica_11.A;

class Obra {
    String titulo;
    String material;
    Artista a1;
    Artista a2;
    Anuncio anuncio;

    public Obra(String titulo, String material, Artista a1, Artista a2, Anuncio anuncio) {
        this.titulo = titulo;
        this.material = material;
        this.a1 = a1;
        this.a2 = a2;
        this.anuncio = anuncio;
    }

    public Artista getMasExperto() {
        return (a1.getAñosExperiencia() > a2.getAñosExperiencia()) ? a1 : a2;
    }

    public double getPrecioVenta() {
        return anuncio != null ? anuncio.getPrecio() : 0;
    }

    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }
}
