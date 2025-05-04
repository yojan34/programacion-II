package practica_10.filaA;
public class LineaTeleferico {
    String color;
    String tramo;
    int nroCabinas;
    int nroEmpleados;
    String[][] empleados = new String[100][3]; // [nombre, apellido1, apellido2]
    int[] edades = new int[100];
    double[] sueldos = new double[100];
    public LineaTeleferico() {
        this.color = "";
        this.tramo = "";
        this.nroCabinas = 0;
        this.nroEmpleados = 0;
    }
    public LineaTeleferico(String color, String tramo, int nroCabinas) {
        this.color = color;
        this.tramo = tramo;
        this.nroCabinas = nroCabinas;
        this.nroEmpleados = 0;
    }
    public void agregarEmpleado(String nombre, String ape1, String ape2, int edad, double sueldo) {
        empleados[nroEmpleados][0] = nombre;
        empleados[nroEmpleados][1] = ape1;
        empleados[nroEmpleados][2] = ape2;
        edades[nroEmpleados] = edad;
        sueldos[nroEmpleados] = sueldo;
        nroEmpleados++;
    }
    public void eliminarPorApellido(String apellido) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[i][1].equals(apellido) || empleados[i][2].equals(apellido)) {
                for (int j = i; j < nroEmpleados - 1; j++) {
                    empleados[j][0] = empleados[j + 1][0];
                    empleados[j][1] = empleados[j + 1][1];
                    empleados[j][2] = empleados[j + 1][2];
                    edades[j] = edades[j + 1];
                    sueldos[j] = sueldos[j + 1];
                }
                nroEmpleados--;
                i--;
            }
        }
    }

    public void transferirA(LineaTeleferico destino, int x) {
        if (x >= 0 && x < nroEmpleados) {
            destino.agregarEmpleado(
                empleados[x][0], empleados[x][1], empleados[x][2], edades[x], sueldos[x]
            );
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
    public void mostrarMayorEdad() {
        if (nroEmpleados == 0) return;
        int mayor = edades[0];
        for (int i = 1; i < nroEmpleados; i++) {
            if (edades[i] > mayor) mayor = edades[i];
        }
        System.out.println("Empleados con mayor edad (" + mayor + " años):");
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == mayor) mostrarEmpleado(i);
        }
    }
    public void mostrarMayorSueldo() {
        if (nroEmpleados == 0) return;
        double mayor = sueldos[0];
        for (int i = 1; i < nroEmpleados; i++) {
            if (sueldos[i] > mayor) mayor = sueldos[i];
        }
        System.out.println("Empleados con mayor sueldo (" + mayor + " Bs):");
        for (int i = 0; i < nroEmpleados; i++) {
            if (sueldos[i] == mayor) mostrarEmpleado(i);
        }
    }
    public void mostrarEmpleado(int i) {
        System.out.println(empleados[i][0] + " " + empleados[i][1] + " " + empleados[i][2]
            + " | Edad: " + edades[i] + " | Sueldo: " + sueldos[i]);
    }
    public void mostrarTodos() {
        System.out.println("\nLínea: " + color + " - Tramo: " + tramo);
        for (int i = 0; i < nroEmpleados; i++) {
            mostrarEmpleado(i);
        }
    }
}
