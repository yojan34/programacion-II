package practica_9.objColoreados;
public abstract class Figura {
    protected String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Color: " + color;
    }

    public abstract double area();
    public abstract double perimetro();
}