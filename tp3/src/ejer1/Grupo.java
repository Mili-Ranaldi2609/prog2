package ejer1;

public class Grupo {
    private String Curso;
    private char Letra;
    public Alumno m_Alumno;
    private Asignatura asignatura;


    public Grupo(String curso, char letra,Asignatura asignatura) {
        this.Curso = curso;
        this.Letra = letra;
        this.asignatura = asignatura;
    }
    public Asignatura getM_Asignatura() {
        return asignatura;
    }
    public void finalize() throws Throwable {


    }
}
