package ejer4_y_5.ejer4;
import ejer4_y_5.ejer4.Alumno;

import java.util.Iterator;
import java.util.ArrayList;
public class Escuela implements Iterable<Alumno>{
    private ArrayList<Alumno> alumnos;

    public Escuela() {
        alumnos=new ArrayList<>();
    }
    public void addAlumno(Alumno a){
        String nombreMinusculas = a.getName().toLowerCase();
        boolean alumnoRepetido = false;
        for (Alumno alumno : alumnos) {
            if (alumno.getName().toLowerCase().equals(nombreMinusculas)) {
                alumnoRepetido = true;
                break;
            }
        }
        if (!alumnoRepetido) {
            alumnos.add(a);
        } else {
            System.out.println("El alumno ya está en la lista.");
        }
    }
    public int getNumberOfStudents() {
        return alumnos.size();//size() obtiene la cantidad de eleemntos
    }
    @Override
    public Iterator<Alumno> iterator(){
        return alumnos.iterator();
    }

}
