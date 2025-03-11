package prog_II.practica_2.linea;
import javax.swing.*;
import java.awt.*;

class Linea {
    private final Point p1;
    private final Point p2;

    public Linea(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Línea punto 1: (" + p1.x + ", " + p1.y + ") -> punto 2: (" + p2.x + ", " + p2.y + ")";
    }

    public void dibujaLinea() {
        JFrame frame = new JFrame("Gráfico de Línea");
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
                int scale = 10; 
                int x1 = centerX + p1.x * scale;
                int y1 = centerY - p1.y * scale;
                int x2 = centerX + p2.x * scale;
                int y2 = centerY - p2.y * scale;
                g.drawLine(x1, y1, x2, y2);
            }
        });
        frame.setVisible(true);
    }
}

public class Main{
    public static void main(String[] args) {
        Linea l1 = new Linea(new Point(0, 0), new Point(5, 5));
        System.out.println("toString:");
        System.out.println(l1);
        l1.dibujaLinea();
    }
}
