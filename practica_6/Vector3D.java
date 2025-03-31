package practica_6;
public class Vector3D {
    private double x, y, z;
    public Vector3D(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;}
    public Vector3D add(Vector3D v) {
        return new Vector3D(x + v.x, y + v.y, z + v.z); }
    public Vector3D multiply(double r) {
        return new Vector3D(r * x, r * y, r * z); }
    public double norm() {
        return Math.sqrt(x * x + y * y + z * z); }
    public Vector3D normalize() {
        double n = norm();
        return (n != 0) ? new Vector3D(x / n, y / n, z / n) : new Vector3D(0, 0, 0);}
    public double dotProduct(Vector3D v) {
        return x * v.x + y * v.y + z * v.z;}
    public Vector3D crossProduct(Vector3D v) {
        return new Vector3D(y * v.z - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x);}
    public void display() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");}
    public static void main(String[] args) {
        // Crear los vectores
        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, 5, 6);
        // Operaciones con los vectores sin sobrecarga
        Vector3D sum = a.add(b);
        Vector3D scalarProduct = a.multiply(2);
        double normA = a.norm();
        Vector3D normalizedA = a.normalize();
        double dotProduct = a.dotProduct(b);
        Vector3D crossProduct = a.crossProduct(b);
        // Mostrar resultados
        System.out.print("Suma: ");
        sum.display();
        System.out.print("Multiplicación por escalar: ");
        scalarProduct.display();
        System.out.println("Norma de a: " + normA);
        System.out.print("Normalización de a: ");
        normalizedA.display();
        System.out.println("Producto escalar: " + dotProduct);
        System.out.print("Producto vectorial: ");
        crossProduct.display();
    }
}
