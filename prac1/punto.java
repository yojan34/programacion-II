import java.lang.Math;
public class punto{
    public float x;
    public float y;
    public punto (float x, float y){
        this.x=x;
        this.y=y;
    }
public float[] cartesianas(){
    return new float[] {x , y} ;
}
public double[] polares(){
    double r = Math.sqrt(x * x + y * y);
    double alpha = Math.atan2(y, x);
    return new double[] {r,alpha};   
}
public String toString() {
    return "Punto(" + x + ", " + y + ")";
}
public static void main(String[] args) {
    punto p1=new punto(3, 4);

    System.out.println("Coordenadas cartesianas:");
    float [] cartesianas = p1.cartesianas();
    System.out.println("(" + cartesianas[0] + ", " + cartesianas[1] + ")");

    System.out.println("Coordenadas polares:");
    double [] polares =p1.polares();
    System.out.println("(" + polares[0] + ", " + polares[1] + ")");

    System.out.println("toString:");
    System.out.println(p1);

}



}
