package practica_5.algebra.estructurada;

public class pro_algebra {
    static public double getDiscriminante(double a, double b, double c) {
        return b*b - 4*a*c;
    }

    static public double getRaiz1(double a, double b, double c) {
        return (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
    }
    static public double getRaiz2(double a, double b, double c) {
        return (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
    }

    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 1;

        double discriminante = getDiscriminante(a, b, c);
        if (discriminante < 0) {
            System.out.println("La ecuacion no tiene raices reales");}
        else if (discriminante == 0) {
            System.out.println("La ecuacion tiene una raiz real: " + getRaiz1(a, b, c));}
        else {
            System.out.println("La ecuacion tiene dos raices reales: " + getRaiz1(a, b, c) + " y " + getRaiz2(a, b, c));
        }

    }
}