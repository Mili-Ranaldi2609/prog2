package agregacion;

public class Departamento {
    private String nombreD;
    private Empleado[] empleados= new Empleado[2];
    private int numEmpleado=0;

    public Departamento(String nombreD) {
        this.nombreD = nombreD;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void addEmpleado(Empleado empleado){
        empleados[numEmpleado]=empleado;
        numEmpleado++;
    }
}
