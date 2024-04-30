package ejer1;


import java.util.List;
import java.util.ArrayList;
public class Persona {


        protected int dni;
        protected String nombre;
        protected List<Grupo> grupos;




        public Persona(int dni, String nombre) {
            this.dni = dni;
            this.nombre = nombre;
            this.grupos = new ArrayList<>();
        }
        public List<Grupo> getGrupos() {
            return grupos; // suponiendo que 'grupos' es una lista de grupos en la clase Alumno
        }


        public int getDni() {
            return dni;
        }


        public void setDni(int dni) {
            this.dni = dni;
        }


        public String getNombre() {
            return nombre;
        }


        public void finalize() throws Throwable {


        }

    }


