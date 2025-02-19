import java.lang.Math;
public class punto{
    public float x;
    public float y;
    public punto (float x, float y){
        this.x=x;
        this.y=y;
    }
public float[] coor_cartesianas(){
    return new float[] {x , y} ;
}
public double[] coor_polares(){
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
    float [] coor_cartesianas = p1.coor_cartesianas();
    System.out.println("(" + coor_cartesianas[0] + ", " + coor_cartesianas[1] + ")");

    System.out.println("Coordenadas polares:");
    double [] coor_polares =p1.coor_polares();
    System.out.println("(" + coor_polares[0] + ", " + coor_polares[1] + ")");

    System.out.println("toString:");
    System.out.println(p1);

}
}
