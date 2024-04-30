package ejer1;

import java.util.ArrayList;
public class Profesor extends Persona {


    private String departamento;
    public ArrayList<Asignatura> m_Asignaturas;


    public Profesor(int dni, String nombre, String departamento) {
        super(dni, nombre);
        this.departamento = departamento;
        this.m_Asignaturas = new ArrayList<>();
    }


    public void addAsignatura(Asignatura asignatura) {
        m_Asignaturas.add(asignatura);
    }
    public void finalize() throws Throwable {
        super.finalize();
    }
}

