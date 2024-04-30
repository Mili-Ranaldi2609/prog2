package ejer1;

public class Asignatura {
    private int aula;
    private String hora;
    public String nombre;
    public Grupo m_Grupo;
    public Asignatura(String nombre, int aula, String hora) {
        this.nombre = nombre;
        this.aula = aula;
        this.hora = hora;
    }
    public int getAula() {
        return aula;
    }
    public String getNombre() {
        return nombre;
    }

    public Grupo getM_Grupo() {
        return m_Grupo;
    }

    public void setM_Grupo(Grupo m_Grupo) {
        this.m_Grupo = m_Grupo;
    }

    public void finalize() throws Throwable {

    }

}