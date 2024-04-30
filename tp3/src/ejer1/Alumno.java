package ejer1;

public class Alumno extends Persona {


    public Alumno(int dni, String nombre) {
        super(dni, nombre);
    }


    public void finalize() throws Throwable {
        super.finalize();
    }


}

