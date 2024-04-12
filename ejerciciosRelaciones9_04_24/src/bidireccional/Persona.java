package bidireccional;
import java.util.List;
import java.util.ArrayList;
public class Persona {
    private String nombre;
    private List<Libro> libros= new ArrayList<>();

    public Persona(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        libro.agregarPersona(this);
    }
}
