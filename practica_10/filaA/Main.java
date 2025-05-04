package practica_10.filaA;
public class Main {
    public static void main(String[] args) {
        // a) Instanciar 2 objetos
        LineaTeleferico rojo = new LineaTeleferico("Rojo", "Estación Central, Cementerio, 16 de Julio", 20);
        LineaTeleferico azul = new LineaTeleferico(); 
        azul.color = "Azul";
        azul.tramo = "Estación Obrajes, Libertador, Del Libertador";
        azul.nroCabinas = 25;
        // Agregar empleados
        rojo.agregarEmpleado("Pedro", "Rojas", "Luna", 35, 2500);
        rojo.agregarEmpleado("Lucy", "Sosa", "Rios", 43, 3250);
        rojo.agregarEmpleado("Ana", "Perez", "Rojas", 26, 2700);
        rojo.agregarEmpleado("Saul", "Arce", "Calle", 29, 2500);

        // Mostrar empleados
        rojo.mostrarTodos();

        // b) Eliminar por apellido
        rojo.eliminarPorApellido("Rojas");
        System.out.println("\nDespués de eliminar apellido:");
        rojo.mostrarTodos();

        // c) Transferir empleado 1 a otra línea
        rojo.transferirA(azul, 1);
        System.out.println("\nDespués de transferir a línea Azul:");
        rojo.mostrarTodos();
        azul.mostrarTodos();

        // d) Mayor edad y mayor sueldo
        System.out.println("\nMayor edad en línea Roja:");
        rojo.mostrarMayorEdad();
        System.out.println("\nMayor sueldo en línea Roja:");
        rojo.mostrarMayorSueldo();
    }
}
