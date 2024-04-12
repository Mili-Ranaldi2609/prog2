package agregacion;

public class Empresa {
    private String nombreEmpresa;
    private Departamento[] departamentos= new Departamento[2];
    private int numDepartamento=0;

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa=nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void addDepartamentos(Departamento departamento) {
        departamentos[numDepartamento]=departamento;
        numDepartamento++;
    }
}
