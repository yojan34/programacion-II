package practica_8.java;

public class app {
    public static void main(String[] args) {
        classD d = new classD(1, 2, 3);
        
        // Imprimir el valor original
        System.out.println("Original XYZ = " + d.toString());
        
        // Incrementar X y Z
        d.incrementaxz();
        System.out.println("Incrementado XZ = " + d.toString());
        
        // Incrementar Y y Z
        d.b.incrementayz();
        d.z = d.b.z;
        System.out.println("Incrementado YZ = " + d.toString());
        
        // Incrementar solo Z
        d.incrementaz();
        d.b.z = d.z;
        System.out.println("Incrementado Z = " + d.toString());
        
        // Incrementar X, Y, Z
        d.incrementaxyz();
        System.out.println("Incrementado XYZ = " + d.toString());
    }
}