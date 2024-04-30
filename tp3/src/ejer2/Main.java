package ejer2;

public class Main {
    public static void main(String[] args) {
        Empleado employee1 = new Empleado("Marcos");
        Empleado employee2 = new Empleado("Lucia");

        employee2.assignSupervisor(employee1);
        System.out.println("The supervisor of " + employee1.getName() + " is: " + employee1.getSupervisorName());
    }

}
