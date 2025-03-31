package practica_6;
class AlgebraVectorial {
    private double x, y, z;

    public AlgebraVectorial(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }
    public boolean esPerpendicular(AlgebraVectorial b) {
        return (this.x * b.x + this.y * b.y + this.z * b.z) == 0;
    }
    public boolean esPerpendicular(AlgebraVectorial b, boolean condicion) {
        if (condicion) {
            return (Math.abs(this.x + b.x) == Math.abs(this.y - b.y));}
        return false;
    }
    public boolean esParalelo(AlgebraVectorial b) {
        return (this.x * b.y == this.y * b.x) && (this.y * b.z == this.z * b.y);
    }
    public boolean esParalelo(AlgebraVectorial b, boolean condicion) {
        if (condicion) {
            return this.x / b.x == this.y / b.y && this.z == b.z;}
        return false;
    }
    public AlgebraVectorial proyeccionSobre(AlgebraVectorial b) {
        double factor = (this.x * b.x + this.y * b.y + this.z * b.z) / 
                        (b.x * b.x + b.y * b.y + b.z * b.z);
        return new AlgebraVectorial(factor * b.x, factor * b.y, factor * b.z);
    }
    public double componenteEn(AlgebraVectorial b) {
        double modB = Math.sqrt(b.x * b.x + b.y * b.y + b.z * b.z);
        return (this.x * b.x + this.y * b.y + this.z * b.z) / modB;
    }
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(3, 4, 0);
        AlgebraVectorial b = new AlgebraVectorial(6, 8, 0);
        System.out.println("Perpendicular: " + a.esPerpendicular(b));
        System.out.println("Perpendicular con condición: " + a.esPerpendicular(b, true));
        System.out.println("Paralelo: " + a.esParalelo(b));
        System.out.println("Paralelo con condición: " + a.esParalelo(b, true));
        System.out.println("Proyección sobre b: " + a.proyeccionSobre(b));
        System.out.println("Componente en b: " + a.componenteEn(b));
    }
}
