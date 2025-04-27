package practica_9.objColoreados;

import java.util.Random;

public class TestFiguras {
    public static void main(String[] args) {
        Random random = new Random();
        Figura[] figuras = new Figura[5];

        for (int i = 0; i < figuras.length; i++) {
            int tipo = random.nextInt(2) + 1; 
            if (tipo == 1) { 
                double lado = 1 + random.nextDouble() * 9;
                figuras[i] = new Cuadrado(lado);
                figuras[i].setColor("Rojo");
            } else { 
                double radio = 1 + random.nextDouble() * 9; 
                figuras[i] = new Circulo(radio);
                figuras[i].setColor("Azul");
            }
        }

        for (Figura f : figuras) {
            System.out.println(f);
            System.out.printf("Área: %.2f\n", f.area());
            System.out.printf("Perímetro: %.2f\n", f.perimetro());

            if (f instanceof Coloreado) {
                Coloreado c = (Coloreado) f;
                System.out.println(c.comoColorear());
            }
            System.out.println("--------------------------");
        }
    }
}
