package practica_10.filaB;

public class Ministerio {
    String nombre;
    String direccion;
    int nroEmpleados;
    String[][] empleados = new String[100][3]; // [fila][columna] -> [empleado][nombre, apellido1, apellido2]
    int[] edades = new int[100];
    double[] sueldos = new double[100];

    // Constructor por defecto
    public Ministerio() {
        this.nombre = "";
        this.direccion = "";
        this.nroEmpleados = 0;
    }

    // Constructor con parámetros
    public Ministerio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nroEmpleados = 0;
    }

    // Método para agregar empleados
    public void agregarEmpleado(String nombre, String ape1, String ape2, int edad, double sueldo) {
        empleados[nroEmpleados][0] = nombre;
        empleados[nroEmpleados][1] = ape1;
        empleados[nroEmpleados][2] = ape2;
        edades[nroEmpleados] = edad;
        sueldos[nroEmpleados] = sueldo;
        nroEmpleados++;
    }

    // b) Eliminar empleados con edad X
    public void eliminarPorEdad(int x) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == x) {
                for (int j = i; j < nroEmpleados - 1; j++) {
                    empleados[j][0] = empleados[j + 1][0];
                    empleados[j][1] = empleados[j + 1][1];
                    empleados[j][2] = empleados[j + 1][2];
                    edades[j] = edades[j + 1];
                    sueldos[j] = sueldos[j + 1];
                }
                nroEmpleados--;
                i--; // revisar posición nueva
            }
        }
    }

    // c) Transferir empleado con índice X a otro ministerio
    public void transferirEmpleadoA(Ministerio destino, int x) {
        if (x >= 0 && x < nroEmpleados) {
            destino.agregarEmpleado(empleados[x][0], empleados[x][1], empleados[x][2], edades[x], sueldos[x]);

            // Eliminar del actual
            for (int j = x; j < nroEmpleados - 1; j++) {
                empleados[j][0] = empleados[j + 1][0];
                empleados[j][1] = empleados[j + 1][1];
                empleados[j][2] = empleados[j + 1][2];
                edades[j] = edades[j + 1];
                sueldos[j] = sueldos[j + 1];
            }
            nroEmpleados--;
        }
    }

    // d.1) Mostrar empleados con menor edad
    public void mostrarMenorEdad() {
        if (nroEmpleados == 0) return;
        int menor = edades[0];
        for (int i = 1; i < nroEmpleados; i++) {
            if (edades[i] < menor) menor = edades[i];
        }
        System.out.println("Empleados con menor edad (" + menor + " años):");
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == menor) {
                mostrarEmpleado(i);
            }
        }
    }

    // d.2) Mostrar empleados con menor sueldo
    public void mostrarMenorSueldo() {
        if (nroEmpleados == 0) return;
        double menor = sueldos[0];
        for (int i = 1; i < nroEmpleados; i++) {
            if (sueldos[i] < menor) menor = sueldos[i];
        }
        System.out.println("Empleados con menor sueldo (" + menor + " Bs):");
        for (int i = 0; i < nroEmpleados; i++) {
            if (sueldos[i] == menor) {
                mostrarEmpleado(i);
            }
        }
    }

    // Mostrar un solo empleado
    public void mostrarEmpleado(int i) {
        System.out.println("- " + empleados[i][0] + " " + empleados[i][1] + " " + empleados[i][2]
                + " | Edad: " + edades[i] + " | Sueldo: " + sueldos[i]);
    }

    // Mostrar todos los empleados
    public void mostrarTodos() {
        System.out.println("\nMinisterio: " + nombre);
        for (int i = 0; i < nroEmpleados; i++) {
            mostrarEmpleado(i);
        }
    }
}
