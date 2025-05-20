package practica_11.B;

class Artista {
    String nombre;
    String ci;
    int añosExperiencia;

    public Artista(String nombre, String ci, int añosExperiencia) {
        this.nombre = nombre;
        this.ci = ci;
        this.añosExperiencia = añosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    @Override
    public String toString() {
        return nombre + " (" + añosExperiencia + " años)";
    }
}
