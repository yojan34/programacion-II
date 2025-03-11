
import javax.swing.*;
import java.awt.*;

class Circulo {
    private final Point centro;
    private final float radio;

    public Circulo(Point centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia con centro en (" + centro.x + ", " + centro.y + ") y radio " + radio;
    }

    public void dibujaCirculo() {
        JFrame frame = new JFrame("Gráfico de Círculo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int width = getWidth();
                int height = getHeight();
                int centerX = width / 2;
                int centerY = height / 2;

                g.setColor(Color.LIGHT_GRAY);
                g.drawLine(centerX, 0, centerX, height);
                g.drawLine(0, centerY, width, centerY);

                g.setColor(Color.BLACK);
                float scale = 10;
                int x = Math.round(centerX + centro.x * scale);
                int y = Math.round(centerY - centro.y * scale);
                int diameter = Math.round(2 * radio * scale);
                g.drawOval(x - diameter / 2, y - diameter / 2, diameter, diameter);
            }
        });
        frame.setVisible(true);
    }
}

public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(new Point(0, 0), 5);
        System.out.println("toString:");
        System.out.println(c1);
        c1.dibujaCirculo();
    }
}
