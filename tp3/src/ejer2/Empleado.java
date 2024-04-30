package ejer2;

public class Empleado {
    private String name;
    private Empleado supervisor;
    public Empleado(String name) {
        this.name = name;
    }

    public void assignSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }
    public String getSupervisorName() {
        if (supervisor != null) {
            return supervisor.getName();
        } else {
            return "No supervisor";
        }
    }
    public String getName() {
        return name;
    }

}
