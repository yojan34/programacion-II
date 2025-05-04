package practica_10.filaB;

public class Main {
    public static void main(String[] args) {
        // a) Crear 2 objetos
        Ministerio m1 = new Ministerio("Rojo", "Estación Central");
        Ministerio m2 = new Ministerio("Azul", "Av. Prado");

        // Agregar empleados a m1
        m1.agregarEmpleado("Pedro", "Rojas", "Luna", 35, 2500);
        m1.agregarEmpleado("Lucy", "Sosa", "Rios", 43, 3250);
        m1.agregarEmpleado("Ana", "Perez", "Rojas", 26, 2700);
        m1.agregarEmpleado("Saul", "Arce", "Calle", 29, 2500);

        // Mostrar todos
        m1.mostrarTodos();

        // b) Eliminar empleados con edad 
        m1.eliminarPorEdad(43);
        System.out.println("\nDespués de eliminar edad :");
        m1.mostrarTodos();

        // c) Transferir 
        m1.transferirEmpleadoA(m2, 1);
        System.out.println("\nDespués de transferir a m2:");
        m1.mostrarTodos();
        m2.mostrarTodos();

        // d) Mostrar empleados con menor edad y sueldo
        System.out.println("\nMenor edad en m1:");
        m1.mostrarMenorEdad();
        System.out.println("\nMenor sueldo en m1:");
        m1.mostrarMenorSueldo();
    }
}
