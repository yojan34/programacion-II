package practica_11.B;

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

    public boolean tieneArtista(String nombre) {
        return a1.getNombre().equals(nombre) || a2.getNombre().equals(nombre);
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public int totalExperiencia() {
        return a1.getAñosExperiencia() + a2.getAñosExperiencia();
    }
}
