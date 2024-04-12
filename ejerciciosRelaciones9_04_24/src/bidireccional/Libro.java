package bidireccional;
import java.util.List;
import java.util.ArrayList;
public class Libro {
    private String titulo;
    private List<Persona> personas= new ArrayList<>();

    public Libro(String titulo) {
        this.titulo = titulo;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }
}
