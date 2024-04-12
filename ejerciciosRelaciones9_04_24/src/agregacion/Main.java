package agregacion;

public class Main {
    public static void main(String[] args) {
        Empleado e1= new Empleado("Gerente","Jose Gomez");
        Empleado e2= new Empleado("Asistente","Maria Gonzalez");
        Empleado e3= new Empleado("Analista de Sistemas","Luis Echeverria");
        Empleado e4= new Empleado("Tecnico","Mauricio Medina");
        Departamento d1= new Departamento("Recursos Humanos");
        Departamento d2= new Departamento("Inteligencia de Datos");
        d1.addEmpleado(e1);
        d1.addEmpleado(e2);
        d2.addEmpleado(e3);
        d2.addEmpleado(e4);
        Empresa emp= new Empresa("OSAR");
        emp.addDepartamentos(d1);
        emp.addDepartamentos(d2);
        System.out.println("La empresa: "+emp.getNombreEmpresa()+", esta dividido en los departamentos: ");
        for (Departamento departamento: emp.getDepartamentos()){
            System.out.println("- " + departamento.getNombreD());


        }
        for (Departamento departamento : new Departamento[]{d1, d2}) {
            System.out.println("\nEmpleados del departamento de " + departamento.getNombreD() + ":");
            for (Empleado empleado : departamento.getEmpleados()) {
                System.out.println("- " + empleado.getNombre() + ", " + empleado.getCargo());
            }
        }
    }
}
