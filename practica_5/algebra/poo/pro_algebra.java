package practica_5.algebra.poo;
public class pro_algebra {
    private double a, b, c;
    public pro_algebra() {
        this.a = 1;
        this.b = 2;
        this.c = 1;}
    public pro_algebra(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }
    public void setC(double c) { this.c = c; }
    public double getDiscriminante() {
        return b * b - 4 * a * c;}
    public double getRaiz1() {
        if (getDiscriminante() < 0) {
            return Double.NaN;}
        return (-b + Math.sqrt(getDiscriminante())) / (2 * a);
    }
    public double getRaiz2() {
        if (getDiscriminante() < 0) {
            return Double.NaN;
        }
        return (-b - Math.sqrt(getDiscriminante())) / (2 * a);
    }
    public String toString() {
        double discriminante = getDiscriminante();
        if (discriminante < 0) {
            return "La ecuación no tiene raíces reales.";
        } else if (discriminante == 0) {
            return "La ecuación tiene una raíz real: " + getRaiz1();
        } else {
            return "La ecuación tiene dos raíces reales: " + getRaiz1() + " y " + getRaiz2();
        }
    }
    public static void main(String[] args) {
        pro_algebra e1 = new pro_algebra();
        System.out.println(e1.toString());
    }
}
