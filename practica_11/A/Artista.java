package practica_11.A;

class Artista {
    String nombre;
    String ci;
    int añosExperiencia;

    public Artista(String nombre, String ci, int añosExperiencia) {
        this.nombre = nombre;
        this.ci = ci;
        this.añosExperiencia = añosExperiencia;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return nombre + " (" + añosExperiencia + " años)";
    }
}