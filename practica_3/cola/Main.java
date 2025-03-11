import java.util.Arrays;

class Cola {
    private int n;
    private int[] arreglo;
    private int inicio;
    private int fin;
    private int nroElementos;

    public Cola(int n) {
        this.n = n;
        this.arreglo = new int[n];
        this.inicio = 0;
        this.fin = -1;
        this.nroElementos = 0;
    }

    public void insert(int e) {
        if (!isFull()) {
            if (fin == n - 1) {
                fin = -1;
            }
            fin++;
            arreglo[fin] = e;
            nroElementos++;
        } else {
            System.out.println("Cola llena.");
        }
    }

    public int remove() {
        int e = -1;
        if (!isEmpty()) {
            e = arreglo[inicio];
            inicio++;
            if (inicio == n) {
                inicio = 0;
            }
            nroElementos--;
        } else {
            System.out.println("Cola vacía.");
        }
        return e;
    }

    public int peek() {
        if (!isEmpty()) {
            return arreglo[inicio];
        } else {
            System.out.println("Cola vacía.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return nroElementos == 0;
    }

    public boolean isFull() {
        return nroElementos == n;
    }

    public int size() {
        return nroElementos;
    }
}

public class Main {
    static int num = 500;
    static boolean[] primo = new boolean[num];

    public static void criba() {
        Arrays.fill(primo, true);
        for (int i = 2; i * i < num; i++) {
            if (primo[i]) {
                for (int j = i * i; j < num; j += i) {
                    primo[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        criba();
        
        Cola A = new Cola(5);
        A.insert(7);
        A.insert(22);
        A.insert(11);
        A.insert(10);

        Cola B = new Cola(5);
        Cola C = new Cola(5);

        while (!A.isEmpty()) {
            int e = A.remove();
            if (primo[e]) {
                B.insert(e);
            } else {
                C.insert(e);
            }
        }

        System.out.println("Cola B:");
        while (!B.isEmpty()) {
            System.out.println(B.remove());
        }

        System.out.println("Cola C:");
        while (!C.isEmpty()) {
            System.out.println(C.remove());
        }
    }
}
