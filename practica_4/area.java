class Figura {
    public double area(double radio) {  // Círculo
        return Math.PI * radio * radio;
    }

    public double area(int base, int altura) {  // Rectángulo
        return base * altura;
    }

    public double area(double base, double altura) {  // Triángulo
        return (base * altura) / 2;
    }

    public double area(int baseMayor, int baseMenor, double altura) {  // Trapecio
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    public double area(int lado, double apotema) {  // Pentágono
        return (5 * lado * apotema) / 2;
    }
}

public class area {
    public static void main(String[] args) {
        Figura f1 = new Figura();
        Figura f2 = new Figura();
        Figura f3 = new Figura();
        Figura f4 = new Figura();
        Figura f5 = new Figura();

        System.out.println("Área del círculo: " + f1.area(2));
        System.out.println("Área del rectángulo: " + f2.area(4, 6));
        System.out.println("Área del triángulo: " + f3.area(4.0, 6.0));
        System.out.println("Área del trapecio: " + f4.area(6, 4, 5.0));
        System.out.println("Área del pentágono: " + f5.area(5, 3.0));
    }
}
