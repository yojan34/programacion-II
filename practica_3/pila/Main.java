import java.util.Stack;

class Pila {
    private Stack<Integer> arreglo;

    public Pila() {
        this.arreglo = new Stack<>();
    }

    public void push(int e) {
        arreglo.push(e);
    }

    public int pop() {
        if (!isEmpty()) {
            return arreglo.pop();
        } else {
            System.out.println("Pila vacía.");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return arreglo.peek();
        } else {
            System.out.println("Pila vacía.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return arreglo.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        Pila A = new Pila();
        A.push(7);
        A.push(22);
        A.push(13);
        A.push(44);

        Pila B = new Pila();
        Pila C = new Pila();

        while (!A.isEmpty()) {
            int e = A.pop();
            if (e % 2 == 0) {
                B.push(e);
            } else {
                C.push(e);
            }
        }

        System.out.println("Pila B:");
        while (!B.isEmpty()) {
            System.out.println(B.pop());
        }

        System.out.println("Pila C:");
        while (!C.isEmpty()) {
            System.out.println(C.pop());
        }
    }
}
