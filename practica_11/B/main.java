package practica_11.B;

public class main {
    public static void main(String[] args) {

        Artista a1 = new Artista("Ximena", "123", 10);
        Artista a2 = new Artista("Carlos", "456", 12);
        Anuncio an1 = new Anuncio(101, 3000);
        Pintura p1 = new Pintura("Montaña", "Óleo", a1, a2, an1, "Paisaje");

        Artista a3 = new Artista("Lucía", "789", 8);
        Artista a4 = new Artista("Fernando", "321", 14);
        Anuncio an2 = new Anuncio(102, 3500);
        Pintura p2 = new Pintura("Rostro", "Acrílico", a3, a4, an2, "Retrato");

        System.out.println("PINTURA 1:\n" + p1);
        System.out.println("PINTURA 2:\n" + p2);

        int totalExp = p1.a1.getAñosExperiencia() + p1.a2.getAñosExperiencia() +
                       p2.a1.getAñosExperiencia() + p2.a2.getAñosExperiencia();
        double promedio = totalExp / 4.0;
        System.out.println("Promedio de experiencia: " + promedio);

        String nombreBuscado = "Lucía";
        double incremento = 500;

        if (p1.tieneArtista(nombreBuscado)) {
            p1.getAnuncio().incrementarPrecio(incremento);
        }
        if (p2.tieneArtista(nombreBuscado)) {
            p2.getAnuncio().incrementarPrecio(incremento);
        }

        System.out.println("Precio actualizado de P1: " + p1.getAnuncio().getPrecio());
        System.out.println("Precio actualizado de P2: " + p2.getAnuncio().getPrecio());
    }
}
