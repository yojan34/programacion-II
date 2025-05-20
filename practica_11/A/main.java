package practica_11.A;

public class main {
    public static void main(String[] args) {
        Artista art1 = new Artista("Carlos", "123", 12);
        Artista art2 = new Artista("Lucía", "124", 15);
        Anuncio an1 = new Anuncio(1, 5000);
        Pintura p1 = new Pintura("Paisaje", "Óleo", art1, art2, an1, "Realismo");

        Artista art3 = new Artista("Miguel", "125", 10);
        Artista art4 = new Artista("Ana", "126", 8);
        Pintura p2 = new Pintura("Retrato", "Acrílico", art3, art4, null, "Retrato");

        System.out.println("Pintura 1:\n" + p1);
        System.out.println("Pintura 2:\n" + p2);

        Artista mejor1 = p1.getMasExperto();
        Artista mejor2 = p2.getMasExperto();
        Artista masExperto = (mejor1.getAñosExperiencia() > mejor2.getAñosExperiencia()) ? mejor1 : mejor2;
        System.out.println("Artista con más experiencia: " + masExperto.getNombre());

        Anuncio an2 = new Anuncio(2, 3000);
        p2.setAnuncio(an2);
        double total = p1.getPrecioVenta() + p2.getPrecioVenta();
        System.out.println("Monto total de venta: " + total);
    }
}
