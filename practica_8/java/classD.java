package practica_8.java;

public class classD extends classA {
    public classB b;
    public classD(int x, int y, int z) {
        super(x, z);
        b = new classB(y, z);
    }

    public void incrementaxyz() {
        x++;
        b.y++;
        z++;
    }

    public String toString() {
        return  x + ", " + b.y + ",  " + z;
    }

    
}
